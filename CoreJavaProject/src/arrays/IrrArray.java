package arrays;

public class IrrArray {

	public static void main(String[] args) {
		// declare a irregular 2 dimension array
		int[][] irrArray = new int[4][];
		irrArray[0] = new int[3];
		irrArray[1] = new int[1];
		irrArray[2] = new int[3];
		irrArray[3] = new int[2];
		
		// assign values
		irrArray[0][0] = 60;
		irrArray[0][1] = 70;
		irrArray[0][2] = 80;
		irrArray[1][0] = 20;
		irrArray[2][0] = 40;
		irrArray[2][1] = 50;
		irrArray[2][2] = 10;
		irrArray[3][0] = 90;
		irrArray[3][1] = 20;
		
		// traverse an irregular 2 dimensional array
		for(int i=0;i<irrArray.length;i++) {
			for(int j=0;j<irrArray[i].length;j++) {
				System.out.print(irrArray[i][j] + "    ");
			}
			System.out.println();
		}
		
		// initializing a irregular 2d array
		int[][] irrArray1 = {{1,2},{5},{6,8,2},{3,6}};
	}

}