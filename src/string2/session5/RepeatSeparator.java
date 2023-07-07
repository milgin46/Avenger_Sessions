package string2.session5;

public class RepeatSeparator { // https://codingbat.com/prob/p109637
    public String repeatSeparator(String word, String sep, int count) {

        String result = "";
        for(int i = 0; i < count; i++){
            result += word + sep;
        }

        return result.substring(0, result.length() - sep.length()); // this removed the last seperated at the end
    }

/*
repeatSeparator("abc", "XX", 2) → "abcXXabc"

  result = abcXXabcXX

  need to remove the extra seperator at the end
    sub(0, ENDINDEX)

    ENDINDEX = based on the seperator length
     normally we do length - 1
     but because the sperator is a word, it is word.length - sep.length

*/
}
