package string2.session5;

public class GetSandwich { // https://codingbat.com/prob/p129952
    public String getSandwich(String str) {

        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");

        if(first < 0 || first == last){
            return "";
        }

        return str.substring(first + 5, last);

    }

}
