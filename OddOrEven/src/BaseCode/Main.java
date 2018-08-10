package BaseCode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        OddOrEvenSolver solver = new OddOrEvenSolver();
        System.out.println("a test to see if im able to determine if a whole number is even or odd without the use of bits");
        System.out.println("enter any number or range of numbers (ex: 20->50)");
        System.out.println("the range option will apply the test to multiple numbers for testing");
        Scanner numberOrRange = new Scanner(System.in);
        String stringNumber = numberOrRange.nextLine();
        String[] splitInput = stringNumber.split("->");
        if(splitInput.length==1){
            if(solver.evenSolver(Integer.parseInt(splitInput[0]))){
                System.out.println("Even");
            }else {
                System.out.println("Odd");
            }
        }else if(splitInput.length==2){
            int startOfRange = Integer.parseInt(splitInput[0]);
            int endOfRange = Integer.parseInt(splitInput[1]);
            for(int i=startOfRange;i<=endOfRange;i++){
                if(solver.evenSolver(i)){
                    System.out.println(i+"is Even");
                }else{
                    System.out.println(i+"is Odd");
                }

            }
        }
    }
}
