package logic1.session1;

public class CaughtSpeeding { // https://codingbat.com/prob/p157733
    public int caughtSpeeding(int speed, boolean isBirthday) {

        int min = isBirthday ? 66 : 61;
        int limit = isBirthday ? 85 : 80;

        if(speed >= min && speed <= limit){
            return 1;
        } else if(speed > limit){
            return 2;
        }

        return 0; // speeds under 61
    }

/*
  int min = 61;
  int limit = 80;

  if(isBirthday){
    min += 5;
    limit += 5;
  }

*/
}
