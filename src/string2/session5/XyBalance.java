package string2.session5;

public class XyBalance { // https://codingbat.com/prob/p134250
    public boolean xyBalance(String str) {

        for(int i = 0; i < str.length(); i++){ // the loop tries to find when the String is not balanced

            if(str.charAt(i) == 'x' && !str.substring(i).contains("y")){
                return false;
            }

        }


        return true; // returns true always
    }

}
