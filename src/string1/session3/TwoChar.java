package string1.session3;

public class TwoChar { // https://codingbat.com/prob/p144623
    public String twoChar(String str, int index) {

        if(index > str.length() - 2 || index < 0){
            return str.substring(0,2);
        }

        return str.substring(index, index + 2);
    }

}
