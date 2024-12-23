
package package_project;
import java.util.Scanner;

public class rent extends client implements Transaction{
     public rent(String name, String email, int phone, String role, String desiredPropertyType) {
        super(name, email, phone, role, desiredPropertyType);
    }

    @Override
    public void processTransaction() {
        String desiredPropertyType = null;
        System.out.println("Processing rental for " + name + " who wants to rent a " + desiredPropertyType);
        // Additional logic for renting properties can be added here
    }
    
}
