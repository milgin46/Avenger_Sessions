package logic1.session2;

public class LessBy10 { // https://codingbat.com/prob/p179196
    public boolean lessBy10(int a, int b, int c) {

        boolean ab = Math.abs(a - b) >= 10;
        boolean bc = Math.abs(b - c) >= 10;
        boolean ac = Math.abs(a - c) >= 10;

        return ab || bc || ac;
    }

// Math.abs() -> returns the value, ignore positive/negative
// |-4| -> 4
// Math.abs(-4) -> 4

}
