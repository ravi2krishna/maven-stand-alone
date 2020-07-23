package com.ravi.p1;

import java.util.Scanner;

/**
 * Hello world!
 *
 */


public class App  
{
   
	private int num1;
	private int num2;
	
	
    public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int sum(int num1, int num2) {
		return num1+num2;	
	}
	
	public int product(int num1, int num2) {
		return num1*num2;	
	}
	

	public static void main( String[] args )
    {
		App cal = new App();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int num1 = scan.nextInt();
		
		System.out.println("Enter Second Number");
		int num2 = scan.nextInt();
		
		System.out.println("The Sum is : "+cal.sum(num1, num2));
		
		System.out.println("The Product is : "+cal.product(num1, num2));
		
    }
}
