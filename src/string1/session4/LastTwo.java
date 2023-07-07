package string1.session4;

public class LastTwo { // https://codingbat.com/prob/p194786
    public String lastTwo(String str) {

        if(str.length() < 2){
            return str;
        }

        int lastIndex = str.length() - 1;
        return str.substring(0, lastIndex - 1) + str.charAt(lastIndex) + str.charAt(lastIndex - 1);
    }

}
