package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Assignment1{

    // Database credentials
    static final String DB_URL = "jdbc:mysql://localhost:3306/employee_management"; // Replace with your DB URL
    static final String DB_USER = "root"; // Replace with your DB username
    static final String DB_PASS = "laharika@123"; // Replace with your DB password

    public static void main(String[] args) {
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== Employee Management System =====");
            System.out.println("1. Add a new employee");
            System.out.println("2. Update employee details");
            System.out.println("3. Delete an employee");
            System.out.println("4. Display all employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    addEmployee(scanner);
                    break;
                case 2:
                    updateEmployee(scanner);
                    break;
                case 3:
                    deleteEmployee(scanner);
                    break;
                case 4:
                    displayAllEmployees();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    // Method to add a new employee
    public static void addEmployee(Scanner scanner) {
    	 
    	System.out.print("Enter employee id: ");
         int id = scanner.nextInt();
       
         System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter employee department: ");
        String department = scanner.nextLine();
       
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        String insertSQL = "INSERT INTO employees (id,name,department  ,salary ) VALUES (?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
        	 preparedStatement.setInt(1, id);
             preparedStatement.setString(2, name);
             preparedStatement.setString(3, department);
            preparedStatement.setDouble(4, salary);

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new employee was added successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    // Method to update an employee detail
    public static void updateEmployee(Scanner scanner) {
        System.out.print("Enter employee ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        System.out.print("Enter the column you want to update (id, name,  department, salary): ");
        String column = scanner.nextLine();

        System.out.print("Enter the new value: ");
        String newValue = scanner.nextLine();

        // Build the update SQL dynamically
        String updateSQL = "UPDATE employees SET " +column+  " = ? WHERE id = ?";
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {

            preparedStatement.setString(1, newValue);
            preparedStatement.setInt(2, id);

            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee details updated successfully.");
            } else {
                System.out.println("No employee found with the given ID.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    // Method to delete an employee
    public static void deleteEmployee(Scanner scanner) {
        System.out.print("Enter employee ID to delete: ");
        int employeeId = scanner.nextInt();

        String deleteSQL = "DELETE FROM employees WHERE employee_id = 1050";
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {

            preparedStatement.setInt(1, employeeId);
            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Employee deleted successfully.");
            } else {
                System.out.println("No employee found with the given ID.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to display all employees
    public static void displayAllEmployees() {
        String selectSQL = "SELECT * FROM employees";
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
             
        		ResultSet rs = preparedStatement.executeQuery()) {

            System.out.println("Employee List:");
            System.out.println("ID | Name | Department | Salary  ");
            System.out.println("-------------------------------------");
            while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String department = rs.getString(3);
				Double salary = rs.getDouble(4);
				System.out.println("ID : " +id);
				System.out.println("First Name : " +name);
				System.out.println("Department : " + department);
				System.out.println("Double :" +salary);
           
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
