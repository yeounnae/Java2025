package sec01.exam04;

public class ScopeTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		if (a > 1) {
			b = a;
		}
		
		int c = a + b;
	}

}