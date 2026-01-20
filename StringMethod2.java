public class StringMethod2 {
    public static void main(String[] args) {
        String string="Deepak";
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
        System.out.println(string.concat(" CSK"));
        String s1="          Ruturaj Gaiwad             ";
        System.out.println(s1.trim());
        System.out.println(string.substring(1));
        System.out.println(string.substring(1, 4));
        System.out.println(string.equals("deepak"));
        System.out.println(string.equalsIgnoreCase("deepak"));
        System.out.println(s1.contains("Gai"));
        System.out.println(s1.isEmpty());
        char c[]=string.toCharArray();
        for (char d : c) {
           System.out.println(d); 
        }
        byte a[]=string.getBytes();
        System.out.println(a);
        for (byte b : a) {
            System.out.println(b);
        }
        

    }
}
