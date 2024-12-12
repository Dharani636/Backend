package Backendcode;

public class Discount {
	
	private double discountpercentage = 0.20;
	
	protected double getdiscount( double totalamount) 
	{
		System.out.println("Your discount precentage : " +discountpercentage+ "%");
		double discountAmount = totalamount*discountpercentage;
		double actualAmount = totalamount-discountAmount;
		System.out.println("Your discount amount is : "+discountAmount);
		System.out.println("After discount amount is : "+actualAmount);
		return actualAmount;

	}
	
}


