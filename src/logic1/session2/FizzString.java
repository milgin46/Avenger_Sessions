package logic1.session2;

public class FizzString { // https://codingbat.com/prob/p137136
    public String fizzString(String str) {

        boolean f = str.startsWith("f"); // str.charAt(0) == 'f'
        boolean b = str.endsWith("b"); // str.charAt(str.length() - 1)

        if(f && b){
            return "FizzBuzz";
        } else if(f) {
            return "Fizz";
        } else if(b){
            return "Buzz";
        } else {
            return str;
        }

        // return f && b ? "FizzBuzz" : f ? "Fizz" : b ? "Buzz" : str;
    }

}
