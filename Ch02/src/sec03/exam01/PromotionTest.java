package sec03.exam01;

public class PromotionTest {

	public static void main(String[] args) {
		byte byteVal = 10;
		int intVal = byteVal;
		//byte byteVall = intVal;
		
		char charVal = 'A';
		//char charVal = 65;
		//System.out.print(charVal);
		int intVal1 = charVal;
		System.out.println((char)intVal1);
		
		byte byteVal1 = 65;
		int intVal2 = 65;
		char charVal2 = (char)byteVal1;
		char charVal3 = (char)intVal2;

	}

}
