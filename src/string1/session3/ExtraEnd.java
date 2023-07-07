package string1.session3;

public class ExtraEnd { // https://codingbat.com/prob/p108853
    public String extraEnd(String str) {
        String last2 = str.substring(str.length() - 2);
        return last2 + last2 + last2;
    }

}
