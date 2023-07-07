package string1.session3;

public class MakeOutWord { //https://codingbat.com/prob/p184030
    public String makeOutWord(String out, String word) {
        int mid = out.length()/2;
        return out.substring(0, mid) + word + out.substring(mid);
    }

}
