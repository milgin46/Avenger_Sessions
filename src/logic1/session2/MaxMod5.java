package logic1.session2;

public class MaxMod5 { // https://codingbat.com/prob/p115384
    public int maxMod5(int a, int b) {

        if(a == b){
            return 0;
        }

        boolean findSmall = a % 5 == b % 5;

        if(findSmall){
            return Math.min(a, b); // a < b ? a : b;
        } else {
            return Math.max(a, b); // a > b ? a : b;
        }


    }

/*
  if(a == b){
    return 0;
  } else if(a % 5 == b % 5){
    if(a < b){
      return a;
    } else {
      return b;
    }
  } else {
      if(a > b){
      return a;
    } else {
      return b;
    }
  }
  */

}
