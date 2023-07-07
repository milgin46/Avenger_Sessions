package logic1.session2;

public class TeaParty { // https://codingbat.com/prob/p177181
    public int teaParty(int tea, int candy) {

        boolean good = tea >= 5 && candy >= 5;
        boolean great = tea >= candy * 2 || tea * 2 <= candy;

        return !good ? 0 : great ? 2 : 1;

        //return tea < 5 || candy < 5 ? 0 : tea >= candy * 2 || tea * 2 <= candy ? 2 : 1;

    }

/*

if(bad) {
  return 0;
} else if(great){
  return 2;
} else {
  return 1;
}

*/
}
