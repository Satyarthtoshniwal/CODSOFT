import java.util.Random;
import java.util.Scanner;
public class game {
    public static void main(String[] args) {
        int rannum, guess, count = 0, score = 10;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        rannum = rand.nextInt(101);
        while (true) {
            System.out.println("Enter your guess between range(1-100)");
            guess = sc.nextInt();
            count++;
            if (guess == rannum) {
                System.out.println("Correct! you win!");
                System.out.println("It took you " + count + " tries");
                System.out.println("Score = " + score);
                break;
            } else if (rannum > guess) {
                System.out.println("Nope!The number is higher.Guess again.");
                score--;
            } else {
                System.out.println("Nope!The number is lower.Guess again.");
                score--;
            }
        }
        System.out.println("Random number was " + rannum);
        sc.close();
    }
}
