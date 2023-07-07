package logic1.session1;

public class SortaSum { // https://codingbat.com/prob/p183071
    public int sortaSum(int a, int b) {
        int sum = a + b;

        if(sum >= 10 && sum <= 19){
            return 20;
        }

        return sum;
    }

// public int sortaSum(int a, int b) {
//   int sum = a + b;

//   return sum >= 10 && sum <= 19 ? 20 : sum;
// }

}
