package array1;

import java.util.Arrays;

public class C007_Reverse3 {


    /*

Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.


reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
     */

    public static void main(String[] args) {

        int [] array={1, 2, 3};
        System.out.println(Arrays.toString(reverse3(array)));
    }

    public static int[] reverse3(int[] nums) {

      //  return new int[]{nums[2],nums[1],nums[0]};
       int [] temp=new int[nums.length];
       // 0   1  2
       //[5, 11, 9]
        /*
        temp[0]=nums[nums.length-1]
        temp[1]=nums[nums.length-2]
        temp[2]=nums[nums.length-3]

         */



        for (int i = 0; i < nums.length; i++) {
            temp[i]=nums[nums.length-1-i];
        }

        return temp;



    }


}
