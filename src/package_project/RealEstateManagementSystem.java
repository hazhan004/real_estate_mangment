
package package_project;
import java.util.Scanner;


    



import java.util.ArrayList;
import java.util.Scanner;

public class RealEstateManagementSystem {
    

    private static ArrayList<person> people = new ArrayList<>();
    private static ArrayList<property> properties = new ArrayList<>();
    private static int clientCounter = 1;  // To generate unique client IDs
    private static int agentCounter = 1;   // To generate unique agent IDs
    private static int propertyCounter = 1;  // To generate unique property IDs

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Real Estate Management System");
            System.out.println("1. Register Client");
            System.out.println("2. Register Agent");
            System.out.println("3. Display All Clients");
            System.out.println("4. Display All Agents");
            System.out.println("5. Update Client");
            System.out.println("6. Update Agent");
            System.out.println("7. Delete Client");
            System.out.println("8. Delete Agent");
            System.out.println("9. Add Property");
            System.out.println("10. View All Properties");
            System.out.println("11. Update Property");
            System.out.println("12. Delete Property");
            System.out.println("13. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    registerClient(sc);
                    break;
                case 2:
                    registerAgent(sc);
                    break;
                case 3:
                    displayAllClients();
                    break;
                case 4:
                    displayAllAgents();
                    break;
                case 5:
                    updateClient(sc);
                    break;
                case 6:
                    updateAgent(sc);
                    break;
                case 7:
                    deleteClient(sc);
                    break;
                case 8:
                    deleteAgent(sc);
                    break;
                case 9:
                    addProperty(sc);
                    break;
                case 10:
                    viewAllProperties();
                    break;
                case 11:
                    updateProperty(sc);
                    break;
                case 12:
                    deleteProperty(sc);
                    break;
                case 13:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 13);
    }

    // Register a Client
    private static void registerClient(Scanner sc) {
        System.out.println("Select Client Type:");
        System.out.println("1. Buy");
        System.out.println("2. Sell");
        System.out.println("3. Rent");
        System.out.print("Enter your choice: ");
        int clientType = sc.nextInt();
        sc.nextLine();  // Consume newline character

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.print("Enter phone number: ");
        int phone = sc.nextInt();
        sc.nextLine();  // Consume newline character

        client client = null;
        if (clientType == 1) {
            client = new client(name, email, phone, "Buyer", "House");
        } else if (clientType == 2) {
            client = new client(name, email, phone, "Seller", "Land");
        } else if (clientType == 3) {
            client = new client(name, email, phone, "Renter", "Apartment");
        }

        people.add(client);
        System.out.println("Client registered successfully.");
    }


