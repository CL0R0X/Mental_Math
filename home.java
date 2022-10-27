import java.util.Scanner;

public class home {

    public static void main(String[] args) {
        //Introduction statement
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Mental Math \n In this program we will test your \n Ability to do math quickly \n");
        //We will ask the user what things would you want to access
        System.out.println("Please select a type of simple math you would like to do: \n 1. Double-digit Arithmetic \n 2. Decimal Arithmetic \n 3. Fractional Arithmetic \n 4. Advamced Integer Arithmetic \n 5. Advanced Decimal Arithmetic ");
        System.out.print("Which math do you want to select: ");
        int userInput = scan.nextInt();
        
        int breakCheck = 0;
        while (breakCheck ==0) {
            if (userInput == 1) {
                beginnerDouble.main(args);
                breakCheck++;
            }else if(userInput == 2) {
                beginnerDecimal.main(args);
                breakCheck++;
            } else if (userInput ==3) {
                Fraction.main(args);
                breakCheck++;
            } else if (userInput ==4) {
                advancedDouble.main(args);;
                breakCheck++;
            } else if (userInput == 5) {
                advancedDecimal.main(args);
                breakCheck++;
            }
            //System.out.print("Which math do you want to select: ");
            //userInput = scan.nextInt();
        }
        scan.close();
    }

    }

