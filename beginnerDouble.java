import java.util.Random;
import java.util.Scanner;

public class beginnerDouble {
   private static int multiplier = 0;

   private static int multiplied = 0;

   private static int total = 0;

    /**
     * I need to do decimal and double digit multiplier but multiplied
     * is either double or single digit
     *
     * There needs to be a if/else statements that determines when a decimalshould be multiplied by decimal
     * or whether there is a decimal times a integer
     *
     * there needs to be a float that will only accept answers in the hundreths place
     *
     * @param
     */ 

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter a answer and round to nearest tenths place: ");
        timer.start();
        while(counter.question() != 11 ) {
            counter.displayNum();
            
            int process = rand.nextInt(3);
            if (process == 0 ) {
                twoSingleDigit(rand);
            } else if (process == 1) {
                oneSingleOneDuo(rand);
            } else  {
                twoDuoDigit(rand);
            }
            System.out.print("Enter a answer: ");
            int userAns = scan.nextInt();

            if (userAns == total ) {
                System.out.println("Correct Answer");
                counter.addScore();
            } else {
                System.out.println("Wrong answer the correct answer is " + total);
            }

            counter.addNum();
            System.out.println();
        }
        timer.stop();
        timer.displaySec();
        scan.close();
    }

    public static void twoSingleDigit(Random rand) {
        multiplier = rand.nextInt(10);
        multiplied = rand.nextInt(10);

        int process = rand.nextInt(4);
        if(process == 0) {
            addNum();
        } else if (process == 1) {
            subtractNum(rand);
        } else if (process == 2){
            multiplyNum();
        } else {
            while(multiplied == 0) {
                multiplied = rand.nextInt(10);
            } 
            while( multiplier == 0) {
                multiplier = rand.nextInt(10);
            }
            divideNum();
        }
        
    }

    public static void oneSingleOneDuo(Random rand) {
        multiplier = rand.nextInt(10);
        multiplied = rand.nextInt(100);

        int process = rand.nextInt(4);
        if(process == 0) {
            addNum();
        } else if (process == 1) {
            subtractNum(rand);
        } else if (process == 2){
            multiplyNum();
        } else {
            while(multiplied == 0) {
                multiplied = rand.nextInt(10);
            } 
            while( multiplier == 0) {
                multiplier = rand.nextInt(10);
            }
            divideNum();
        }
    }

    public static void twoDuoDigit(Random rand) {
        multiplier = rand.nextInt(100);
        multiplied = rand.nextInt(100);
        
        int process = rand.nextInt(4);
        
        if(process == 0) {
            addNum();
        } else if (process == 1) {
            subtractNum(rand);
        } else if (process == 2){
            multiplyNum();
        } else {
            while(multiplied == 0) {
                multiplied = rand.nextInt(10);
            } 
            while( multiplier == 0) {
                multiplier = rand.nextInt(10);
            }
            divideNum();
        }
    }

    public static void addNum(){
        System.out.println("Add " +multiplied + " to " + multiplier);
        total  = multiplied + multiplier;
    }


    public static void subtractNum(Random rand){
        int process = rand.nextInt(2);
        if (process == 0) {
            System.out.println("Subtract " + multiplier +" from " + multiplied);
            total = multiplier - multiplied;
        } else {
            System.out.println("Subtract " + multiplied +" from " + multiplier);
            total = multiplied - multiplier;
        }
    }
    
    public static void divideNum(){
        
        if (multiplied < multiplier) {
            System.out.println("Divide " + multiplier +" from " + multiplied);
           total = multiplier / multiplied;
        } else {
           System.out.println("Divide "  + multiplied +" from " + multiplier);
           total = multiplied / multiplier;           
        } 
    }

    public static void multiplyNum(){
        System.out.println("Multiply " + multiplied +" times " + multiplier);
        total = multiplied * multiplier;
    }

    // Complete
}
