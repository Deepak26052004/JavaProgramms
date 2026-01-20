import java.util.Arrays;

public class eg {
    public static void main(String[] args) {
        String s="deepak";
        char [] c=s.toCharArray();
        System.out.println(Arrays.toString(c));
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }

    }
}
