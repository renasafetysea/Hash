import java.util.*;

public class Recipe {
    private String name;
    private Float recipeCost;
    private final Map<Product,Integer> products;
    private int count;


    public Recipe(String name) {
        setName(name);
        recipeCost = 0f;
        products = new HashMap<>();

    }
    public void addProduct(Product product){
        if (products.containsKey(product)){
            throw new IllegalArgumentException("Этот продукт уже в списке!");
        }
        products.put(product,count);
        recipeCost += product.getAmountProduct() + count ;
    }

    public String getName() {
        return name;
    }

    public Float getRecipeCost() {
        return recipeCost;
    }

    public Map<Product,Integer> getProducts() {
        return Collections.unmodifiableMap(products);
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