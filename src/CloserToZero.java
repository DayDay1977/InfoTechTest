public class CloserToZero {

    public static void closerToZero(int[] nums){
        int i;
        int result = 0;

        for(i=0;i<nums.length-1;i++){
            if(nums[i] < nums[i+1]){
                result = nums[i];
            }else{
                result = nums[i+1];
            }
        }
        if(result>nums[0]){
            result = nums[0];
        }
        if(result<0){
            result = result*-1;
        }
        System.out.println(result);
    }
}
