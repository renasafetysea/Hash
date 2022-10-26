import java.util.HashSet;
import java.util.Set;

public class ProductList {
    private final Set <Product> set;
    public ProductList(){
        set = new HashSet<>();
    }
    public void add(String nameProduct,Float amountProduct){
        final Product product = new Product(nameProduct,amountProduct);
        if (set.contains(product)){
            throw new IllegalArgumentException("Продукт уже в корзине!");
        }
        set.add(product);
    }

    public void deleteProduct(String name) {
        set.removeIf(product -> name.equals(product.getNameProduct()));
    }

    public void show(){
        set.forEach(p -> {
            System.out.printf("%s, %.2f кг. ",
                    p.getNameProduct(), p.getAmountProduct());
        });
    }
}