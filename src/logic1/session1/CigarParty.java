package logic1.session1;

public class CigarParty { // https://codingbat.com/prob/p159531
    public boolean cigarParty(int cigars, boolean isWeekend) {

        boolean validRange = cigars >= 40 && cigars <= 60;
        boolean secondValid = isWeekend && cigars >= 40;

        return validRange || secondValid;

    }

// shouldn't do this: isWeekend == false
// instead do it this way: !isWeekend
}

/*

    To test/run any of the methods you need to:
        - either create an instance of the class, or make the methods static
        - create a main method to call the method and give arguments

 */