package string1.session3;

public class WithoutEnd2 { // https://codingbat.com/prob/p174254
    public String withouEnd2(String str) {

        if(str.length() <= 2){
            return "";
        }

        return str.substring(1, str.length()-1);
    }

}
