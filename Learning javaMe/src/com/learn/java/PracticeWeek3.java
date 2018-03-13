package com.learn.java;

public class PracticeWeek3 {

	public static void main(String[] args) {
		minFunction(5, 10);
	}
	
	
	public static int minFunction(int n1, int n2)
	{
		System.out.println(" User entered n1 = " + n1);
		System.out.println( " User entered n2 = " + n2);
		int min =0;
		if(n1 > n2)
		{
			min = n2;
			System.out.println("The small number is:" + min);
			
		}
		else if(n2 > n1)
		{
			min = n1;
			System.out.println( "The small number is: " + min);
		}
		else
		{
			System.err.println("There is no min num between" + n1 + "and" + n2);
			
		}
		
			return min;
		
	}

}
