package string2.session5;

public class XyzMiddle { //  https://codingbat.com/prob/p159772
    public boolean xyzMiddle(String str) {

        int index = str.indexOf("xyz", str.length()/2 - 3); // the 2nd arg defines the start point of the indexOf

        if(index < 0 ){
            return false;
        }

        String before = str.substring(0, index);
        String after = str.substring(index + 3);

        int bLen = before.length();
        int aLen = after.length();

        return bLen == aLen || bLen + 1 == aLen || aLen + 1 == bLen;

    }

}
