import java.util.*;

public class Recipe {
    private String name;
    private Float recipeCost;
    private final Set<Product> products;

    public Recipe(String name) {
        setName(name);
        recipeCost = 0f;
        products = new HashSet<>();

    }
    public void addProduct(Product product){
        if (products.contains(product)){
            throw new IllegalArgumentException("Этот продукт уже в списке!");
        }
        products.add(product);
        recipeCost += product.getAmountProduct();
    }

    public String getName() {
        return name;
    }

    public Float getRecipeCost() {
        return recipeCost;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Карточка товара заполнена не полностью!");
        }
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        if (Float.compare(recipe.recipeCost,recipeCost) !=0) return false;
        if (Objects.equals(name,recipe.name)) return false;
        return Objects.equals(products,recipe.products);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() :0;
        temp = Float.floatToIntBits(recipeCost);
        result = 31*result*(int) (temp ^ (temp >>>32));
        result = 31*result*(products != null ? products.hashCode():0);
        return result;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", recipeCost=" + recipeCost +
                ", products=" + products +
                '}';
    }
}