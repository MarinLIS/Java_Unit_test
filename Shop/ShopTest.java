package src.seminars.first.Shop;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ShopTest {

        /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов,
   верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */

    private static void testAddProduct() {
        Shop shop = new Shop();
        shop.addProduct("Apple", 100);
        shop.addProduct("Banana", 200);
        assertEquals(2, shop.getSize());
        assertEquals("Apple", shop.getProducts().get(0).getTitle());
        assertEquals("Banana", shop.getProducts().get(1).getTitle());
    }


    private static void testSortProductsByPrice() {
        Shop shop = new Shop();
        shop.addProduct("Apple", 100);
        shop.addProduct("Banana", 200);
        shop.addProduct("Orange", 300);

        shop.sortProductsByPrice();

        List<Product> sortedProducts = new ArrayList<>(shop.getProducts());
        assertEquals("Orange", sortedProducts.get(0).getTitle());
        assertEquals("Banana", sortedProducts.get(1).getTitle());
        assertEquals("Apple", sortedProducts.get(2).getTitle());
    }

    private static void testGetMostExpensiveProduct() {
        Shop shop = new Shop();
        shop.addProduct("Apple", 100);
        shop.addProduct("Banana", 200);
        shop.addProduct("Orange", 300);

        Product mostExpensiveProduct = shop.getMostExpensiveProduct();
        assertNotNull(mostExpensiveProduct);
        assertEquals("Orange", mostExpensiveProduct.getTitle());
    }

    public static void main(String[] args) {
        testAddProduct();
        testSortProductsByPrice();
        testGetMostExpensiveProduct();
    }

}
