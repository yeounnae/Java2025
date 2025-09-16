package sec04.exam01;

import java.io.IOException;
import java.util.Scanner;

public class Readtext {

	public static void main(String[] args) {
//		while(true) {
//			try {
//				int code = System.in.read();
//				System.out.println("Code : " + code);
//				if(code == 'q') break;				
//			}  catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//      }
	    Scanner scan = new Scanner(System.in);
	    
//	    while(true) {
//	    	int code = scan.nextInt();
//	    	System.out.println("Code ; " + code);
//	    	if(code == 'q') break;
//	    }
	    
	    while(true) {
	    	String code = scan.nextLine();
	    	System.out.println("Code ; " + code);
	    	if(code.equals("q")) break;
	    }
	}

}