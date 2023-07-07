package array2;

public class C006_Has22 {

/*
Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
,

has22([1, 2, 2,3,2,4,5,6,7,8,9,0]) → true
has22([1, 2, 1, 2]) → false
has22([2, 1, 2]) → false
 */


    public static void main(String[] args) {

    }

    public static boolean has22(int[] nums) {
        boolean isTrue=false;

        for (int i = 0; i < nums.length-1; i++) {

            int current=nums[i];
            int next=nums[i+1];

            if (current==2 && next==2){
                isTrue=true;
                break;
            }

        }




        return isTrue;
    }

}
