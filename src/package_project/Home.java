/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package_project;

import java.util.Scanner;
public class Home extends property{
   private String homeType;

    public Home(String address, double price, String homeType) {
        super(address, price);
        this.homeType = homeType;
    }

    @Override
    public void display() {
        System.out.println("Home Address: " + address);
        System.out.println("Price: " + price);
        System.out.println("Home Type: " + homeType);
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Updating Home Details...");
        System.out.print("Enter new address: ");
        this.address = sc.nextLine();

        System.out.print("Enter new price: ");
        this.price = sc.nextDouble();
        sc.nextLine(); // Consume the newline character

        System.out.print("Enter the home type (e.g., Bungalow, Duplex): ");
        this.homeType = sc.nextLine();
    }}
