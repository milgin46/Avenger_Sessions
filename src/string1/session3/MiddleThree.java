package string1.session3;

public class MiddleThree { /// https://codingbat.com/prob/p115863
    public String middleThree(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 2);
        //return "" + str.charAt(mid - 1) + str.charAt(mid) + str.charAt(mid + 1);
    }

}
