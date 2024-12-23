
package package_project;

import java.util.Scanner;
public class Agent extends person{
   private String agency;

    public Agent(String name, String email, int phone, String agency) {
        super(name, email, phone);
        this.agency = agency;
    }

    @Override
    public void display() {
        System.out.println("Agent Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Agency: " + agency);
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Updating Agent Details...");
        System.out.print("Enter new name: ");
        this.name = sc.nextLine();

        System.out.print("Enter new email: ");
        this.email = sc.nextLine();

        System.out.print("Enter new phone number: ");
        this.phone = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        System.out.print("Enter new agency name: ");
        this.agency = sc.nextLine();
    }

    public String getAgency() {
        return agency;
    }

    int getgentId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
