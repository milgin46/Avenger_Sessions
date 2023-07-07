package logic1.session1;

public class In1to10 { // https://codingbat.com/prob/p137365
    // public boolean in1To10(int n, boolean outsideMode) {

    //   if(n == 1 || n == 10){
    //     return true;
    //   }

    //   boolean valid = n >= 1 && n <= 10;

    //   return outsideMode ? !valid : valid;
    // }

    public boolean in1To10(int n, boolean outsideMode) {

        if(outsideMode){
            return n <= 1 || n >= 10; // outside 1 - 10
        } else {
            return n >= 1 && n <= 10; // in the range of 1-10
        }
    }

}
