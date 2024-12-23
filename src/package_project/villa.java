
package package_project;

import java.util.Scanner;
public class villa extends property{
    private int bedrooms;
    private double size;

    public villa(String address, double price, int bedrooms, double size) {
        super(address, price);
        this.bedrooms = bedrooms;
        this.size = size;
    }

    @Override
    public void display() {
        System.out.println("Villa Address: " + address);
        System.out.println("Price: " + price);
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Size: " + size + " sq ft");
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Updating Villa Details...");
        System.out.print("Enter new address: ");
        this.address = sc.nextLine();

        System.out.print("Enter new price: ");
        this.price = sc.nextDouble();
        sc.nextLine(); // Consume the newline character

        System.out.print("Enter the number of bedrooms: ");
        this.bedrooms = sc.nextInt();

        System.out.print("Enter the size of the villa (sq ft): ");
        this.size = sc.nextDouble();
    }
}
