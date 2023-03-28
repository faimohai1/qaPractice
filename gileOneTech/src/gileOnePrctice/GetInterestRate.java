package gileOnePrctice;

import java.util.Scanner;

public class GetInterestRate {
		Scanner sc = new Scanner(System.in);
		
		
		double intRate ;
		double basePrice ;
		double totalPrice;
		double monthlyPayment;
		int loanTerm;
	
		
		public void getInterestRate() {
			System.out.print("Please Enter your credit score: ");
			int creditScore= sc.nextInt();
		
		if(creditScore>=600 && creditScore<=760) {
		
			
			if(creditScore>= 600 && creditScore <650 ) {
			
				intRate=5;
				
			}else if((creditScore>= 650 && creditScore <700 )) {
			
				intRate=4;
				
				
			}else if((creditScore>= 700 && creditScore <760 )) {
			
				intRate=3;
				
			
			}else {
			
				intRate=1.5;
				
	
			}
		
		
		}
		
		else {
			System.out.println("Invalid input");
		}
		 
		
		
		
	
	
	}
		
		
		public void getTotalPrice() {
			System.out.println("Enter Base Price: ");
			basePrice=sc.nextInt();
			totalPrice= basePrice+ basePrice*intRate/100;
		}
	
		public void getMonthlyPayment() {
			System.out.println("Enter Loan Term");
			loanTerm=sc.nextInt();
			if(loanTerm==20) {
				monthlyPayment= totalPrice/20/12;
				
			}else if(loanTerm==30) {
				monthlyPayment= totalPrice/30/12;
			}else {
				System.out.println("Invalid Input");
			}
			System.out.println("Your Monthly payment is: "+monthlyPayment);
		}
	
	
	
	
}
