
package package_project;

import java.util.Scanner;
public class office extends property{
   private double officeSize;

    public office(String address, double price, double officeSize) {
        super(address, price);
        this.officeSize = officeSize;
    }

    @Override
    public void display() {
        System.out.println("Office Address: " + address);
        System.out.println("Price: " + price);
        System.out.println("Office Size: " + officeSize + " sq ft");
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Updating Office Details...");
        System.out.print("Enter new address: ");
        this.address = sc.nextLine();

        System.out.print("Enter new price: ");
        this.price = sc.nextDouble();
        sc.nextLine(); // Consume the newline character

        System.out.print("Enter the office size (sq ft): ");
        this.officeSize = sc.nextDouble();
    }
}
