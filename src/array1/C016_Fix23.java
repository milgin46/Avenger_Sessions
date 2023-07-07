package array1;

import java.util.Arrays;

public class C016_Fix23 {

    /*
    Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.


fix23([1, 2, 3]) → [1, 2, 0]
fix23([2, 3, 5]) → [2, 0, 5]
fix23([1, 2, 1]) → [1, 2, 1]
     */


    public static void main(String[] args) {
        int[] ar = {1, 2, 3};
        System.out.println(Arrays.toString(fix23(ar)));
        //in roder to print array we need t ouse Arrays.toString(arrayName)
    }

    public static int[] fix23(int[] nums) {

        //if we have two in first place and if we hae 3 in second we will change the 3 to 0


        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        }


        //if we have two in second place and if we hae 3 in third we will change the 3 to 0


        if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }

        return nums;


    }

}
