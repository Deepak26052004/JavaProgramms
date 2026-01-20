public class countTriples {
    public static void main(String[] args) {
        int n=5;
        int count=0;
        int c=1;
        while(c<=n){
            for(int a=1;a<c;a++){
                double b=Math.sqrt(c*c-a*a);
                if(b==(int)b &&b<c){
                    count++;
                }
            }
            c++;
        }
        System.out.println(count);
    }
}
