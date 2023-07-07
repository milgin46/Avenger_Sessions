package logic1.session1;

public class Old35 { // https://codingbat.com/prob/p159612
    public boolean old35(int n) {
        if(n % 15 == 0){ // the number is divisibly by 3 and 5
            return false;
        }

        return n % 3 == 0 || n % 5 == 0;

    }

}
