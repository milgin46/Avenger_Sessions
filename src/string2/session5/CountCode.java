package string2.session5;

public class CountCode { // https://codingbat.com/prob/p123614
    public int countCode(String str) {

        int count = 0;
        int co = str.indexOf("co");

        while(co >= 0){

            if(str.length() > co + 3 && str.charAt(co + 3) == 'e'){
                count++;
            }

            str = str.replaceFirst("co", "");
            co = str.indexOf("co");

        }

        return count;

    }

    // alternative with substring

    public int countCode2(String str) {

        int count = 0;

        for(int i = 0 ; i < str.length() - 3; i++){
            String each4 = str.substring(i, i + 2) + "d" + str.charAt(i + 3); // str.substring(i + 2, i + 4)

            if(each4.equals("code")){
                count++;
            }

        }

        return count;

    }

/*
str = cozcop
check 4 at a time
        substring()  -> i, i + 4
cozc  -> 0, 4
ozco  -> 1, 5
zcop  -> 2, 6

*/




}
