import java.util.Arrays;

public class LatteCoffee extends Coffee {
    public LatteCoffee() {
        super("Latte Coffee", Arrays.asList("milk", "coffee", "latte"));
    }

    @Override
    public void brewing() {
        System.out.println("Making Latte Coffee");
    }
}
