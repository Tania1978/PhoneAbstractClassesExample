
package abstractclassexercise;


public abstract class Phone {
     private String brand;
     private double price;

    public Phone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    abstract void setPrice(double price);
    
}
