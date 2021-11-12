public class TopMaximum {

    public static void top2Maximum(int[] nums){
        int max1 = Integer.MIN_VALUE;
        int max2 =  Integer.MAX_VALUE;

        for( int num : nums){
            if ( max1 < num){
                max2 = max1;
                max1 = num;
            }else if(max2 < num){
                max2 = num;
            }
        }

        System.out.println(max1);
        System.out.println(max2);
    }
}
