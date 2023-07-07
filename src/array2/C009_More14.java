package array2;

public class C009_More14 {

    /*

Given an array of ints, return true if the number of 1's is greater than the number of 4's


more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
     */

    public static void main(String[] args) {

    }

    public boolean more14(int[] nums) {
        int countOf1 = 0;
        int countOf4 = 0;
        for (int num : nums) {

            if (num == 1)
                countOf1++;
            if (num == 4)
                countOf4++;

        }

        return countOf1 > countOf4;

    }


}
