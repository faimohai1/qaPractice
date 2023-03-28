package testPackage;
import java.util.*;

public class TempConversion {
		
	void tempConv() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Temperature in Farenheit");
		int far = sc.nextInt(); 
		int cel= (far-30)/2;
		System.out.println("The Temparature in Celcius is: "+ cel);
		
		
	}
	
	
	
	
}
