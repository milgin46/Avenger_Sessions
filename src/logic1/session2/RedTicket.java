package logic1.session2;

public class RedTicket { // https://codingbat.com/prob/p170833
    public int redTicket(int a, int b, int c) {

        if(a + b + c == 6){
            return 10;
        } else if(a == b && b == c){
            return 5;
        } else if(a != b && a != c){
            return 1;
        } else {
            return 0;
        }

    }

}
