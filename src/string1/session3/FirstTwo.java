package string1.session3;

public class FirstTwo { /// https://codingbat.com/prob/p163411
    public String firstTwo(String str) {

        if(str.length() < 2){
            return str;
        }

        return str.substring(0,2);
    }

}
