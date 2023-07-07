package logic1.session2;

public class AnswerCell { // https://codingbat.com/prob/p110973
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {

        if(isAsleep || (isMorning && !isMom)){
            return false;
        }

        return true;
    }

}
