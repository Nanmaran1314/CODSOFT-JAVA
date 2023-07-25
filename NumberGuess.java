import java.util.Random;
import java.util.Scanner;

class NumberGuess {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        random();
    }

    static void random() {
        Random random = new Random();
        int randomVal = random.nextInt(100);
        System.out.println(randomVal);
        Gameplay(randomVal);
    }

    static void Gameplay(int randomVal) {
        int count = 1, score = 100;
        System.out.println("Guess the number between 1 to 100");
        for (int i = 10; i >= 0; i--) {
            int val = sc.nextInt();
            if (val == randomVal) {
                System.out.println("You won" + ", guessed in " + count + " counts" + ", The number is " + randomVal);
                System.out.println("Total score is "+ score);
                break;
            } else if (i == 1) {
                System.out.println("Limit has reached");
                score = score - 10;
                System.out.println("Total score is "+ score);
                playAgain();
                break;
            } else if (val > randomVal) {
                System.out.println("Too high, reduce the guess number");
                count++;
                score = score - 10;
            } else if (val < randomVal) {
                System.out.println("Too low, increase the guess number");
                count++;
                score = score - 10;
            }
            System.out.println("The total number of guess remaining " + (i - 1));

        }
    }

    static void playAgain() {
        System.out.println("Want to retry? (1 = yes || 2 = No) :");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                random();
            case 2:
                System.out.println("Thank you !!!");
                break;
            default:
                playAgain();
        }
    }

}