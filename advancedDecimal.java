import java.util.Random;
import java.util.Scanner;

public class advancedDecimal {
    private static double num1 = 0;

    private static double num2 = 0;

    private static double total = 0;

    private static boolean whichNum = false;
 
 public static void main(String[] args) {
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please enter a answer and round to nearest tenths place: ");
    timer.start();
    while (counter.question() != 11 ) {
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
     total  = num1 + num2;
     System.out.println(num1 + " add by x = " + total);
     whichNum = true;
 }  

 public static void subtractDeci(Random rand) {
    int process = rand.nextInt(1);
     if (process == 0) {
        total = num2 - num1;
        System.out.println(num2 +" subtract by x  = " + total);
        whichNum = false;
     } else {
         
         total = num1 - num2;
         System.out.println(num1 +" subtract by x  = " + total);
         whichNum = true;
    }
         
 }

 public static void divideDeci(){
    
     if (num2 > num1) {        
        total = num2 / num1;
        System.out.println(num2 + " divide by x = " + total);
        whichNum =false;

     } else {        
        total = num1 / num2;
        System.out.println(num1 + " divide by x = " + total); 
        whichNum = true;
     } 
 }
 public static void multiplyDeci(){    
     total = num2 * num1;
     System.out.println(num2 + " multiply by x = " + total);
     whichNum = true;
 }
}
