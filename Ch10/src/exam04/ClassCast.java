package exam04;

public class ClassCast {

	public static void main(String[] args) throws Exception {
		Cat cat = new Cat();
		//ChangeDog(cat);
		Method();

	System.out.println("Program is running.");
}
	
	public static void ChangeDog(Animal animal) {
		Dog dog = (Dog)animal;
	}
	
	public static void Method() throws NumberFormatException{
		System.out.println("Hi");
	}

}
