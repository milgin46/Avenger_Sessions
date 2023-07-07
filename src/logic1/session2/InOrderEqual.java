package logic1.session2;

public class InOrderEqual { // https://codingbat.com/prob/p140272
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {

        boolean boolA = a < b && b < c;

        if(equalOk){
            boolA = a <= b && b <= c;
        }

        return boolA;

    }

}
