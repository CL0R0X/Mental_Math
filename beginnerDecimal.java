import java.util.Random;
import java.util.Scanner;



public class beginnerDecimal {
       private static double num1 = 0;

       private static double num2 = 0;

       private static double total = 0;

    /**
     * There is three different things I want to do with this
     *      * first thing I want to do both 1.2 * 3 = X and 1.2 * X = 3
     *      *
     *      * second thing I want to only accept hundreths position decimal positions in which
     *      * only does this is a process only interacting with the float variable(In other words float value is to be changed)
     *      *
     *      * third thing I want to mix and match the decimal and integer number division
     * @param args
     * 
     * * There is three different things I want to do with this
     *      first thing instead of doing 1.2 / 3 = X I want to do 1.2 / X = 3
     *
            * second thing I want to only accept hundreths position decimal positions in which
            * only does this is a process only interacting with the float variable(In other words float value is to be changed)
     *          
            * third thing I want to mix and match the decimal and integer number division
     * @param args
     */


     /**
      * Figure out why there are so many 0's in the quesiton
      or limit the value of zero from random numbers(best choice to solve)
      * @param args
      */
    public static void main(String[] args) {
       Random rand = new Random();
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Please enter a answer and round to nearest tenths place: ");
        timer.start();
       while(counter.question() != 11) {
           counter.displayNum();
           
           int process = rand.nextInt(4);

           if (process == 0 ) {
               oneSingleDeci(rand);
           } else if (process == 1) {
               twoDigitDeci(rand);
           } else  if(process ==2 ){
               oneDoubleDeci(rand);
           } else {
              twoDigitDeci(rand);
           }
           System.out.print("Enter a answer: ");
           double userAns = scan.nextDouble();

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

    public static void oneSingleDeci(Random rand){
       num1 = (rand.nextDouble(10.0));
       num1 =  (Math.round(num1*10.0)/10.0);

       num2 = rand.nextInt(10);
       
       
       int process = rand.nextInt(4);
       if(process == 0) {
           addDeci();
       } else if (process == 1) {
           subtractDeci(rand);
       } else if (process == 2){
           multiplyDeci();

       } else {
        while(num1 == 0) {
            num1 = rand.nextDouble(10);
        } 
        while( num2 == 0) {
            num2 = rand.nextDouble(10);
        }
           divideDeci();
       }
       
       

    }
    public static void twoSingleDeci(Random rand){
       num1 = (rand.nextDouble(10.0));
       num1 =  (Math.round(num1*10.0)/10.0);

       num2 = (rand.nextDouble(10.0));
       num2 =  (Math.round(num2*10.0)/10.0);

       int process = rand.nextInt(4);
       if(process == 0) {
           addDeci();
       } else if (process == 1) {
           subtractDeci(rand);
       } else if (process == 2){
           multiplyDeci();
       } else {
        while(num1 == 0) {
            num1 = rand.nextDouble(10);
        } 
        while( num2 == 0) {
            num2 = rand.nextDouble(10);
        }
           divideDeci();
       }
    }

    public static void oneDoubleDeci(Random rand){
       num1 = (rand.nextDouble(10.0));
       num1 =  (Math.round(num1*100.0)/100.0);

       num2 = (rand.nextDouble(10.0));
       num2 =  (Math.round(num1*100.0)/100.0);


       int process = rand.nextInt(4);
       
       if(process == 0) {
           addDeci();
       } else if (process == 1) {
           subtractDeci(rand);
       } else if (process == 2){
           multiplyDeci();
       } else {
        while(num1 == 0) {
            num1 = rand.nextDouble(10);
        } 
        while( num2 == 0) {
            num2 = rand.nextDouble(10);
        }
           divideDeci();
       }
    }

    public static void twoDigitDeci(Random rand){
       num1 = (rand.nextDouble(100.0));
       num1 =  (Math.round(num1*10.0)/10.0);
       
       num2 = (rand.nextDouble(100.0));
       num2 =  (Math.round(num1*10.0)/10.0);

       int process = rand.nextInt(4);
       if(process == 0) {
           addDeci();
       } else if (process == 1) {
           subtractDeci(rand);
       } else if (process == 2){
           multiplyDeci();
       } else {
        while(num1 == 0) {
            num1 = rand.nextDouble(10);
        } 
        while( num2 == 0) {
            num2 = rand.nextDouble(10);
        }
           divideDeci();
       }
    }

    public static void addDeci(){
       System.out.println("Add " +num1 + " to " + num2);
        total  = num1 + num2;
    }  

    public static void subtractDeci(Random rand) {
       int process = rand.nextInt(1);
        if (process == 0) {
            System.out.println("Subtract " + num2 +" from " + num1);
            total = num2 - num1;
        } else {
            System.out.println("Subtract " + num1 +" from " + num2);
            total = num1 - num2;
       }
            
    }

    public static void divideDeci(){
       
        if (num2 > num1) {
            System.out.println("Divide " + num2 +" by " + num1);
           total = num2 / num1;
        } else {
           System.out.println("Divide "  + num1 +" by " + num2);
           total = num1 / num2;
            
        } 
    }
    public static void multiplyDeci(){
       System.out.println("Multiply " + num2 +" times " + num1);
        total = num2 * num1;
    } 
}
    

