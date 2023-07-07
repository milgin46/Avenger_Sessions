package array1;

public class C004_CommonEnd {
/*

Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.


commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true
 */

    public static void main(String[] args) {
int [] a={1,2,3};
int [] b={1,2,3};
        System.out.println(commonEnd(a,b));
    }

    public static boolean commonEnd(int[] a, int[] b) {

        if (a.length<1 || b.length<1)
            return false;
       int firstA =a[0];
       int firstB =b[0];
       int lastA =a[a.length-1];
       int lastB =b[b.length-1];

       if (firstA==firstB || lastA==lastB)
           return true;

       else
           return false;


    }

}
