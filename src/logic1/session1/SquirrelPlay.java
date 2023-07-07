package logic1.session1;

public class SquirrelPlay { // https://codingbat.com/prob/p141061
    public boolean squirrelPlay(int temp, boolean isSummer) {

        int maxRange = isSummer ? 100 : 90;

  /*
    int maxRange = 0;
    if(isSummer){
      maxRange = 100;
    }else {
      maxRange = 90;
    }
  */

        return temp >= 60 && temp <= maxRange;
    }

}
