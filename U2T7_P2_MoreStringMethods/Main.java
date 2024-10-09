package U2T7_P2_MoreStringMethods;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        int wordCt = 0;

        System.out.print("Enter first word: ");
        String str1 = scan.next();
        wordCt ++;
        while (score < 50) {
            System.out.print("Enter next word: ");
            String str2 = scan.next();
            if (str2.compareTo(str1) > 0) {
                score += 2;
                System.out.println("+2 points: current word alphabetically after the previous word; SCORE: " + score);
            }
            else if(str2.equals(str1)) {
                score -=10;
                System.out.println("-10 points: current word the same as the previous word; SCORE: " + score);
            }
            else {
                score -=5;
                System.out.println("-5 points: current word alphabetically before the previous word; SCORE: " + score);
            }
            if (str1.substring(str1.length()-2).equals(str2.substring(0,2))) {
                score += 5;
                System.out.println("+5 points: last 2 letters of previous match first 2 letters of current; SCORE: " + score);
            }
            if(! (str2.indexOf(str1.substring(0,1)) == -1)) {
                score += 3;
                System.out.println("+3 points: first letter of previous word found in current word; SCORE: " + score);
            }
            if (str1.length() == str2.length()) {
                score += 3;
                System.out.println("+3 points: length of current and previous words are the same length; SCORE: " + score);
            }
            str1 = str2;
            wordCt ++;
        }
        System.out.println("You win! It took you " + wordCt + " words! Try again for a lower word count :)");
        scan.close();
    }
}
