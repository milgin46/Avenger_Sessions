package logic1.session2;

public class LastDigit { // https://codingbat.com/prob/p169213
    public boolean lastDigit(int a, int b, int c) {

        // doing number % 10 will give the last digit of the number
        a = a % 10;
        b %= 10;
        c %= 10;

        return a == b || b == c || c == a;

    }
// 3 % 10 => 3 3:10 est
}
