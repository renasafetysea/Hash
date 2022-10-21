import java.util.HashSet;
import java.util.Set;

public class ProductList {
    private  Set <Product> set;
    public ProductList(){
        set = new HashSet<>();
    }
    public void add(String nameProduct,Float amountProduct, Float weightProduct){
        final Product product = new Product(nameProduct,amountProduct,weightProduct);
        if (set.contains(product)){
            throw new IllegalArgumentException("Продукт уже в корзине!");
        }
        set.add(product);
    }
    public void markAsBought(String name) {
        for (Product product : set) {
            if (name.equals(product.getNameProduct())) {
                product.setPurchased(true);
            }
        }
    }

    public void deleteProduct(String name) {
        set.removeIf(product -> name.equals(product.getNameProduct()));
    }
    public void show(){
        set.forEach(p -> {
            System.out.printf("%s, %.2f кг., %.2f руб, в корзине - %b. ",
                    p.getNameProduct(), p.getAmountProduct(), p.getWeightProduct(), p.isPurchased());
        });
    }
}



