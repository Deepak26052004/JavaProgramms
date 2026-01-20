public class mergeAlternately {
    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
        String res = "";
        int i = 0, j = 0;

        while (i < word1.length() || j < word2.length()) {

            if (i < word1.length()) {
                res += word1.charAt(i++);
            }

            if (j < word2.length()) {
                res += word2.charAt(j++);
            }
        }

        System.out.println(res); 
    }
}
