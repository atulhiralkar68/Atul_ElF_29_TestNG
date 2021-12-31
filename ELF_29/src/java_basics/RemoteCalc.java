package java_basics;

public class RemoteCalc {

	public int add(int...a) {
		
		int sum=0;
		for(int i:a) {
			sum=sum+i;
		}
		return sum;
	}
}
