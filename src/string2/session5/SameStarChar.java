package string2.session5;

public class SameStarChar { // https://codingbat.com/prob/p194491
    public boolean sameStarChar(String str) {

        for(int i = 1; i < str.length()-1; i++){

            if(str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)){
                return false;
            }

        }

        return true;
    }

}
