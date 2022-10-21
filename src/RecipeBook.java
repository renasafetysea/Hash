import java.util.HashSet;
import java.util.Set;

public class RecipeBook {
    private Set <Recipe> recipes;

    public RecipeBook() {
        recipes = new HashSet<>();
    }
    public void addRecipe (Recipe r){
        if (recipes.contains(r)){
            throw new IllegalArgumentException("Рецепт уже записан в поварскую книгу!");
        }
        recipes.add(r);
    }
    public Recipe getRecipeByName(String name){
        return recipes.stream().filter(p ->p.getName().equals(name)).findAny().orElse(null);
    }
}

