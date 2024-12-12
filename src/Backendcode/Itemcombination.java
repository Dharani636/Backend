package Backendcode;

public class Itemcombination {

    public void combination() {
    	Hotelselection h = new Hotelselection();
        h.selecthotel();

        String selectedHotel = h.Finalhotel;

        if (selectedHotel.equalsIgnoreCase("A2B"))
        {
            Item1 a = new Item1();
            a.getfoodlist1();
        }
        else if (selectedHotel.equalsIgnoreCase("Buhari")) 
        {
            Item2 b = new Item2();
            b.getfoodlist2();
        } else 
        {
            System.out.println("No food items available for the selected hotel.");
        }
    }
}
