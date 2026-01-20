public class StringMethod {
    public static void main(String[] args) {
        String s="Hi How are you I am Fine, Hi How was your day";

        System.out.println(s.charAt(5));

        System.out.println(s.indexOf('H'));
        
        System.out.println(s.indexOf('H', 5));

        System.out.println(s.indexOf("How"));

        System.out.println(s.indexOf("How",5));

        System.out.println(s.lastIndexOf('H'));
        System.out.println(s.lastIndexOf('H',28));

        System.out.println(s.lastIndexOf("Hi"));
        System.out.println(s.lastIndexOf("Hi", 25));

        System.out.println(s.length());
        
    }
}
