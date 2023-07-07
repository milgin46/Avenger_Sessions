package logic1.session3;

public class BlueTicket { // https://codingbat.com/prob/p192267
    public int blueTicket(int a, int b, int c) {

        int ab = a + b; // 15
        int bc = b + c; // 5
        int ac = a + c; // 20

        if(ab == 10 || bc == 10 || ac == 10){
            return 10;
        } else if(ab == bc + 10 || ab == ac + 10){
            return 5;
        } else {
            return 0;
        }

    }

}
