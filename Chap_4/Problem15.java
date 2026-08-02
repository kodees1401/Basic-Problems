package class_program; // To Print ShopItem Class — Total Cost of Items
import java.util.Scanner;

class ShopItem {
    String itemName;
    int quantity;
    double price;
 
    double calculateTotalCost() {
        return quantity * price;
    }
}

public class Problem15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ShopItem item = new ShopItem();
 
        System.out.print("Enter item name: ");
        item.itemName = sc.nextLine();
        System.out.print("Enter quantity: ");
        item.quantity = sc.nextInt();
        System.out.print("Enter price per item: ");
        item.price = sc.nextDouble();
 
        System.out.println("Item: " + item.itemName);
        System.out.println("Total Cost: " + item.calculateTotalCost());

        sc.close();

	}

}
