package string2.session5;

public class MixString { // https://codingbat.com/prob/p125185
    public String mixString(String a, String b) {

        int max = Math.max(a.length(), b.length()); // a.length() > b.length() ? a.length() : b.length();

        String result = "";

        for(int i = 0; i < max; i++){

            if(i < a.length()){ // this checks if the a String has a character to give
                result += a.charAt(i);
            }

            if(i < b.length()){ // this checks if the a String has b character to give
                result += b.charAt(i);
            }

        }

        return result;

    }

}
