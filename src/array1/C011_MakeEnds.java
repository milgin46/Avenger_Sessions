package array1;

public class C011_MakeEnds {

    /*
    Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.


makeEnds([1, 2, 3]) → [1, 3]
makeEnds([1, 2, 3, 4]) → [1, 4]
makeEnds([7, 4, 6, 2]) → [7, 2]
     */

    public static void main(String[] args) {

    }

    public static int[] makeEnds(int[] nums) {
        //last element index is ALWAYS array.length-1 if the element is not empty
       return  new int[]{nums[0],nums[nums.length-1]};
    }



}
