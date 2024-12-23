
package package_project;
import java.util.Scanner;
public class land extends property{
      private double size;

    public land(String address, double price, double size) {
        super(address, price);
        this.size = size;
    }

    @Override
    public void display() {
        System.out.println("Land Address: " + address);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size + " acres");
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Updating Land Details...");
        System.out.print("Enter new address: ");
        this.address = sc.nextLine();

        System.out.print("Enter new price: ");
        this.price = sc.nextDouble();
        sc.nextLine(); // Consume the newline character

        System.out.print("Enter the size of the land (acres): ");
        this.size = sc.nextDouble();
    }
}
