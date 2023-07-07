package array2;

public class C005_Sum67 {
/*
Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.


sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 2, 2, 6, 99, 99, 7,4]) → 9
sum67([1, 1, 6, 7, 2]) → 4
 */

    public static void main(String[] args) {

    }

    public static int sum67(int[] nums) {

        int sum=0;

        for (int i = 0; i < nums.length; i++) {
             //0  1  2  3  4   5   6  7
            //[1, 2, 2, 6, 99, 99, 7,4]

            if (nums[i]!=6){
                sum+=nums[i];
            }else {
        //we are trying to skip the elements between 6 and 7
                while (nums[i]!=7)
                    i++;
            }



        }

        return sum;
    }



}
