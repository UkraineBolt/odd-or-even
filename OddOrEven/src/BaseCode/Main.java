package BaseCode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        OddOrEvenSolver solver = new OddOrEvenSolver();
        Scanner numberOrRange = new Scanner(System.in);
        System.out.println("a test to see if im able to determine if a whole number is even or odd without the use of bits");
        System.out.println("enter any number or range of numbers (ex: 20->50)");
        System.out.println("the range option will apply the test to multiple numbers for testing");
        while(true){
            System.out.println("\nenter any number or range of numbers (ex: 20->50)");
            String stringNumber = numberOrRange.nextLine();
            String[] splitInput = stringNumber.split("->");
            if(splitInput[0].trim().toLowerCase().equals("quit")){
                break;
            }
            if(splitInput.length==1){
                if(solver.evenSolver(Integer.parseInt(splitInput[0]))){
                    System.out.println("Even");
                }else {
                    System.out.println("Odd");
                }
            }else if(splitInput.length==2){
                int startOfRange = Integer.parseInt(splitInput[0].trim());
                int endOfRange = Integer.parseInt(splitInput[1].trim());
                for(int i=startOfRange;i<=endOfRange;i++){
                    if(solver.evenSolver(i)){
                        System.out.println(i+" is Even");
                    }else{
                        System.out.println(i+" is Odd");
                    }

                }
            }
        }
    }
}
