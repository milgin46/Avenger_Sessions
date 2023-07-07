package string2.session4;

public class CountHi { // https://codingbat.com/prob/p147448
    public int countHi(String str) {
        int count = 0;
        while(str.contains("hi")){
            str = str.replaceFirst("hi", "");
            count++;
        }

        return count;
    }

}
