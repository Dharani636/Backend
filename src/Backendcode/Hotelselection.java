package Backendcode;

import java.util.Scanner;

public class Hotelselection {
	
	public String Finalhotel = "name";
	
	String [] hotels = new String[5];

    public void selecthotel() {
        hotels[0] = "A2B";
        hotels[1] = "Buhari";
        hotels[2] = "SS Hyderabad";
        hotels[3] = "Charminar";
        hotels[4] = "The Wedding Biryani";

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < hotels.length; i++) 
        {
            System.out.println("Enter the Hotel Name to check availability:");
            String name = s.nextLine();

            boolean isAvailable = false;
            for (String hotel : hotels) 
            {
                if (hotel.equalsIgnoreCase(name)) 
                {
                    isAvailable = true;
                    Finalhotel= name;
                    break;
                }
            }

            if (isAvailable) 
            {
                System.out.println("Hotel Available : "+ name);
                break;
            } 
            else
            {
                System.out.println("Hotel Not Available");
                System.out.println("The Available Hotel Are : ");
                for (String hotel :hotels) 
            {
            	System.out.println(hotel);
            }   
          }
        }
        
    }
    public static void main(String[] args) {
        Itemcombination f = new Itemcombination();
        f.combination();
    }
}
