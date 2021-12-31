package java_basics;

import java.util.ArrayList;
import java.util.List;

public class ToGetTheSumOfPrimeNumbers {

	public static void main(String[] args) {
		int[] arr = {21,43,57,61};
		int sum = 0;
		List<Integer> primeArr = new ArrayList<Integer>();
		for(int a : arr) {
			if(isPrime(a)) {
				primeArr.add(a);
			}
		}
		
		for(int a : primeArr) {
			sum=sum+a;
		}
		System.out.println(sum);
	}
	public static boolean isPrime(int num) {
		boolean isP = true;
		for(int i=2;i<10;i++) {
			if(num!=1 && num%i==0) {
				isP = false;
				break;
			}
		}
		return isP;
	}
}