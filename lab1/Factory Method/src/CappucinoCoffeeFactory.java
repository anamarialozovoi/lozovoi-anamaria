public class CappucinoCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new CappucinoCoffee();
    }
}

