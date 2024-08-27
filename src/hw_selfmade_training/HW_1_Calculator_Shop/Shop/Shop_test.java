//package hw_selfmade_training.HW_1_Calculator_Shop.Shop;
//
///*Задание 2. (необязательное) *
// Мы хотим улучшить функциональность нашего интернет-магазина. Ваша задача - добавить два новых метода в класс Shop:
// Метод sortProductsByPrice(), который сортирует список продуктов по стоимости. Метод getMostExpensiveProduct(),
// который возвращает самый дорогой продукт. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов
// (правильное количество продуктов, верное содержимое корзины).
// Напишите тесты для проверки корректности работы метода getMostExpensiveProduct. Напишите тесты для проверки корректности
// работы метода sortProductsByPrice (проверьте правильность сортировки). Используйте класс Product для создания
// экземпляров продуктов и класс Shop для написания методов сортировки и тестов.*/
//
//import java.util.ArrayList;
//import java.util.List;
//import static org.assertj.core.api.Assertions.*;
//
//public class Shop_test {
//
//    public Shop_test() {
//    }
//
//    public static void main(String[] args) {
//        Shop shop = new Shop();
//        shop.setProducts(getListOfProducts());
//        System.out.println(shop.getProducts());
//        System.out.println(shop.getSortedListProducts());
//        System.out.println(shop.getMostExpensiveProduct());
//        assertThat(shop.getProducts()).isNotNull();
//        assertThat(shop.getProducts().size()).isEqualTo(4);
////        assertThat(shop.getProducts().getFirst()).isEqualTo("carrot");
////        assertThat(shop.getProducts().getLast().getName()).isEqualTo("bread");
////        assertThat(shop.getProducts().getLast().getCost()).isEqualTo(200);
////        assertThat(shop.getProducts().get(1).getName()).isEqualTo("bread");
////        assertThatThrownBy( () -> shop.getProducts().get(1).getCost()).isEqualTo(250); // не разоралась
//
////        assertThat(shop.getProducts().getLast().getName()).contains("cucumber");
////        assertThat(shop.getProducts().getFirst().getName()).doesNotContain("bread");
////        assertThat(shop.getProducts()).isEmpty();
////        if (shop.getProducts().get(0).getName().equals("carrot")) {
////            System.out.println("all's fine");
////        }
////        else {
////            assert false: "Wrong productname";
////        }
//    }
//
//    static List<Product> getListOfProducts(){
//        Product carrot = new Product("carrot", 200);
//        Product bread = new Product("bread", 50);
//        Product milk = new Product("milk", 100);
//        Product cucumber = new Product("cucumber", 250);
//
//        List<Product> listOfProducts = new ArrayList<Product>();
//        listOfProducts.add(carrot);
//        listOfProducts.add(bread);
//        listOfProducts.add(milk);
//        listOfProducts.add(cucumber);
//        return listOfProducts;
//    }
//
//    public static class ShopTest {
//
//            /*
//      Мы хотим улучшить функциональность нашего интернет-магазина. Ваша задача - добавить два новых метода в класс Shop:
//    1. Метод sortProductsByPrice(), который сортирует список продуктов по стоимости. Метод getMostExpensiveProduct(),
//    который возвращает самый дорогой продукт. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов
//    (правильное количество продуктов, верное содержимое корзины).
//    Напишите тесты для проверки корректности работы метода getMostExpensiveProduct. Напишите тесты для проверки корректности
//    работы метода sortProductsByPrice (проверьте правильность сортировки). Используйте класс Product для создания
//    экземпляров продуктов и класс Shop для написания методов сортировки и тестов.
//       */
//
//        private static void testAddProduct() {
//            Shop shop = new Shop();
//            shop.addProduct("Apple", 100);
//            shop.addProduct("Banana", 200);
//            assertThat(shop.getSize()).isEqualTo(2);
//            assertThat(shop.getProducts().getFirst().getTitle()).isEqualTo("Apple");
//            assertThat(shop.getProducts().get(1).getTitle()).isEqualTo("Banana");
//    //        assertEquals(2, shop.getSize());
//    //        assertEquals("Apple", shop.getProducts().get(0).getTitle());
//    //        assertEquals("Banana", shop.getProducts().get(1).getTitle());
//
//        }
//
//
//        private static void testSortProductsByPrice() {
//            Shop shop = new Shop();
//            shop.addProduct("Apple", 100);
//            shop.addProduct("Banana", 200);
//            shop.addProduct("Orange", 300);
//
//            shop.sortProductsByPrice();
//
//            List<Product> sortedProducts = new ArrayList<>(shop.getProducts());
//            assertThat(sortedProducts.getFirst().getTitle()).isEqualTo("Orange");
//            assertThat(sortedProducts.get(1).getTitle()).isEqualTo("Banana");
//            assertThat(sortedProducts.get(2).getTitle()).isEqualTo("Apple");
//    //        assertEquals("Orange", sortedProducts.get(0).getTitle());
//    //        assertEquals("Banana", sortedProducts.get(1).getTitle());
//    //        assertEquals("Apple", sortedProducts.get(2).getTitle());
//        }
//
//        private static void testGetMostExpensiveProduct() {
//            Shop shop = new Shop();
//            shop.addProduct("Apple", 100);
//            shop.addProduct("Banana", 200);
//            shop.addProduct("Orange", 300);
//
//            Product mostExpensiveProduct = shop.getMostExpensiveProduct();
//            assertThat(mostExpensiveProduct).isNotNull();
//            assertThat(mostExpensiveProduct.getTitle()).isEqualTo("Orange");
//
//    //        assertNotNull(mostExpensiveProduct);
//    //        assertEquals("Orange", mostExpensiveProduct.getTitle());
//        }
//
//        public static void main(String[] args) {
//            testAddProduct();
//            testSortProductsByPrice();
//            testGetMostExpensiveProduct();
//        }
//
//    }
//}
