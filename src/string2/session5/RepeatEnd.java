package string2.session5;

public class RepeatEnd { // https://codingbat.com/prob/p152339
    public String repeatEnd(String str, int n) {

        String end = str.substring(str.length() - n);
        String result = "";

        for(int i = 0; i < n; i++){
            result += end;
        }

        return result;
    }

}
