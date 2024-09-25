package rockpaperscissors;

//import statements
import java.util.Scanner;
import static java.lang.Math.*;

public class RockPaperScissors {

    public static void main(String[] args) {
        //Scanning for keyboard input
        Scanner input = new Scanner(System.in);
        
        //declaring variables
        final int ROCK = 1;
        final int PAPER = 2;
        final int SCISSORS = 0;
        int userChoice = 0;
        int cpuChoice = 0;
        
        //user input
        System.out.print("Please make a choice (0-scissors, 1-rock, 2-paper): ");
        userChoice = input.nextInt();
        
        if(userChoice < 0 || userChoice > 2) {
            System.out.print("Invalid input. Please re-enter a number: ");
            userChoice = input.nextInt();
        }
        
        System.out.println("");
        
        //equating userChoice to R, P, or S
        if (userChoice == ROCK) {
            System.out.println("User Chooses:\nrock");
        }
        else if (userChoice == PAPER) {
            System.out.println("User Chooses:\npaper");
        }
        else {
            System.out.println("User Chosses:\nscissors");
        }
        
        //random number 1-9
        cpuChoice = ((int)(random() * 9)) % 3;
        
        //deciding cpuChoice
        if (cpuChoice == ROCK) {
            System.out.println("Computer Chooses:\nrock\n");
        }
        else if (cpuChoice == PAPER) {
            System.out.println("Computer Chooses:\npaper\n");
        }
        else if (cpuChoice == SCISSORS) {
            System.out.println("Computer Chooses:\nscissors\n");
        }
        else {
            cpuChoice = userChoice; //in case picks 0; draw is decided
        }
        
        System.out.println("");
        
        //deciding victory
        if(userChoice == cpuChoice) {
            System.out.println("It's a DRAW");
        }
        else if(userChoice == ROCK && cpuChoice == PAPER) {
            System.out.println("CPU WINS!");
        }
        else if(userChoice == SCISSORS && cpuChoice == ROCK) {
            System.out.println("CPU WINS!");
        }
        else if(userChoice == PAPER && cpuChoice == SCISSORS) {
            System.out.println("CPU WINS!");
        }
        else {
            System.out.println("USER WINS!");
        }
            
    }
    
}
