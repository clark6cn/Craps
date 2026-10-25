import java.util.Random;
import java.util.Scanner;

public class Craps {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        String playAgain;
        do {
            int die1 = rand.nextInt(1, 7);
            int die2 = rand.nextInt(1, 7);
            int sum = die1 + die2;
            System.out.println("Welcome to Craps!");
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Sum: " + sum);
            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Craps! You lost!");
            } else if (sum == 7 || sum == 11) {
                System.out.println("Natural! You won!");
            } else {
                int point = sum;
                System.out.println("The point is now " + point + ".");
                boolean gameOver = false;
                do {
                    die1 = rand.nextInt(1, 7);
                    die2 = rand.nextInt(1, 7);
                    sum = die1 + die2;
                    System.out.println("Die 1: " + die1);
                    System.out.println("Die 2: " + die2);
                    System.out.println("Sum: " + sum);
                    if (sum == point) {
                        System.out.println("Made point! You won!");
                        gameOver = true;
                    } else if (sum == 7) {
                        System.out.println("Got a seven! You lost!");
                    } else {
                        System.out.println("Trying for point: " + point);
                    }
                } while (!gameOver);
            }
            System.out.println("Would you like to play again? (Y/N): ");
            playAgain = in.nextLine();
        }while(playAgain.equalsIgnoreCase("Y"));
    }
}
