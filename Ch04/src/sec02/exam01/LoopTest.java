package sec02.exam01;

public class LoopTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
//		while(choice != 1 && choice != 3) 
//		{
//		
//			System.out.println("=============");
//			System.out.println("Play Game : 1");
//			System.out.println("Quit Game : 3");
//			System.out.println("=============");
//		
//			choice = scan.nextInt();
//		}

		do {
			System.out.println("=============");
			System.out.println("Play Game : 1");
			System.out.println("Quit Game : 3");
			System.out.println("=============");
		
			choice = scan.nextInt();
		} while(choice != 1 && choice != 3);
	}

}