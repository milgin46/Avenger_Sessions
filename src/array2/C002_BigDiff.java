package array2;

public class C002_BigDiff {

    /*

Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.


bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8
     */


    public static void main(String[] args) {

        int[] arr = {7, 2, 10, 9};
        bigDiff2(arr);
    }


    public static int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int each : nums) {
            if (each < min) {
                min = each;
            }
            if (each>max){
                max=each;
            }

        }

        System.out.println(min);
        System.out.println(max);
        return max-min;


    }


    public static int bigDiff2(int[] nums) {


        int min=nums[0];
        int max=nums[0];
        for (int i = 0; i < nums.length; i++) {
            int current=nums[i];
             min=  Math.min(current,min);
             max=Math.max(current,max);

        }
        System.out.println(min);
        System.out.println(max);

        return  0;
    }


}
