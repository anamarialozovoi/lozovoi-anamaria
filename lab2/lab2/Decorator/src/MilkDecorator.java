public class MilkDecorator implements Coffee {
    private Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public double getCost() {
        return coffee.getCost() + 0.5;
    }

    public String getDescription() {
        return coffee.getDescription() + ", milk";
    }
}

