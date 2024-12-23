
package package_project;


public abstract class property {
    protected String address;
    protected double price;

    public property(String address, double price) {
        this.address = address;
        this.price = price;
    }

    public abstract void display();
    public abstract void input(); // This method is responsible for inputting/updating property details.

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
