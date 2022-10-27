public class counter {
    private static int questionNum = 1;

    private static int score = 0;
    
    public static void addNum() {
        questionNum++;
    } 

    public static void removeNum() {
        questionNum--;
    }

    public static void displayNum() {
        System.out.println("Current Qustion: " + questionNum);
    }

    public static int question(){
        return questionNum;
    }

    public static void addScore() {
        score++;
    }

    public static void removeScore() {
        score--;
    }
    
    public static void displayScore(){
        System.out.println("The total amount you got correct is " + score + " questions");
    }

    public static int score(){
        return score;
    }
}
