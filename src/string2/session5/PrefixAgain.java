package string2.session5;

public class PrefixAgain { // https://codingbat.com/prob/p136417

    public boolean prefixAgain(String str, int n) {
        return str.substring(n).contains(str.substring(0,n));
    }

//    public boolean prefixAgain(String str, int n) {
//        String begin = str.substring(0, n);
//        String remain = str.substring(n);
//
//        return remain.contains(begin);
//    }
}
