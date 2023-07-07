package logic1.session2;

public class NearTen {
    public boolean nearTen(int num) { // https://codingbat.com/prob/p193613

        if(num % 10 == 0){
            return true;
        }

        boolean minus1 = (num - 1) % 10 == 0;
        boolean minus2 = (num - 2) % 10 == 0;
        boolean plus1 = (num + 1) % 10 == 0;
        boolean plus2 = (num + 2) % 10 == 0;

        return minus1 || minus2 || plus1 || plus2;
    }

/*

8/3 = 3 + 3 = 6 -> so 8/3 = 2
8%3 = 8 - 6 = 2

*/

}
