package string1.session4;

public class MinCat { //https://codingbat.com/prob/p105745
    public String minCat(String a, String b) {

        int min = Math.min(a.length(), b.length()); // returns the smaller length

        return a.substring(a.length() - min) + b.substring(b.length() - min);

    }

/*
INSTEAD OF USING MATH.MIN:
int min;

if(a.length() < b.length(){
  min = a.length();
} else {
  min = b.length();
}

*/
}
