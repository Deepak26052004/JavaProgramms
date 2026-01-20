public class repeatedSubstringPattern {
    public static void main(String[] args) {
        String s = "abcabcabcabc";
        String c="";
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(c.indexOf(a) == -1) c+=a;
        }
        System.out.println(s.indexOf(c) != s.lastIndexOf(c));
    }
    // Not Completed
}
