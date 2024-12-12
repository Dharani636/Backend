package Backendcode;

public class Tax {

	 private double taxpercentage = 0.18;
	 
	 protected double gettax(double totalamount, double actualAmount) 
	 {
		 System.out.println("Your Tax percentage : "+taxpercentage+"%");
		 double taxamount = totalamount*taxpercentage;
		 double actualamount = taxamount+actualAmount;
		 System.out.println("Your Tax percentage : " + taxamount);
		 System.out.println("After Tax Amount :" +actualamount);
		 
		 System.out.println("Your Final Amount to be Pay :" + actualamount);
		 return taxpercentage;
		 
	 }

}
