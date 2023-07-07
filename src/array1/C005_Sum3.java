package array1;

public class C005_Sum3 {
/*

Given an array of ints length 3, return the sum of all the elements.


sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7
 */

    public static void main(String[] args) {
        int[] a = {5, 6, 1};
        System.out.println(sum3(a));
    }


    public static int sum3(int[] nums) {

        return nums[0] + nums[1] + nums[2];
    }
}
