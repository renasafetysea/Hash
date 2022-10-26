import java.util.Objects;

public class Product {

        private final String nameProduct;
        private Float amountProduct;
        public Product(String nameProduct, Float amountProduct) {
                if (nameProduct == null || nameProduct.isBlank()) {
                        System.out.println("Заполните карточку товара полностью");
                        throw new IllegalArgumentException();
                }
                this.nameProduct = nameProduct;
                setAmountProduct(amountProduct);
        }

        public String getNameProduct() {
                return nameProduct;
        }

        public Float getAmountProduct() {
                return amountProduct;
        }

        public void setAmountProduct(Float amountProduct) {
                if (amountProduct == null || amountProduct <= 0) {
                        System.out.println("Заполните карточку товара полностью");
                        throw new IllegalArgumentException();
                }
                this.amountProduct = amountProduct;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Product product = (Product) o;
                return nameProduct.equals(product.nameProduct);
        }

        @Override
        public int hashCode() {
                return Objects.hash(nameProduct);
        }

        @Override
        public String toString() {
                return "Наименование - " + nameProduct +
                        ". Стоимость за кг - " + amountProduct +
                        ". Вес - " + "." ;
        }
}