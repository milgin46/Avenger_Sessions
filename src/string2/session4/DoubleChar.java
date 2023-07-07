package string2.session4;

public class DoubleChar { // https://codingbat.com/prob/p165312
    public String doubleChar(String str) {

        String result = "";

        for(int i = 0; i < str.length(); i++){
            result += "" + str.charAt(i) + str.charAt(i);
        }

        return result;
    }

// public String doubleChar(String str) { // WWoorrdd

//   for(int i = 0; i < str.length(); i+= 2){
//     str = str.substring(0, i) + str.charAt(i) + str.substring(i);
//   }

//   return str;
// }

}
