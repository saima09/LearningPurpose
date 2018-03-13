package com.learn.java;

public class AccessModfierTest {
	static boolean isTrue = true;
	public static void main(String[] args) {
			int n1 = 4;
			int n2 = 8; 
			int addition = n1 + n2;
			System.out.println("Addition result: " + addition);
			
			int susbtraction = n1 - n2;
//			System.out.println("Substraction result:" + substraction);
			
			int multiplecation = n1 * n2;
			System.out.println("mult result");
			
//			oddOrEven(9);
//			oddOrEven(20);
			printNumbersOddEven();
		
		}
	//print from 1 -100 and display odd or even number
	
	public static void printNumber100To1OddEven() {
		
	}
	
	//print from 1 -100 and display odd or even number

	public static void printNumbersOddEven()
	{
	for(int i =1; i<100; i ++)
	{
		oddOrEven(i);
		
	}
	}
	
	public static void oddOrEven(int aNumber) 
	{
		if(aNumber % 2 == 0)
		{
			System.out.println("Number "  + aNumber + " is even");
					
			
		
		}else
		{
			System.out.println("Number "  + aNumber + " is odd");
		}
		
		
	}
	
			public static void firstPart()
			{

				/*MyFirstJavaProject myObject1 = new MyFirstJavaProject();
				
				myObject1.myPublicMethod1();
				
				System.out.println(myObject1.myString1);*/
				
				int myNumber1 = 5;
				System.out.println("myNumber value is: " + myNumber1);
				
				
				double myDoubleVariable = 8;
				System.out.println("My double variable value is: " + myDoubleVariable);
				
				/*int num1 = 5;
				int num2 = 2;
				//int result = num1 / num2;
				double result = num1 / num2;*/
				
				double num1 = 5;
				double num2 = 2;
				double result = num1 / num2;
				System.out.println("Calculation result: " + result);
				
				
				System.out.println("isTrue value is: " + isTrue);
				
				

	
		}
}
