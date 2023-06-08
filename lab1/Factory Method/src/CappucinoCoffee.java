import java.util.Arrays;

public class CappucinoCoffee extends Coffee {
    public CappucinoCoffee() {
        super("Cappucino Coffee", Arrays.asList("milk", "coffee", "Cappucino"));
    }

    @Override
    public void brewing() {
        System.out.println("Brewing Cappucino Coffee");
    }
}