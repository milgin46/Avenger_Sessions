package logic1.session2;

public class WithoutDoubles { // https://codingbat.com/prob/p115233
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {

        if(noDoubles && die1 == die2){
            die1++;
            if(die1 == 7){
                die1 = 1;
            }
        }

        return die1 + die2;

    }

}
