package sec04.exam01;

public class Main {

	public static void main(String[] args) {
		int gasTank = 100;
		int minGas = 20;
		int numOfRounds = 20;
		
		Car hyundai = new Car(gasTank, minGas, "Hyundai", "yellow");
		
		int numOfRound = 0;
		while(numOfRound < numOfRounds)
		{
			numOfRound++;
			
			if(hyundai.IsLeftGas()) {
				hyundai.RunOneRound();
			
			}
			else {
				hyundai.AddGas(gasTank);
			}
		}
//		hyundai.Plus(1, 2);
//		hyundai.Plus(1.0, 2);
//		hyundai.Plus(1, 2.0);
//		hyundai.Plus(1);
		
		//hyundai.showNumberofCars();
		Car c1 = new Car(1, 1, "", "");
		Car c2 = new Car(1, 1, "", "");
		Car c3 = new Car(1, 1, "", "");
		Car c4 = new Car(1, 1, "", "");
		
		Car.showNumberofCars();
		

	}

}