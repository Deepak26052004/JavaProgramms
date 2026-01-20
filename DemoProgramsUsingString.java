public class DemoProgramsUsingString {
    public static void main(String[] args) {
        String s1=new String();
        System.out.println("S1:"+s1);

        String s2=new String("Java");
        System.out.println("S2:"+s2);

        char[] c={'J','A','V','A'};
        String s3=new String(c);
        System.out.println("S3:"+s3);

        byte[] b={65,66,67,68,69,90};
        String s4=new String(b);
        System.out.println("S4:"+s4);

        StringBuffer sb=new StringBuffer("Hello String Buffer");
        String s5=new String(sb);
        System.out.println("S5:"+s5);

        StringBuilder sbr=new StringBuilder("Hello String Builder");
        String s6=new String(sbr);
        System.out.println("S6:"+s6);


    }
}
