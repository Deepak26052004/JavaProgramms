import java.util.Arrays;

public class LeetCodeMedianProblem {
    public static void main(String[] args) {
        int [] nums1 = {1,2};
        int [] nums2 = {3,4};
        int res[]=new int[nums1.length+nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            res[nums1.length + i] = nums2[i];
        }
        Arrays.sort(res);
        double c=0;
        if(res.length%2==0) c = (res[res.length / 2] + res[(res.length / 2) - 1]) / 2.0;
        else c=res[res.length/2];
        System.out.println(c);
    }
}
