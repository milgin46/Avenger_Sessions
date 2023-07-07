package logic1.session2;

public class InOrder { // https://codingbat.com/prob/p154188
    public boolean inOrder(int a, int b, int c, boolean bOk) {

        boolean boolC = c > b;
        boolean boolB = b > a;

        return boolC && (bOk || boolB);

    }

}
