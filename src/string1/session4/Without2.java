package string1.session4;

public class Without2 { // https://codingbat.com/prob/p142247
    public String without2(String str) {

        if(str.length() >= 2 && str.endsWith(str.substring(0,2))){
            return str.substring(2);
        }

        return str;
    }

}
