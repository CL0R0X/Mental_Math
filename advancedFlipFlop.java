import java.util.Random;
import java.util.Scanner;

public class advancedFlipFlop {
    /**
     
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        
        int num1 =  rand.nextInt(10);
        int num2 = rand.nextInt(10);

        int total = num1 * num2;
        System.out.println("Find the mising value");
        System.out.println(num1 + " muliply by x = " + total);
        int xValue = scan.nextInt();
        if(xValue == num2) {
            System.out.println("Correct answer");
        } else{
            System.out.println("Wrong answer");
        }
        scan.close();
    }

}
