public class TopMaximum {

    public void top2Maximum(){
        int max1 = Integer.MIN_VALUE;
        int max2 =  Integer.MAX_VALUE;
        int[] nums = {1,2,3,4,5,6};

        for( int num : nums){
            if ( num > max1){
                max1 = num;
            }else if(max2 > max1){
                max2 = max1;
            }
        }

        System.out.println(max1);
        System.out.println(max2);
    }
}
