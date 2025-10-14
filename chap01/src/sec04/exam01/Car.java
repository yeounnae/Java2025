package sec04.exam01;

public class Car {
	int gas;
	int minGas;	//한바퀴 돌 때 필요한 Gas
	String teamName;
	String color;
	static int numberOfCars;
	
	Car(int gas, int minGas, String teamName, String color) {
		this.gas = gas;
		this.minGas = minGas;
		this.teamName = teamName;
		this.color = color;
		numberOfCars++;
		
	}
	boolean IsLeftGas() {
		if(gas < minGas) {
			System.out.println("Need Fuel.");
			return false;
			
		}
		System.out.println("Can run one more.");
		return true;
	}
	void AddGas(int gas) {
		System.out.println("Full Tank.");
		this.gas = gas;
	}
	void RunOneRound()
	{
		System.out.println("One round done.");
	this.gas -= minGas;
	}
	
	static void showNumberofCars()
	{
		System.out.println("Number of Cars : " +numberOfCars);
	}
	
	
//	int Plus(int a, int b) {	//1
//		return a + b;
//	}
//	int Plus(int a) {
//		return a++;
//	}
//	
//	double Plus (double b, int a) {	//2
//		return a + b;
//	}
//	double Plus (int b, double a) {	//3
//		return a + b;
//	}
}