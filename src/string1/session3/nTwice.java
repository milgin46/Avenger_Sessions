package string1.session3;

public class nTwice { // https://codingbat.com/prob/p174148
    public String nTwice(String str, int n) {
        return str.substring(0,n) + str.substring(str.length() - n);
    }

}
