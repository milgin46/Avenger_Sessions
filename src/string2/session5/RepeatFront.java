package string2.session5;

public class RepeatFront { // https://codingbat.com/prob/p128796
    public String repeatFront(String str, int n) {

        String result = "";

        for(int i = n; i >= 0; i--){
            result += str.substring(0, i);
        }

        return result;
    }

}
