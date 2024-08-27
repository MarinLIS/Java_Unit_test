package hw_selfmade_training.HW_1_Calculator_Shop.Shop;

public class Product implements Comparable<Product>{
    String name;
    Integer cost;


    public Product(String name, Integer cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public Integer getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product  " +"name='" + name  + ", cost=" + cost +'\n';

    }

    @Override
    public int compareTo(Product o) {
        return this.getCost().compareTo(o.getCost());
    }
}
