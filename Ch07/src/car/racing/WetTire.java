package car.racing;

public class WetTire extends Tire{
	WetTire(int capacity, int consume) {
		super(capacity, consume);
	}
	
	boolean IsAbailable() {
		if(Environment.isRain) return false;
		return capacity - consume > 0;
	}
}
