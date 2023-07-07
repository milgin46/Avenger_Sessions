package logic1.session2;

public class TeenSum { // https://codingbat.com/prob/p178728
    public int teenSum(int a, int b) {

        if(a >= 13 && a <= 19 || b >= 13 && b <= 19){
            return 19;
        }

        return a + b;
    }

}
