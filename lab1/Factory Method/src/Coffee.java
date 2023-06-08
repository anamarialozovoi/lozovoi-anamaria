import java.util.List;

public abstract class Coffee {
    protected String name;
    protected List<String> ingredients;

    public Coffee(String name, List<String> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public abstract void brewing();

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }


}
