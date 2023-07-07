package array2;

public class C007_Lucky13 {

    /*

Given an array of ints, return true if the array contains no 1's and no 3's.


lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false
lucky13([3, 2, 4]) → false
     */


    public static void main(String[] args) {

    }

    public static boolean lucky13(int[] nums) {

        boolean result=true;

        for (int num : nums) {
            if (num==1 || num==3){
                result=false;
                break;
            }
        }

return result;
    }



}
