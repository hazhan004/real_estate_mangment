
package package_project;

import java.util.Scanner;
public class apartment extends property{
     private int floor;

    public apartment(String address, double price, int floor) {
        super(address, price);
        this.floor = floor;
    }

    @Override
    public void display() {
        System.out.println("Apartment Address: " + address);
        System.out.println("Price: " + price);
        System.out.println("Floor: " + floor);
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Updating Apartment Details...");
        System.out.print("Enter new address: ");
        this.address = sc.nextLine();

        System.out.print("Enter new price: ");
        this.price = sc.nextDouble();
        sc.nextLine(); // Consume the newline character

        System.out.print("Enter the floor number: ");
        this.floor = sc.nextInt();
    }
}
