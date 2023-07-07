package string1.session4;

public class FrontAgain { // https://codingbat.com/prob/p196652
    public boolean frontAgain(String str) {
        return str.length() > 1 ? str.endsWith(str.substring(0,2)) : false;
    }

// public boolean frontAgain(String str) {

//   if(str.length() < 2){
//     return false;
//   }

//   return str.endsWith(str.substring(0,2));
// }
}

