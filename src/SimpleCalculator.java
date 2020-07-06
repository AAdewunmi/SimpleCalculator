/*Simple Java Calculator */

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        float firstNumber,secondNumber,result;
        char choice;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit\n");
            System.out.println("Enter Your Choice : ");
            choice = scanner.next().charAt(0);
            switch (choice){
                case '1' :
                    System.out.println("Enter Two Numbers : ");
                    firstNumber = scanner.nextFloat();
                    secondNumber = scanner.nextFloat();
                    result = firstNumber + secondNumber;
                    System.out.println("Result = " + result);
                    break;
                case '2' :
                    System.out.println("Enter Two Numbers : ");
                    firstNumber = scanner.nextFloat();
                    secondNumber = scanner.nextFloat();
                    result = firstNumber - secondNumber;
                    System.out.println("Result = " + result);
                    break;
                case '3' :
                    System.out.println("Enter Two Numbers : ");
                    firstNumber = scanner.nextFloat();
                    secondNumber = scanner.nextFloat();
                    result = firstNumber * secondNumber;
                    System.out.println("Result = " + result);
                    break;
                case '4' :
                    System.out.println("Enter Two Numbers : ");
                    firstNumber = scanner.nextFloat();
                    secondNumber = scanner.nextFloat();
                    result = firstNumber / secondNumber;
                    System.out.println("Result = " + result);
                    break;
                case '5' : System.exit(0);
                    break;
                default :
                    System.out.println("Wrong Choice!!!");
            }
            System.out.println("\n***********************\n");
        }while(true);
    }
}
