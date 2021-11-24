package primeNumber;
import java.util.Scanner;


public class PrimeNumber {

	public static void main(String[] args) {
		String numberStatus = "";		
		//capture the input in an integer
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = scan.nextInt();
        scan.close();
        boolean status = checkPrime(num);
		if(status == true) {
			numberStatus = "The number is prime";
		} else {
			numberStatus = "The number is not prime";
		}
		System.out.println(numberStatus);   
	}
	public static Boolean checkPrime(int num) { 
		// TODO Auto-generated method stub
	      int i = 0;	     
	      if (num <= 1)
	    	  
	            return false;
	  
	        // Check from 2 to n-1
	        for ( i = 2; i < num; i++)
	            if (num % i == 0)
	                return false;
	  
	        return true;
	    
	}
}
