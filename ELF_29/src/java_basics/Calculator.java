package java_basics;

public class Calculator {

	public static int add(int...data) {
		int sum = 0;
		for(int num : data) {
			sum = sum + num;
		}
		return sum;
	}
	
	public static int sub(int...data) {
		int dif = 0;
		for(int num : data) {
			dif = dif - num;
		}
		return dif;
	}
}
