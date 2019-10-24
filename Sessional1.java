package LS1;

import java.util.Scanner;

public class Sessional1 {

	static boolean isPrime(int numberToCheck) 
	{
		int temp;// a temporary variable to store a value temporarily.
		int flag=0;// a flag to set the value of returning boolean variable.
		
		temp=numberToCheck/2;
		
		if(numberToCheck == 0|| numberToCheck == 1) 
		{
				flag = 1;
		}
		else 
		{
			
			for(int i=2 ; i<=temp ; i++) 
			{
				if(numberToCheck % i == 0) 
				{
					flag = 1;
					break;
				}	
			}
		}
		
		if (flag == 1) 
		{
			return false;
		}
		else 
		{
			return true;
		}
		
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		
		System.out.print("This code checks if given number is a prime number or not./n/n");
		System.out.print("Note::Test Cases for given code/method are in the program as comments./n/n");
		
		System.out.print("Enter a random integer:/n");
		int randomNummber= s.nextInt();
		
		
		boolean result =isPrime(randomNummber);
		if (result==true) 
		{
			System.out.print("The given integer is a Prime number./n");
		}
		else 
		
			System.out.print("The given integer is not a Prime number./n");
	}
		
		//Test Cases
		
		/*The best approach I had was to make a Switch-Case set for test cases. But in given time it is not implementable for me so I will only write the statements in which different test values are given to "randomNummber" variable.
		 *randomNummber = 'a';
		 *randomNummber =  "String";
		 *randomNummber =  7.0 ;
		 *randomNummber =  11.3546677778822333;
		 *randomNummber =  46521436512347651347651437561437651 ;
		 *randomNummber =  - 41623541635186735816735186541867235163;
		 *randomNummber =  32768;
		 *randomNummber =  -32768;
		 *randomNummber =  32767;
		 *randomNummber =  -32769; 
		 * 
		 * */
		 

}


