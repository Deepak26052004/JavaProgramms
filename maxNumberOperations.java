import java.util.ArrayList;

public class maxNumberOperations {
    public static void main(String[] args) {
        int nums[] = {5,3};

        if(nums.length < 2){
            System.out.println(0);
            return;
        }
        ArrayList<Integer> a=new ArrayList<>();
        for (int n : nums) {
            a.add(n);
        }

        int target=a.get(0)+a.get(1);
        int count=1;
        a.subList(0, 2).clear();

        while(a.size()>=2){
            if(a.get(0)+a.get(1)==target){
                a.subList(0, 2).clear();
                count++;
            } else{
                break;
            }
        }

        System.out.println(count);
    }
}
