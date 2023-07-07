package logic1.session2;

public class TwoAsOne { // https://codingbat.com/prob/p113261
    public boolean twoAsOne(int a, int b, int c) {

        boolean one = a + b == c;
        boolean two = a + c == b;
        boolean three = b + c == a;

        return one || two || three;

    }

}
