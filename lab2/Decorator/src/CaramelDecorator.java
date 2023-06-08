public class CaramelDecorator implements Coffee {
    private Coffee coffee;

    public CaramelDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public double getCost() {
        return coffee.getCost() + 0.7;
    }

    public String getDescription() {
        return coffee.getDescription() + ", caramel";
    }
}
