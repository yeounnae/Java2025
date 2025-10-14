package sec04.exam01;

public class Main {

	public static void main(String[] args) {
		int gasTank = 100;
		int minGas = 20;
		int numOfRounds = 20;
		Car hyundai = new Car(gasTank, minGas, "Hyundai", "yellow");
		int numOfRound = 0;
		while(numOfRound < numOfRounds) {
			numOfRound++;
			if(hyundai.IsleftGas()) {
				hyundai.RunOneRound();
			}
			else {
				hyundai.AddGas(gasTank);
			}
		}
		
		hyundai.ShowNumberOfCars();
		Car cl = new Car(1, 1, "", "");
		Car c2 = new Car(1, 1, "", "");
		Car c3 = new Car(1, 1, "", "");
		Car c4 = new Car(1, 1, "", "");
		hyundai.ShowNumberOfCars();
		
		Car.ShowNumberOfCars();
		
//		hyundai.Plus(1,0);
//		hyundai.Plus(1.0,2.0);
//		hyundai.Plus(1,2.0);
//		hyundai.Plus(10);
	}

}
