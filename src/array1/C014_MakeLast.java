package array1;

public class C014_MakeLast {
/*
Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.


makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3]
 */
    public static void main(String[] args) {

    }                                        //0 1 2
                                            //[1,2,3]
    public static int[] makeLast(int[] nums) {


        //get the last element
        int last=nums[nums.length-1];

        int [] newArray=new int[nums.length*2]; //[0,0,0,0,0,0]

        //[0,0,0,0,0,0]
        newArray[newArray.length-1]=last;

        //[0,0,0,0,0,3]

        return newArray;





    }

}
