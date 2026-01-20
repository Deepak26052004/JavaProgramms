package Equals_And_HashCode;

public class IntegerDemo {
    public static void main(String[] args) {

        Integer a = 10;
        Integer b = 10;
        Integer c = 20;

        System.out.println(a.hashCode() == b.hashCode()); // true
        System.out.println(a.hashCode() == c.hashCode()); // false
    }
}
