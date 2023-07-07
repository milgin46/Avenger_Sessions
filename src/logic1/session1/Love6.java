package logic1.session1;

public class Love6 { // https://codingbat.com/prob/p137742
    public boolean love6(int a, int b) {

        return a == 6 || b == 6 || (a+b == 6) || Math.abs(a - b) == 6;

    }
/*

abs(-6) -> 6
abs(5) -> 5
abs(-13) -> 13

instead of  Math.abs(a - b) == 6;

(a - b == 6 || b - a == 6)
*/
}
