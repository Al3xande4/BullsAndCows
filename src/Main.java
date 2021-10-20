import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String grade = "Grade: ";
        String stSecNum = "5385";
        int bulls = 0;
        int cows = 0;

        String[] secretNumber = stSecNum.split("");
        System.out.println("Enter the guess number");
        String[] guessNumber = in.nextLine().split("");

        for (int i = 0; i < secretNumber.length; i++) {
            for (int j = 0; j < guessNumber.length; j++) {
                if(secretNumber[i].equals(guessNumber[j])){
                    bulls = i == j ? bulls + 1 : bulls;
                    cows = i != j ? cows + 1 : cows;
                }
            }
        }
        if(bulls > 0 && cows > 0){
            grade += bulls + " bull(s) and " + cows + "cow(s).";
        }
        else if(bulls > 0){
            grade += bulls + " bull(s).";
        }
        else if(cows > 0){
            grade += cows + " cow(s).";
        }
        else{
            grade += "None.";
        }
        System.out.println(grade);
        System.out.println("The secret code is " + stSecNum);
    }
}
