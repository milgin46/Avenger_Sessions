package string1.session4;

public class AtFirst { // https://codingbat.com/prob/p139076
    public String atFirst(String str) {

        if(str.isEmpty()){
            return "@@";
        } else if(str.length() == 1){
            return str + "@";
        }

        return str.substring(0,2);
    }

}
