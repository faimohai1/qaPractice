package testPackage;

public class SumOfNum {
	
	public static void main(String[] args) {
		int a =sum(1, 100);
		System.out.println(a);
	}
	
	protected static int sum(int st, int end) { 
	int i; 
	int sum=0;
	for(i=st; i<=end; i++) {
		sum=sum+i;
	}
	return sum;
//	System.out.println(sum);
	}

}
