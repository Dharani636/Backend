package Backendcode;

import java.util.Scanner;

public class Quantity extends Tax{
	public int quantity() 
	{
		System.out.println("Enter the Quantity");
		Scanner s = new Scanner(System.in);
		int quantites = s.nextInt();
		return quantites;
	}
	public void calculation(int amount ,int quantites ) 
	{
		int totalamount = amount*quantites;
		System.out.println("You have to pay Rs. "+ totalamount);
		
		Discount d = new Discount();
		double discountedamount = d.getdiscount(totalamount);
		
		double finalAmount = gettax(totalamount, discountedamount);

	}
	
}
