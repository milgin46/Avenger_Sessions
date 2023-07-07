package string1.session3;

public class ComboString { // https://codingbat.com/prob/p168564
    public String comboString(String a, String b) {

        String small;
        String big;

        if(a.length() < b.length()){
            small = a;
            big = b;
        } else {
            small = b;
            big = a;
        }

        return small + big + small;

    }

}
