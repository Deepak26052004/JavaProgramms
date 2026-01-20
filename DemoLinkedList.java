import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<String> var=new LinkedList<>();
        //insertion Part
        var.add("Ayush Mhatre");
        var.add(0, "Sanju Samson(wk)");
        var.addFirst("Urvil Patel");
        var.addLast("Noor Ahmed");
        var.addLast("Khaleel Ahmed");
        var.add(4, "Nathan Ellis");

        //Get
        System.out.println(var.get(0));
        System.out.println(var.getFirst());
        System.out.println(var.getLast());


        //set
        var.set(0, "Ayush Mhatre (Opener)");
        var.remove();
        var.remove(0);
        var.remove("Khaleel Ahmed");
        var.removeFirst();
        var.removeLast();
        var.clear();

        var.add("Ayush Mhatre");
        var.add(0, "Sanju Samson(wk)");
        var.addFirst("Urvil Patel");
        var.addLast("Noor Ahmed");
        var.add("Ayush Mhatre");
        var.addLast("Khaleel Ahmed");
        var.add(4, "Nathan Ellis");

        System.out.println(var.indexOf("Ayush Mhatre"));
        System.out.println(var.lastIndexOf("Ayush Mhatre"));

        System.out.println(var.size());
        System.out.println(var.isEmpty());
        System.out.println(var.contains("Noor Ahmed"));

        Collections.sort(var);
        var.forEach(x -> System.out.println(x));
        System.out.println("**************************************************");
        Collections.sort(var,Collections.reverseOrder());
        Iterator<String> iterator=var.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
