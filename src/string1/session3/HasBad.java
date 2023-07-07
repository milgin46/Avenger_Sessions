package string1.session3;

public class HasBad { //https://codingbat.com/prob/p139075
    public boolean hasBad(String str) {
        int index = str.indexOf("bad");
        return index == 0 || index == 1;
    }

//    public boolean hasBad(String str) {
//        return !str.isEmpty() && (str.startsWith("bad") || str.substring(1).startsWith("bad"));
//    }

}
