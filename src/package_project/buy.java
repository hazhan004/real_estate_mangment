
package package_project;
import java.util.Scanner;

public class buy extends client implements Transaction{
   public buy(String name, String email, int phone, String role, String desiredPropertyType) {
        super(name, email, phone, role, desiredPropertyType);
    }

    @Override
    public void processTransaction() {
        String desiredPropertyType = null;
        System.out.println("Processing purchase for " + name + " who wants to buy a " + desiredPropertyType);
        // Additional logic for buying properties can be added here
    }
}
