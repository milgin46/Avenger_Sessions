package string1.session4;

public class WithoutX { // https://codingbat.com/prob/p151940
    public String withoutX(String str) {

        if(str.startsWith("x")){
            str = str.substring(1);
        }
        if(str.endsWith("x")){
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }

}
