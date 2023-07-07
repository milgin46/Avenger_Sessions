package logic1.session1;

public class AlarmClock { // https://codingbat.com/prob/p160543
    public String alarmClock(int day, boolean vacation) {

        boolean isWeekend = day == 0 || day == 6;

        if(vacation && isWeekend){
            return "off";
        } else if(vacation && !isWeekend || !vacation && isWeekend){
            return "10:00";
        } else {
            return "7:00";
        }

    }

}
