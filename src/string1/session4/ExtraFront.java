package string1.session4;

public class ExtraFront { // https://codingbat.com/prob/p172063
    public String extraFront(String str) {

        String begin = "";

        if(str.length() >= 2){
            begin = str.substring(0,2);
        } else {
            begin = str;
        }

        return begin + begin + begin;
    }

}
