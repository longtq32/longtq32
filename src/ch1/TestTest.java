import java.util.Scanner;

public class TestTest {
    public static void main(String[] args) {
        // boolean isHot = true;
        // while(isHot) {
        //     System.out.println("HOT");
        // }

        int[] newArray = {1, 2, 3, 4, 5};
        for (int i : newArray) {
            System.out.println("index array " + i);
        }


        int sum = 0;
        int operand1 = 0;
        int operand2 = 0;
        

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the first number to be added:");
        String stringOperand1 = myScanner.nextLine();
        System.out.println("Please enter the second number to be added:");
        String stringOperand2 = myScanner.nextLine();

        operand1 = Integer.parseInt(stringOperand1);
        operand2 = Integer.parseInt(stringOperand2);

        sum = operand1 + operand2;
        System.out.println("Sum is: " + sum);


        boolean isValid = false;
        do {
            try {
                System.out.println("please enter a whole number from 1 to 10: ");

                String input = myScanner.nextLine();
                int number = Integer.parseInt(input);
                if (number >=1 && number <= 10){
                    isValid = true;
                }
            } catch (NumberFormatException ex) {
                System.out.println("That was not a whole number!");
            }
            
            // if(input != null && !input.isEmpty()) {
            //     System.out.println("You did not enter anything!");
            // } else {
            //     isValid = true;
            // }
        } while(!isValid);


    }
}
