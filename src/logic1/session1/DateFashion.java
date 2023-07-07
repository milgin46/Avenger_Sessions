package logic1.session1;

public class DateFashion { // https://codingbat.com/prob/p103360

    public int dateFashion(int you, int date) {

        if(you <= 2 || date <= 2){
            return 0;
        } else if(you >= 8 || date >= 8){
            return 2;
        }

        return 1;

    }


// public int dateFashion(int you, int date) {
//   int result = 1;
//   if(you <= 2 || date <= 2){
//     result = 0;
//   } else if(you >= 8 || date >= 8){
//   result = 2;
//   }

//   return result;

// }

}
