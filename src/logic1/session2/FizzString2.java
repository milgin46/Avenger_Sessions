package logic1.session2;

public class FizzString2 { // https://codingbat.com/prob/p115243
    public String fizzString2(int n) {

        String result = "";

        if(n % 3 == 0){
            result += "Fizz";
        }

        if(n % 5 == 0){
            result += "Buzz";
        }


        return (result.isEmpty() ? n : result) + "!";
    }

}


/*

if(result.isEmpty()){
  return n + "!":
} else {
  return result + "!";
}

*/
