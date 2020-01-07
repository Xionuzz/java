/**
 * Rock Paper Scissors game with scoreboard option.
 * @author Rafael Carrió Pérez DAM-1
 * @version 1
 */

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static final String CLEAR = "\u001b[2J"; // Clears terminal screen
    public static final String RESET = "\u001b[H"; // Places cursor to the beginning of the terminal screen
    public static final int TIME = 800; // Delay for prints
    public static int userScore = 0;
    public static int computerScore = 0;
    public static int draws = 0;

    static Scanner scan = new Scanner(System.in); // Global Scanner

    public static void main(String [] args) throws InterruptedException{

        menu();
    }


    /**
     * Main menu. Validates user input and calls methods based upon it
     */

    public static void menu() throws InterruptedException{

        boolean validate = false; // Validates user input
        int userInput = 0;

        do {
            System.out.println("ROCK PAPER SCISSORS");
            System.out.println("-------------------");
            System.out.println("1. NEW GAME");
            System.out.println("2. SCORES");
            System.out.println("0. EXIT");
            System.out.println("-------------------");
            System.out.println("ENTER A OPTION: ");
            userInput = scan.nextInt();
            scan.nextLine();
            if(userInput > 2 || userInput < 0){
                System.out.println("Invalid option, try again");
            }else{
                validate = true;
            }
        }while(!validate);

        if (userInput == 1){
            playerTurn();
        }else if(userInput == 2){
            displayScores();
            Thread.sleep(TIME);
        }else{
            System.out.println("Thanks for playing!"); // Program ends
        }
    }


    /**
     * Handles player turn.
     */

    public static void playerTurn() throws InterruptedException{

        boolean validate = false; // Validates user input
        int userInput = 0;
        int computerOption = 0;

        Thread.sleep(TIME);
        System.out.print(CLEAR + RESET);
        System.out.flush();
        System.out.println("************");
        System.out.println("* NEW GAME *");
        System.out.println("************");

        /*Validates user input*/
        do {
            System.out.println("MOVEMENTS:");
            System.out.println("--------------");
            System.out.println("1. ROCK");
            System.out.println("2. PAPER");
            System.out.println("3. SCISSORS");
            System.out.println("-----------------");
            System.out.println("CHOOSE:");
            userInput = scan.nextInt();
            scan.nextLine();
            if (userInput > 3 || userInput < 1){
                System.out.println("Invalid option, try again");
            }else{
                validate = true;
            }
        }while (!validate);

        /*Outputs to screen the option the user has selected.*/
        switch(userInput){
            case 1:
                System.out.println("You have choose Rock");
                break;
            case 2:
                System.out.println("You have choose Paper");
                break;
            case 3:
                System.out.println("You have choose Scissors");
                break;
        }

        Thread.sleep(TIME);
        computerOption = computerTurn();
        checkResults(userInput,computerOption);

    }


    /**
     *
     * Simulates computer turn by generating a random number.
     * @return The computer option to compare with the user.
     */

    public static int computerTurn(){

        int computer; // Stores the computer option.

        Random rnd = new Random();

        computer = rnd.nextInt(3 - 1 + 1) + 1; // Random number between 1 and 3 for the computer option

        /*Outputs to screen the computer option*/
        switch (computer){
            case 1:
                System.out.println("The computer draws Rock");
                break;
            case 2:
                System.out.println("The computer draws Paper");
                break;
            case 3:
                System.out.println("The computer draws Scissors");
                break;
        }

        return computer;
    }


    /**
     * Compares user and computer hand and prints the result. Stores the score to a global variable.
     * @param user Stores the user option
     * @param computer Stores computer option
     */

    public static void checkResults(int user, int computer) throws InterruptedException{

        String userInput = "test"; // String with text to validate to a empty string.

        /*Compares computer and user and decides who wins*/
        if(user == computer){
            System.out.println("DRAW!");
            draws++;
        }else if (user == 1 && computer == 2){
            System.out.println("YOU LOSE!");
            computerScore++;
        }else if (user == 1 && computer == 3){
            System.out.println("YOU WON!");
            userScore++;
        }else if (user == 2 && computer == 1){
            System.out.println("YOU WON!");
            userScore++;
        }else if (user == 2 && computer == 3){
            System.out.println("YOU LOSE!");
            computerScore++;
        }else if (user == 3 && computer == 1){
            System.out.println("YOU LOSE!");
            computerScore++;
        }else if (user == 3 && computer == 2){
            System.out.println("YOU WON!");
            userScore++;
        }

        do{
            System.out.println("Press RTR to continue");
            userInput = scan.nextLine();
        }while(!userInput.equals(""));

        /* Clears the terminal screen and returns to the beginning before calling the menu again*/
        System.out.print(CLEAR + RESET);
        System.out.flush();

        menu();
    }


    /**
     * Displays the score of the player and the computer, stored in the global variables. Cleans the screen and calls
     * the main menu.
     */

    public static void displayScores() throws InterruptedException{

        String userInput = "test"; // String with text to validate to a empty string.

        /*Prints the scoreboard*/
        Thread.sleep(TIME);
        System.out.println("***** SCOREBOARD *****");
        System.out.println("  COMPUTER SCORE: " + computerScore);
        System.out.println("  USER SCORE: " + userScore);
        System.out.println("  DRAWS: " + draws);
        System.out.println("***********************");

        do{
            System.out.println("Press RTR to continue");
            userInput = scan.nextLine();
        }while(!userInput.equals(""));

        /* Clears the terminal screen and returns to the beginning before calling the menu again*/
        System.out.print(CLEAR + RESET);
        System.out.flush();

        menu(); // Calls the menu again and restarting the program.
    }
}
