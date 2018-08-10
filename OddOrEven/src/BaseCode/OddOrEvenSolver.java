package BaseCode;

public class OddOrEvenSolver {
    boolean evenSolver(int number){
        int absOfNumber = Math.abs(number);
        int roundedDownSubtraction = absOfNumber/2;
        double numberDividedBy2 = (double)absOfNumber/2;
        double variableNumber = numberDividedBy2+.5;
        double binaryAnswer = variableNumber-roundedDownSubtraction;
        if(binaryAnswer==.5){
            return true;
        }else{
            return false;
        }
    }

}
