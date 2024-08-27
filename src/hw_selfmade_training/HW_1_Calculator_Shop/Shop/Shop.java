package hw_selfmade_training.HW_1_Calculator_Shop.Shop;

import java.util.Collections;
import java.util.List;

public class Shop{

    private List<Product> products;

    public Shop() {
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> getSortedListProducts() {
        Collections.sort(this.products);
        return this.products;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        return (Product)this.getSortedListProducts().get(products.size()-1);
    }
}
