package sec03.exam03;

public class ValueTest {

	public static void main(String[] args) {
		int value = 10;
		String str = "3" + 7 + 8;
		//      "37" + 8
		str = 7 + 8 +"3";
		// 15 + "3"
		str =""+value;
		
		System.out.println(str);
	}

}