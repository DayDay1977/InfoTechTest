import java.util.HashSet;
import java.util.Set;

public class NoDuplicate {

    public static void noDuplicate(int[] nums){
        int i;
        Set<Integer> result = new HashSet<>();
        for (i=0; i<nums.length; i++){
            result.add(nums[i]);
        }
        result.forEach(System.out::println);
    }

}
