package JavavivaPractice;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
	Scanner s1 = new Scanner (System.in);
	System.out.println("enter input 1");
	
	//int a = s1.nextInt();
	double a = s1.nextDouble();
	System.out.println("enter input 2");
	double b = 2*Math.PI*a;
	
	System.out.println(b);
	

	}

}
