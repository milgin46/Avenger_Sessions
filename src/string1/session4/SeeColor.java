package string1.session4;

public class SeeColor { // https://codingbat.com/prob/p199216
    public String seeColor(String str) {

        if(str.startsWith("red")){
            return "red";
        } else if(str.startsWith("blue")){
            return "blue";
        } else {
            return "";
        }

    }

}
