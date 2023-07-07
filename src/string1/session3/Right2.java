package string1.session3;

public class Right2 { // https://codingbat.com/prob/p130781
    public String right2(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

// public String right2(String str) {
//   int last2 = str.length() - 2;
//   return str.substring(last2) + str.substring(0, last2);
// }

}
