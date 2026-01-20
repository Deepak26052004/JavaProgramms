import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Phone", "Vivo", 11000.0);
        Product p2 = new Product(2, "Laptop", "Dell", 55000.0);
        Product p3 = new Product(3, "Headset", "Boat", 2500.0);
        Product p4 = new Product(4, "Tablet", "Samsung", 30000.0);
        Product p5 = new Product(5, "Smartwatch", "Noise", 4500.0);
        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        PriceComparator priceComparator=new PriceComparator();
        PriceComparator2 priceComparator2=new PriceComparator2();
        Collections.sort(products,priceComparator2);
        for (Product product : products) {
            System.out.println(product);
        }


    }
    
}
