package logic1.session3;

public class SumLimit { // https://codingbat.com/prob/p118077
    public int sumLimit(int a, int b) {

        int sum = a + b;

        if(String.valueOf(sum).length() > String.valueOf(a).length()){
            return a;
        } else {
            return sum;
        }

    }

}
