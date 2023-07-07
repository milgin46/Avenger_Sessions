package logic1.session2;

public class GreenTicket { // https://codingbat.com/prob/p120633
    public int greenTicket(int a, int b, int c) {

        if(a == b && b == c){ // all the same
            return 20;
        } else if(a != b && c != b && a != c){
            return 0;
        } else {
            return 10;
        }

    }

}
