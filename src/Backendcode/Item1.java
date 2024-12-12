package Backendcode;

import java.util.Scanner;

public class Item1 {
    String[] item = new String[3];
    int[] price = new int[3];

    public void getfoodlist1() {
        item[0] = "Idly";
        price[0] = 10;
        item[1] = "Poori";
        price[1] = 40;
        item[2] = "Dosa";
        price[2] = 20;

        System.out.println("Available items:");
        for (String items : item) {
            System.out.println(items);
        }

        System.out.println("Select the Food item:");

        Scanner s = new Scanner(System.in);
        String order = s.nextLine();

        boolean isAvailable = false;
        int selectedPrice = 0;

        for (int i = 0; i < item.length; i++) {
            if (item[i].equalsIgnoreCase(order)) {
                isAvailable = true;
                selectedPrice = price[i];
                System.out.println("Selected item is Available: " + item[i] + " - Rs." + selectedPrice);
                break;
            }
        }

        if (isAvailable) {
            Quantity q = new Quantity();
            int quantity = q.quantity();
            q.calculation(selectedPrice, quantity);
        } else {
            System.out.println("Selected item is not available.");
        }
    }
}
