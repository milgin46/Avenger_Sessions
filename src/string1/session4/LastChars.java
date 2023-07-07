package string1.session4;

public class LastChars { // https://codingbat.com/prob/p138183
    public String lastChars(String a, String b) {

        String result = "";

        if(a.isEmpty()){
            result += "@";
        } else {
            result += a.charAt(0); // sub(0, 1)
        }

        if(b.isEmpty()){
            result += "@";
        } else {
            result += b.charAt(b.length() - 1); // sub(length - 1)
        }

        return result;
    }

}
