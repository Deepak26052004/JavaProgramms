package Equals_And_HashCode;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
public class Product {
    private int pId;
    private StringDemo pName;
    public Product(int pId,StringDemo pName){
        this.pId=pId;
        this.pName=pName;
    }
    @Override
    public StringDemo toString(){
        return pId+" : "+pName;
    }

    @Override
    public boolean equals(Object object) {
        if (this==object) return true;
        if(object==null || getClass() != object.getClass()) return false;
        Product product=(Product) object;
        return this.pId==product.pId && this.pName.equals(product.pName);
    }
    @Override
    public int hashCode(){
        return Objects.hash(pId,pName);
    }
    public static void main(StringDemo[] args) {
        Product product=new Product(101, "Mobile");
        Product product2=new Product(102, "Laptop");
        Product product3=new Product(103, "Tap");
        Product product4=new Product(104,"Smart Watch");
        Product product5=new Product(105, "Tv");
        Product product6=new Product(102, "Laptop");
        Set<Product> set = new HashSet<>();
        System.out.println(set.add(product));
        System.out.println(set.add(product2));
        System.out.println(set.add(product3));
        System.out.println(set.add(product4));
        System.out.println(set.add(product5));
        System.out.println(set.add(product6));


    }


}