// Register an Agent
    private static void registerAgent(Scanner sc) {
        System.out.print("Enter Agent's name: ");
        String name = sc.nextLine();
        System.out.print("Enter Agent's email: ");
        String email = sc.nextLine();
        System.out.print("Enter Agent's phone number: ");
        int phone = sc.nextInt();
        sc.nextLine();  // Consume newline character
        System.out.print("Enter Agency name: ");
        String agency = sc.nextLine();

        Agent agent = new Agent(name, email, phone, agency);
        people.add(agent);
        System.out.println("Agent registered successfully.");
    }

    // Display all Clients
    private static void displayAllClients() {
        System.out.println("Displaying All Clients:");
        for (person person : people) {
            if (person instanceof client) {
                client client = (client) person;
                client.display();
            }
        }
    }

    // Display all Agents
    private static void displayAllAgents() {
        System.out.println("Displaying All Agents:");
        for (person person : people) {
            if (person instanceof Agent) {
                Agent agent = (Agent) person;
                agent.display();
            }
        }
    }

    // Update Client
    private static void updateClient(Scanner sc) {
        System.out.print("Enter the Client ID to update: ");
        int clientId = sc.nextInt();
        sc.nextLine();  // Consume newline character

        client clientToUpdate = findClientById(clientId);
        if (clientToUpdate != null) {
            System.out.println("Updating Client...");
            clientToUpdate.input();
            System.out.println("Client updated successfully.");
        } else {
            System.out.println("Client not found.");
        }
    }

    // Update Agent
    private static void updateAgent(Scanner sc) {
        System.out.print("Enter the Agent ID to update: ");
        int agentId = sc.nextInt();
        sc.nextLine();  // Consume newline character

        Agent agentToUpdate = findAgentById(agentId);
        if (agentToUpdate != null) {
            System.out.println("Updating Agent...");
            agentToUpdate.input();
            System.out.println("Agent updated successfully.");
        } else {
            System.out.println("Agent not found.");
        }
    }

    // Delete Client
    private static void deleteClient(Scanner sc) {
        System.out.print("Enter the Client ID to delete: ");
        int clientId = sc.nextInt();

        client clientToDelete = findClientById(clientId);
        if (clientToDelete != null) {
            people.remove(clientToDelete);
            System.out.println("Client deleted successfully.");
        } else {
            System.out.println("Client not found.");
        }
    }

    // Delete Agent
    private static void deleteAgent(Scanner sc) {
        System.out.print("Enter the Agent ID to delete: ");
        int agentId = sc.nextInt();

        Agent agentToDelete = findAgentById(agentId);
        if (agentToDelete != null) {
            people.remove(agentToDelete);
            System.out.println("Agent deleted successfully.");
        } else {
            System.out.println("Agent not found.");
        }
    }

    // Add Property
    private static void addProperty(Scanner sc) {
        System.out.println("Adding a property...");
        System.out.println("1. Add Villa");
        System.out.println("2. Add Land");
        System.out.println("3. Add Apartment");
        System.out.println("4. Add Office");
        System.out.println("5. Add Home");
        System.out.print("Select property type: ");
        int propertyChoice = sc.nextInt();
        sc.nextLine();  // Consume newline character


property property = null;
        switch (propertyChoice) {
            case 1:
                System.out.print("Enter address: ");
                String villaAddress = sc.nextLine();
                System.out.print("Enter price: ");
                double villaPrice = sc.nextDouble();
                System.out.print("Enter number of bedrooms: ");
                int villaBedrooms = sc.nextInt();
                System.out.print("Enter size in sq ft: ");
                double villaSize = sc.nextDouble();
                property = new villa(villaAddress, villaPrice, villaBedrooms, villaSize);
                break;
            case 2:
                System.out.print("Enter address: ");
                String landAddress = sc.nextLine();
                System.out.print("Enter price: ");
                double landPrice = sc.nextDouble();
                System.out.print("Enter size in acres: ");
                double landSize = sc.nextDouble();
                property = new land(landAddress, landPrice, landSize);
                break;
            case 3:
                System.out.print("Enter address: ");
                String apartmentAddress = sc.nextLine();
                System.out.print("Enter price: ");
                double apartmentPrice = sc.nextDouble();
                System.out.print("Enter floor number: ");
                int apartmentFloor = sc.nextInt();
                property = new apartment(apartmentAddress, apartmentPrice, apartmentFloor);
                break;
            case 4:
                System.out.print("Enter address: ");
                String officeAddress = sc.nextLine();
                System.out.print("Enter price: ");
                double officePrice = sc.nextDouble();
                System.out.print("Enter office size in sq ft: ");
                double officeSize = sc.nextDouble();
                property = new office(officeAddress, officePrice, officeSize);
                break;
            case 5:
                System.out.print("Enter address: ");
                String homeAddress = sc.nextLine();
                System.out.print("Enter price: ");
                double homePrice = sc.nextDouble();
                sc.nextLine();  // Consume newline character
                System.out.print("Enter home type: ");
                String homeType = sc.nextLine();
                property = new Home(homeAddress, homePrice, homeType);
                break;
            default:
                System.out.println("Invalid property type.");
                return;
        }

        properties.add(property);
        System.out.println("Property added successfully.");
    }

    // View All Properties
    private static void viewAllProperties() {
        System.out.println("Viewing all properties...");
        for (property property : properties) {
            property.display();
        }
    }

    // Update Property
    private static void updateProperty(Scanner sc) {
        System.out.print("Enter the Property ID to update: ");
        int propertyId = sc.nextInt();
        sc.nextLine();  // Consume newline character

        property propertyToUpdate = findPropertyById(propertyId);
        if (propertyToUpdate != null) {
            System.out.println("Updating Property...");
            propertyToUpdate.input();
            System.out.println("Property updated successfully.");
        } else {
            System.out.println("Property not found.");
        }
    }

    // Delete Property
    private static void deleteProperty(Scanner sc) {
        System.out.print("Enter the Property ID to delete: ");
        int propertyId = sc.nextInt();

        property propertyToDelete = findPropertyById(propertyId);
        if (propertyToDelete != null) {
            properties.remove(propertyToDelete);
            System.out.println("Property deleted successfully.");
        } else {
            System.out.println("Property not found.");
        }
    }


// Helper Method: Find Client by ID
    private static client findClientById(int clientId) {
        for (person person : people) {
            if (person instanceof client && ((client) person).getclientId() == clientId) {
                return (client) person;
            }
        }
        return null;
    }

    private static Agent findAgentById(int agentId) {
        for (person person : people) {
            if (person instanceof Agent && ((Agent) person).getgentId() == agentId) {
                return (Agent) person;
            }
        }
        return null;
    }

    private static property findPropertyById(int propertyId) {
        if (propertyId > 0 && propertyId <= properties.size()) {
            return properties.get(propertyId - 1);  // IDs are 1-based, so subtract 1 for index
        }
        return null;
    }
}


