import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product product,Product product2){
        return product.price.compareTo(product2.price);
    }
}
 class PriceComparator2 implements Comparator<Product> {
    @Override
    public int compare(Product product,Product product2){
        return product2.price.compareTo(product.price);
    }
}
