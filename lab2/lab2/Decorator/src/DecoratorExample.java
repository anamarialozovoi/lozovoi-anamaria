public class DecoratorExample {
    public static void main(String[] args) {
        Coffee coffee = new MilkDecorator(new SugarDecorator(new CaramelDecorator(new SimpleCoffee())));

        System.out.println("Cost: " + coffee.getCost());
        System.out.println("Description: " + coffee.getDescription());
    }
}
