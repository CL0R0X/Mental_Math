import java.util.Random;
import java.util.Scanner;

public class advancedDouble{
    private static int num1 = 0;

    private static int num2 = 0;
 
    private static int total = 0;
 
    private static boolean whichNum = false;
    /*
     * use references from advancedFlipFlop
     * 
     */


public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter a answer and round to nearest tenths place: ");

        timer.start();
        while (counter.question() != 11) {
            counter.displayNum();

            int process = rand.nextInt(3);
            if (process == 0 ) {
                twoSingleDigit(rand);
            } else if (process == 1) {
                oneSingleOneDuo(rand);
            } else  {
                twoDuoDigit(rand);
            }
            System.out.print("Solve for x: ");
            int userAns = scan.nextInt();

            if (whichNum == false ) {
                if(userAns == num1){
                System.out.println("Correct Answer");
                counter.addScore();
            } else {
                System.out.println("Wrong answer, the correct answer is " + num1);
            }
            } else{
                if(userAns == num2){
                    System.out.println("Correct Answer");
                    counter.addScore();
                } else {
                    System.out.println("Wrong answer, the correct answer is " + num2);
                } 
            }
            counter.addNum();
            System.out.println();
        }
        timer.stop();
        timer.displaySec();
        scan.close();
    }

    public static void twoSingleDigit(Random rand) {
        num1 = rand.nextInt(10);
        num2 = rand.nextInt(10);

        int process = rand.nextInt(4);
        if(process == 0) {
            addNum();
        } else if (process == 1) {
            subtractNum(rand);
        } else if (process == 2){
            multiplyNum();
        } else {
            while(num1 == 0) {
                num1 = rand.nextInt(10);
            } 
            while( num2 == 0) {
                num2 = rand.nextInt(10);
            }
            divideNum();
        }
        
    }

    public static void oneSingleOneDuo(Random rand) {
        num1 = rand.nextInt(10);
        num2 = rand.nextInt(100);

        int process = rand.nextInt(4);
        if(process == 0) {
            addNum();
        } else if (process == 1) {
            subtractNum(rand);
        } else if (process == 2){
            multiplyNum();
        } else {
            while(num1 == 0) {
                num1 = rand.nextInt(10);
            } 
            while( num2 == 0) {
                num2 = rand.nextInt(10);
            }
            divideNum();
        }
    }

    public static void twoDuoDigit(Random rand) {
        num1 = rand.nextInt(100);
        num2 = rand.nextInt(100);
        
        int process = rand.nextInt(4);
        if(process == 0) {
            addNum();
        } else if (process == 1) {
            subtractNum(rand);
        } else if (process == 2){
            multiplyNum();
        } else {
            while(num1 == 0) {
                num1 = rand.nextInt(10);
            } 
            while( num2 == 0) {
                num2 = rand.nextInt(10);
            }
            divideNum();
        }
    }

    public static void addNum(){
        total  = num1 + num2;
        System.out.println(num1 + " add by x = " + total);
        whichNum = true;
    }


    public static void subtractNum(Random rand){
        int process = rand.nextInt(2);
        if (process == 0) {
            total = num1 - num2;
            System.out.println(num1 +" subtract by x  = " + total);
            whichNum = true;
        } else {
            total = num2 - num1;
            System.out.println(num2 +" subtract by x  = " + total);
            
        }
        
    }
    
    public static void divideNum(){
        
        if (num2 > num1) {
           total = num2 / num1;
           System.out.println(num2 + " divide by x = " + total);
           whichNum = true;
        } else {
           total = num1 / num2;
           System.out.println(num1 + " divide by x = " + total);
            
        } 
    }

    public static void multiplyNum(){
        total = num1 * num2;
        System.out.println(num1 + " multiply by x = " + total);
        whichNum = true;
    }

}