package hw_selfmade_training.HW_1_Calculator_Shop.Shop;

import java.util.*;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class seminar_1_practice {


    public static void main(String[] args) {
//            assertConditionA();

//         assertConditionB();

//         System.out.println(sum(2147483647,3));

//         happyNY();

//        checkingShoppingCart();

//        expectedValue();

//        String [] colors = {"aqua", "yellow", "blue", "green", "golden", "gold"};
//        testingJavaCollectionsAssertJ(colors);

        checkingHero();

    }

    //    public static void assertConditionA() {
//        String[] weekends = new String[]{"Суббота", "Воскресенье"};
//        assert weekends.length == 2; // было assert weekends.length == 3;
//        System.out.println("В неделе " + weekends.length + " дня выходных");
//    }
//
//    public static void assertConditionB() {
//        int x = -1;
//
//        assert x < 0; // было assert x >= 0;
//
//    }
//
//    public static int sum(int a, int b) {
////        assert Integer.MAX_VALUE - a >= b : "Значение выражения вышло за пределы переменной";
////
////        return a + b;
//
//        long result = (long) a + b;
//        assert (result <= Integer.MAX_VALUE && result >= Integer.MIN_VALUE) : "Integer overflow"; // метод сработает если результат больше мах или меньше мин.
//        return (int) result;
//    }

    //
//    public static void happyNY() {
//        Calendar calendar = Calendar.getInstance();
//        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        // было со временем, не только с датой DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//        String currentDateTime = dateFormat.format(calendar.getTime());
//
//        assert currentDateTime.equals("01/01/2023") : "Еще 2024 год :(";
//        // было со временем, не только с датой assert currentDateTime.equals("01/01/2023 00:00:00") : "Еще 2024 год :(";
//        if(currentDateTime.equals("01/01/2025")) {
//            System.out.println("С новым годом!");
//        } else {
//            System.out.println("Еще 2024 год :(");
//        }
//
//    }
//
//    public static void checkingShoppingCart() {
//        ArrayList<String> productCategories = new ArrayList();
//        productCategories.add("fruits");
//        productCategories.add("vegetables");
//        productCategories.add("bakery");
//        productCategories.add("drinks");// добавили категорию напитки для воды
//        ArrayList<String> products = new ArrayList();
//        products.add("apple");
//        products.add("tomato");
//        products.add("bread");
//        products.add("water");
//        Iterator var2 = products.iterator();
//
//        while (var2.hasNext()) {
//            String product = (String) var2.next();
//            if (product.equals("apple")) {
//                System.out.println("category: " + (String) productCategories.get(0));
//            } else if (product.equals("tomato")) {
//                System.out.println("category: " + (String) productCategories.get(1));
//            } else if (product.equals("bread")) {
//                System.out.println("category: " + (String) productCategories.get(2));
//            } else if (product.equals("water")) {
//                System.out.println("category: " + (String) productCategories.get(3)); // добавили категорию напитки для воды
//            } else {
//                assert false : "Unknown category for the product " + product;
//            }
//        }
//    }
//}
//
//    }
//
//    public static void expectedValue() {
////        Assertions.assertThat(5).isEqualTo(sum(2, 3)); // неверный синтаксис
//        Assertions.assertThat(sum(2, 3)).isEqualTo(5); // метод asserThat ожидает получить фактического
//        // значение, а метод isEqualTo ожидает получить ожидаемое, то есть мы ожидаем получить 5 при отработке метода sum
//    }
//}
//
//    public static void testingJavaCollectionsAssertJ(String[] colors) {
//        assertThat(colors)
//                .isNotEmpty()             // Массив не должен быть пустым
//                .hasSize(6)      // Размер массива должен быть равен 4
//                .doesNotHaveDuplicates() // Массив не должен содержать повторяющихся элементов
////                .contains("orange", "green", "violet") // Массив должен содержать цвета: "orange", "green", "violet"
//                .endsWith("gold")   //  Последним цветом в массиве должен быть "gold"
//                .startsWith("aqua")     // Первым цветом в массиве должен быть "aqua"
//                .containsSequence("yellow", "blue")      // В массиве должна быть последовательность цветов "yellow", "blue"
//                .doesNotContain("red", "black"); //Массив не должен содержать цвета: "red", "black"
//    }
//
    public static void checkingHero() {

        List<String> heroBag = Arrays.asList("Bow", "Axe", "Gold");
        Hero emmett = new Hero("Emmett", 50, "sword", heroBag, true);

        /*
        1. Проверить, что герой создался с именем Emmett
        2. Проверить, что значение прочности брони героя равно 50
        3. Проверить, что у героя оружие типа sword
        4. Проверить содержимое инвентаря героя (не пустой, размер 3, содержимое "Bow", "Axe", "Gold", порядок не важен)
        5. Проверить, что герой человек (свойство true)
        */

         assert "Emmett".equals(emmett.getName()): "Name should be Emmett";
         assertThat(emmett.getArmorStrength()).isEqualTo(50);
         assert 50 == emmett.getArmorStrength(): "ArmorStrength should be 50";
         assert "sword".equals(emmett.getWeapon()): "Weapon should be sword";

         List<String> expectedBag = Arrays.asList("Bow", "Axe", "drink");
         assert emmett.getBag().containsAll(expectedBag): "Bag should contain all the emmett's bag elements";
         assert 3 == emmett.getBag().size(): "Bag should be 3";
         assert expectedBag.containsAll(emmett.getBag()): "Bag should contain all the expected elements";
         assert emmett.isHuman(): "Human should be human";


    }

    static class Hero {
        private String name;
        private int armorStrength;
        private String weapon;
        private List<String> bag;
        private boolean isHuman;

        public Hero(String name, int armorStrength, String weapon, List<String> bag, boolean isHuman) {
            this.name = name;
            this.armorStrength = armorStrength;
            this.weapon = weapon;
            this.bag = bag;
            this.isHuman = isHuman;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getArmorStrength() {
            return this.armorStrength;
        }

        public void setArmorStrength(int armorStrength) {
            this.armorStrength = armorStrength;
        }

        public String getWeapon() {
            return this.weapon;
        }

        public void setWeapon(String weapon) {
            this.weapon = weapon;
        }

        public List<String> getBag() {
            return this.bag;
        }

        public void setBag(List<String> bag) {
            this.bag = bag;
        }

        public boolean isHuman() {
            return this.isHuman;
        }

        public void setHuman(boolean human) {
            this.isHuman = human;
        }
    }
}


