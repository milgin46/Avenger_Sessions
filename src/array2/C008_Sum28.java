package array2;

public class C008_Sum28 {

    /*

Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.


sum28([2, 3, 2, 2, 4, 2]) → true
sum28([2, 3, 2, 2, 4, 2, 2]) → false
sum28([1, 2, 3, 4]) → false
     */

    public static void main(String[] args) {

    }

    public boolean sum28(int[] nums) {

        int countOf2=0;
        int sum=0;
       /* for (int num : nums) {
            if (num==2)
                countOf2++;
        }

        */
/*
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==2)
                countOf2++;
        }

 */

        for (int num : nums) {
            if (num==2){
                sum+=num;
            }
        }

      //  return sum==8;

        return countOf2==4;
    }


}
