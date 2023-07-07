package logic1.session1;

public class SpecialEleven { //https://codingbat.com/prob/p100962
    public boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1; //(n - 1) % 11 == 0;
    }

/*
n = 22
22 / 11 -> is there any left over
*/

}
