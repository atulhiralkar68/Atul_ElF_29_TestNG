package java_basics;

import java.util.Scanner;

public class ToCountPrimeNumbers {
	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the range");
		System.out.println("Enter the starting number : ");
		int startingNum = s.nextInt();
		System.out.println("Enter the ending number : ");
		int endingNum = s.nextInt();
		
		int primeCount = 0;
		boolean isPrime = true;

		for(int i=startingNum;i<=endingNum;i++) {
			for(int j=2;j<=i;j++) {
				if(i!=j && i!=1) {
					if(i%j==0) {
						isPrime = false;
						break;
					}
					else {
						isPrime = true;
					}
				}
			}
			if(isPrime && i!=1) {
				System.out.println(i+" is a prime number");
				primeCount++;
			}
		}
		System.out.println("Total number of prime numbers present between "+startingNum+" to "+endingNum+" is : "+primeCount);
	}

}
