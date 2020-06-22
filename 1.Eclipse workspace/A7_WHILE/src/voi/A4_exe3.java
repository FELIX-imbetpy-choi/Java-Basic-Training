package voi;

import java.util.Scanner;

public class A4_exe3 {

	public static void main(String[] args) {

		  Scanner scanner = new Scanner(System.in);
	      
	      int calcValue = 0;
	      int remainder = 0;
	      int tot = 0;
	      
	      System.out.print("Enter an integer(0 ~ 9) : " );
	      int inputValue = scanner.nextInt();
	      calcValue = inputValue;
	      
	      while(calcValue != 0) {
	         remainder = calcValue % 10;
	         tot = tot + remainder;
	         calcValue = calcValue / 10;
	         
	         
	      }
	      
	      System.out.println("total : " + tot);
	      
	}

}
