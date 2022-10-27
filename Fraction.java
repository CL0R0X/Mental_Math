
import java.util.Random;
import java.util.Scanner;

public class Fraction {
    private int num;
    private int denom;

    private static int totalNum;
    private static int totalDenom;

    Fraction(int n,int d){
        num = n;
        denom = d;
    }

    Fraction sum(Fraction f1,Fraction f2){
        int dtemp = f1.denom*f2.denom;
        int ntemp = f1.num*f2.denom+f1.denom*f2.num;
        return new Fraction(ntemp,dtemp);
    }

    Fraction minus(Fraction f1,Fraction f2){
        int dtemp = f1.denom*f2.denom;
        int ntemp = f1.num*f2.denom-f1.denom*f2.num;
        return new Fraction(ntemp,dtemp);
    }

    Fraction product(Fraction f1,Fraction f2){
        return new Fraction(f1.num*f2.num,f1.denom*f2.denom);
    }

    Fraction divide(Fraction f1,Fraction f2){
        return new Fraction(f1.num*f2.denom,f1.denom*f2.num);
    }

    void printfrac(Fraction fr){
        System.out.println("Numerator: "+fr.num+"\t Denominator: "+fr.denom);
    }
    static boolean total(Fraction fr, Scanner scan){
        boolean ans = true;
        totalDenom = fr.denom;
        totalNum = fr.num;

        System.out.print("Enter the numerator: ");
        int numUser1 = scan.nextInt();
        System.out.println();
        System.out.print("Enter the denomintator: ");
        int numUser2 = scan.nextInt();

        Fraction ansFrac = new Fraction(totalNum, totalDenom);
        Fraction userFrac = new Fraction(numUser1, numUser2);

        if(ansFrac ==  userFrac) {
            System.out.println("Correct answer ");
        } else {
            System.out.println("Wrong ");
            ans = false;
        }
        return ans;
    }

    
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        
        
        while(scan.nextLine() != " "){
            int count=rand.nextInt(4);
            int num1 = rand.nextInt(10);
            int num2 = rand.nextInt(10);
            
            int num3 = rand.nextInt(10);
            int num4 = rand.nextInt(10);

            

            Fraction f1 = new Fraction(num1, num2);
            Fraction f2 = new Fraction(num3, num4);

        if(count == 0 ){
            System.out.println("Add:" + f1.num+ " / "+f1.denom+" and " + f2.num+ " / "+f2.denom +"\n");
            boolean response = total(f1.sum(f1,f2), scan);

            if( response == false){
                f1.printfrac (f1.sum(f1,f2)); 
            }

        } else if(count ==1) {
            System.out.println("Subtract:" + f1.num+ " / "+f1.denom+" and " + f2.num+ " / "+f2.denom +"\n");
            
            boolean response = total(f1.minus(f1,f2), scan);

            if (response == false) {
                f1.printfrac(f1.minus(f1,f2));
            }

        } else if (count == 2) {
            System.out.println("Divide:" + f1.num+ " / "+f1.denom+" and " + f2.num+ " / "+f2.denom +"\n");
            boolean response = total(f1.divide(f1,f2), scan);

            if (response == false){
                f1.printfrac(f1.divide(f1,f2));    
            }
        } else {
            System.out.println("Multiply:" + f1.num+ " / "+f1.denom+" and " + f2.num+ " / "+f2.denom +"\n");
            
            boolean response = total(f1.product(f1,f2), scan);
            if(response == false){
                f1.printfrac(f1.product(f1, f2));    
            }

        }
    }


    }
}
