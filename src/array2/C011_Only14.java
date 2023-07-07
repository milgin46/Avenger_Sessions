package array2;

public class C011_Only14 {

    /*

Given an array of ints, return true if every element is a 1 or a 4.


only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true
only14([4, 4]) → true
only14([4, 5]) → false
     */

    public static void main(String[] args) {

    }

    public boolean only14(int[] nums) {

        boolean isValid=true; //vaild means my elements are 1 or 4

        for (int num : nums) {

          //  if (!(num==1 || num==4)){  ==  if ((num!=1 && num!=4)){
            if ((num!=1 && num!=4)){
                isValid=false;
                break;
            }

        }


        return isValid;
    }


}
