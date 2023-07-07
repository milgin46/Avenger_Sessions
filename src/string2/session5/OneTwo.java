package string2.session5;

public class OneTwo { // https://codingbat.com/prob/p122943
    public String oneTwo(String str) {

        String result = "";

        for(int i = 0; i < str.length() - 2; i += 3){

            result += str.substring(i + 1, i + 3) + str.charAt(i);

        }

        return result;
    }

}
