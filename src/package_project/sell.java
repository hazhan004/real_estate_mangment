
package package_project;

import java.util.Scanner;
public class sell extends client  implements Transaction{
      public sell(String name, String email, int phone, String role, String desiredPropertyType) {
        super(name, email, phone, role, desiredPropertyType);
    }

    @Override
    public void processTransaction() {
        String desiredPropertyType = null;
        System.out.println("Processing sale for " + name + " who wants to sell a " + desiredPropertyType);
        // Additional logic for selling properties can be added here
    }
}
