
package abstractclassexercise;


public class Android extends  Phone {
    private String brand;
     private double price;

    public Android(String brand) {
        super(brand);
    }

    @Override
    void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }
    
    
    
}
