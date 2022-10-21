import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        var productList = new ProductList();

        productList.add("Лук", 50f,10f);
        productList.add("Помидор", 100f, 25f);
        productList.add("Огурец", 150f, 13f);
        productList.add("Редис", 200f, 31f);
        productList.add("Свекла", 250f, 14f);
        productList.add("Тыква", 125f, 35f);
        productList.add("Картошка", 50f,10f);
        productList.add("Спаржа",330f,55f);

        productList.show();

        var recipeBook = new RecipeBook();

        var recipe = new Recipe("Салат из овощей");
        recipe.addProduct(new Product("Помидор", 100f, 25f));
        recipe.addProduct(new Product("Огурец", 150f, 13f));
        recipeBook.addRecipe(recipe);
        }





    }