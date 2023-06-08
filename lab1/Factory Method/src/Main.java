public class Main {

    public static void main(String[] args) {
        CoffeeFactory cappucinoCoffeeFactory = new CappucinoCoffeeFactory();
        CoffeeStore coffeeStore = new CoffeeStore(cappucinoCoffeeFactory);
        Coffee cappucinoCoffee = coffeeStore.orderCoffee();
        System.out.println("Ordered a " + cappucinoCoffee.getName() + " with ingredients " + cappucinoCoffee.getIngredients());

        CoffeeFactory latteCoffeeFactory = new LatteCoffeeFactory();
        CoffeeStore coffeeStore2 = new CoffeeStore(latteCoffeeFactory);
        Coffee latteCoffee = coffeeStore2.orderCoffee();
        System.out.println("Ordered a " + latteCoffee.getName() + " with ingredients " + latteCoffee.getIngredients());

    }

}