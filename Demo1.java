import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<ComparableEg> arrayList=new ArrayList<>();
        ComparableEg p1 = new ComparableEg(1, "Phone", "Vivo", 11000.0);
        ComparableEg p2 = new ComparableEg(2, "Laptop", "Dell", 55000.0);
        ComparableEg p3 = new ComparableEg(3, "Headset", "Boat", 2500.0);
        ComparableEg p4 = new ComparableEg(4, "Tablet", "Samsung", 30000.0);
        ComparableEg p5 = new ComparableEg(5, "Smartwatch", "Noise", 4500.0);
        arrayList.add(p5);
        arrayList.add(p1);
        arrayList.add(p2);
        arrayList.add(p3);
        arrayList.add(p4);
        
        Collections.sort(arrayList);
        for (ComparableEg comparableEg : arrayList) {
            System.out.println(comparableEg);
        }


    }
}
