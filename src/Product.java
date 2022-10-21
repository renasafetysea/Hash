import java.util.Objects;

public class Product {

        private final String nameProduct;
        private Float amountProduct;
        private Float weightProduct;
        private boolean isPurchased;

        public Product(String nameProduct, Float amountProduct, Float weightProduct) {
                if (nameProduct == null || nameProduct.isBlank()) {
                        System.out.println("Заполните карточку товара полностью");
                        throw new IllegalArgumentException();
                }
                this.nameProduct = nameProduct;
                setAmountProduct(amountProduct);
                setWeightProduct(weightProduct);
                isPurchased = false;
        }

        public String getNameProduct() {
                return nameProduct;
        }

        public Float getAmountProduct() {
                return amountProduct;
        }

        public Float getWeightProduct() {
                return weightProduct;
        }

        public boolean isPurchased() {
                return isPurchased;
        }

        public void setAmountProduct(Float amountProduct) {
                if (amountProduct == null || amountProduct <= 0) {
                        System.out.println("Заполните карточку товара полностью");
                        throw new IllegalArgumentException();
        }
                this.amountProduct = amountProduct;
        }

        public void setWeightProduct(Float weightProduct) {
                if (weightProduct == null || weightProduct <= 0) {
                        System.out.println("Заполните карточку товара полностью");
                        throw new IllegalArgumentException();
                        }
                this.weightProduct = weightProduct;
        }

        public void setPurchased(boolean purchased) {
                isPurchased = purchased;
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
                        ". Вес - " + weightProduct +
                        ". В корзине - " + isPurchased ;
        }
}
