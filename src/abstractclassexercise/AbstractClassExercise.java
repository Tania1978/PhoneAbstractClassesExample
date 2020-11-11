
package abstractclassexercise;


public class AbstractClassExercise {

    
    public static void main(String[] args) {
        
        Android a = new Android("Samsung");
        a.setPrice(24.99);
        System.out.println(a.getPrice());
        NonAndroid n = new NonAndroid("iphone");
        n.setPrice(37.99);
        System.out.println(n.getPrice());
    }
    
}
