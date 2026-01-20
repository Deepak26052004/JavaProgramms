import java.util.HashSet;
import java.util.Iterator;

public class DemoHashSet {
    public static void main(String[] args) {
        HashSet<String> var=new HashSet<>();
        var.add("Deepak");
        var.add("mahesh");
        var.add("Suriya");
        var.add("Udhay");
        var.add("Deepak");
        var.add("Udhay");
        System.out.println(var);
        var.remove("Deepak");
        System.out.println(var);
        HashSet<String> var2=new HashSet<>();
        var2.add("Professor");
        var2.add("Raquel");
        var2.add("Rio");
        var.addAll(var2);
        System.out.println(var);
        var.clear();
        var.add("mahesh");
        var.add("Suriya");
        var.add("Udhay");
        var.add("Deepak");
        var.add("Udhay");
        var2.add("Professor");
        var2.add("Raquel");
        var2.add("Rio");
        var.addAll(var2);
        System.out.println(var);
        var.removeAll(var2);
        System.out.println(var);

        System.out.println(var.size());
        System.out.println(var2.size());
        System.out.println(var.isEmpty());

        var.forEach( r -> System.out.println(r));
        var.forEach( r -> System.out.println("Mr. "+r));

        Iterator<String> iterator=var2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
