package string1.session3;

public class TheEnd { // https://codingbat.com/prob/p162477
    public String theEnd(String str, boolean front) {
        return front ? str.substring(0,1) : str.substring(str.length()-1);
        //return front ? "" + str.charAt(0) : "" + str.charAt(str.length()-1);
    }

//    public String theEnd(String str, boolean front) {
//
//        if(front){
//            return str.substring(0,1);
//        } else {
//            return str.substring(str.length()-1);
//        }
//
//    }
}
