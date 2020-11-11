
package abstractclassexercise;


public class NonAndroid extends Phone {
    private String brand;
    private double price;

    public NonAndroid(String brand) {
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
