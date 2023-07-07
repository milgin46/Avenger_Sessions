package string1.session4;

public class WithoutX2 { // https://codingbat.com/prob/p151359
    public String withoutX2(String str) {

        if(str.length() < 2) {
            return "";
        }

        String result = str.substring(2);

        if(str.charAt(1) != 'x'){
            result = str.charAt(1) + result;
        }

        if(str.charAt(0) != 'x'){
            result = str.charAt(0) + result;
        }

        return result;

    }

}
