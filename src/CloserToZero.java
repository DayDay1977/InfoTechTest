public class CloserToZero {
    public static void closerToZero(){
        int i;
        int result = 0;
        int[] nums = {1,5,9,8,6,7,3};

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
        System.out.println(result);
    }
}
