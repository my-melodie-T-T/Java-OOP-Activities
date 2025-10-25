// ACTIVITY 6

import java.util.Scanner;
import java.util.Random; // generates pseudo-random numbers of diff types
import java.util.InputMismatchException; // throws an exception when input type doesn't much what's expected
public class random_number {
    public static void main (String[] args){

    Scanner scan = new Scanner((System.in));
    String RESET = "\u001B[0m";
    String RED = "\u001B[31;1m";
    String GREEN = "\u001B[32;1m";
    String CYAN = "\u001B[36;1m";
    String PURPLE = "\u001B[35;1m";
    String BLUE = "\u001B[34;1m";
    Random random = new Random();
    int max = 100;
    int min = 1;
    int secretNumber;
    int guess;
    int attempts;
    String choice;


    System.out.println(BLUE + "============ NUMBER GUESSING GAME ============\n" + RESET);

    System.out.println("I've picked a secret number between" + BLUE + " 1 " + RESET + "and" + BLUE + " 100." + RESET);
    System.out.println("Try to guess it!\n");

do{

    guess = 0;
    attempts = 0;
    secretNumber = random.nextInt(max - min + 1) + 1; // random number between 1 and 100

    while(guess != secretNumber){
        try{
            System.out.print("Enter your guess: "); //might throw an exception
            guess = scan.nextInt();
            attempts++;

            if (guess < secretNumber){
                System.out.println(CYAN + "\nToo low! Try again.\n" + RESET);
            } else if (guess > secretNumber){
                System.out.println(PURPLE + "\nToo high! Try again.\n" + RESET);
            } else {
                System.out.println( GREEN + "\nCorrect! You guessed the number " + secretNumber + " in " + attempts + " attempts!\n" + RESET);
            }

        } catch (InputMismatchException e){ //code to handle exception
            System.out.println(RED + "\nInvalid input! Please enter a valid integer.\n" + RESET);
            scan.next(); //clear the invalid input from scanner
        }
    }

    System.out.print("Do you want to play again? [Y|N]: ");   
        scan.nextLine(); // consume leftover line    
        choice = scan.nextLine();
      
        System.out.println("\n");

}while(choice.equalsIgnoreCase("Y"));
   
scan.close();

    }
}
