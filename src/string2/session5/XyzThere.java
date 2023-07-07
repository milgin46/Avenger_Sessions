package string2.session5;

public class XyzThere { // https://codingbat.com/prob/p136594
    public boolean xyzThere(String str) {

        for(int i = 1; i < str.length() - 2; i++){

            String each3 = str.substring(i , i + 3);

            if(each3.equals("xyz") && str.charAt(i - 1) != '.'){
                return true;
            }

        }

        return str.startsWith("xyz");

    }

}
