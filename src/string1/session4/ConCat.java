package string1.session4;

public class ConCat { // https://codingbat.com/prob/p132118
    public String conCat(String a, String b) {

        if(a.isEmpty() || b.isEmpty()){
            return a + b;
        }

        if(a.endsWith(b.substring(0,1))){  // "" + b.charAt(0)
            return a + b.substring(1);
        }

        return a + b;
    }

}
