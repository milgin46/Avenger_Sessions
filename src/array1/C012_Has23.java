package array1;

import java.util.ArrayList;
import java.util.Arrays;

public class C012_Has23 {
    /**
     *
     Given an int array length 2, return true if it contains a 2 or a 3.


     has23([2, 5]) → true
     has23([4, 3]) → true
     has23([4, 5]) → false

     */

    public static void main(String[] args) {

        int [] array={2,5};
        System.out.println(has23(array));
    }

    public static boolean has23(int[] nums) {
//boolean contains2=nums[0]==2 || nums[1]==2;
//boolean contains3=nums[0]==3 || nums[1]==3;

    // if you do not know the element number you can put elements in arraylist and use ready method
    ArrayList<Integer> arrayList=new ArrayList<>();

        for (int num : nums) {

            arrayList.add(num);
        }


        return arrayList.contains(2) || arrayList.contains(3);







//return  contains2 || contains3;


    }


}
