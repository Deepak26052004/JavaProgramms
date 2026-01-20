public class countPartitions {
    public static void main(String[] args) {
        int []nums = {2,4,6,8};
        int i=0,left=0,right=0,c=0;
        while (i<=nums.length-2) {
            left=0;right=0;
            for(int j=0;j<=i;j++){
                left+=nums[j];
            }
            for(int z=i+1;z<nums.length;z++){
                right +=nums[z];
            }
            if((Math.abs(left-right)) % 2 ==0) c++;
            i++;
        }
        System.out.println(c);
    }
}
