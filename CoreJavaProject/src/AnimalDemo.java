
public class AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		System.out.println(animal.breath());
		System.out.println(animal.mobility());
		System.out.println("-------------------");
		Dog dog = new Dog();
		System.out.println(animal.breath());
		System.out.println(dog.friendly());
		System.out.println(dog.mobility());
		System.out.println("-------------------");
		Snake snake = new Snake();
		System.out.println(animal.breath());
		System.out.println(snake.attack());
		System.out.println(snake.mobility());
}
}