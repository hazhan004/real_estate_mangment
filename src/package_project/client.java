
package package_project;
import java.util.Scanner;

public class client extends person{
    private String clientType; // Buyer, Seller, or Renter
    private String propertyType; // House, Land, Apartment, etc.

    public client(String name, String email, int phone, String clientType, String propertyType) {
        super(name, email, phone);
        this.clientType = clientType;
        this.propertyType = propertyType;
    }

    @Override
    public void display() {
        System.out.println("Client Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Client Type: " + clientType);
        System.out.println("Property Type: " + propertyType);
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Updating Client Details...");
        System.out.print("Enter new name: ");
        this.name = sc.nextLine();

        System.out.print("Enter new email: ");
        this.email = sc.nextLine();

        System.out.print("Enter new phone number: ");
        this.phone = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        System.out.print("Enter new client type (Buyer/Seller/Renter): ");
        this.clientType = sc.nextLine();

        System.out.print("Enter new property type: ");
        this.propertyType = sc.nextLine();
    }

    public String getClientType() {
        return clientType;
    }

    public String getPropertyType() {
        return propertyType;
    }

    int getclientId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
