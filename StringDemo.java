package Equals_And_HashCode;

public class StringDemo {
    public static void main(String[] args) {
        String s1,s2,s3,s4,s5;
        s1="Java";
        s2=new String("Java");
        s3="SQL";
        s4=new String("Js");
        s5=new String("Js");

        System.out.println(s1==s2);//false
        System.out.println(s2.equals(s1));//true
        System.out.println(s5.hashCode()==s4.hashCode());//true
        System.out.println(s1.hashCode()==s2.hashCode());//true
    }
    
}
