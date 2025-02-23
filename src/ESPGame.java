/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 * Description: Extrasensory perception
 * Due: 2/17/2025
 * Platform/compiler: IntelliJ IDEA / Eclipse
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Hanz Nathaniel Fernandez
 */

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
        final int TOTAL_ROUNDS = 3;
        final int OPTION_ONE = 1, OPTION_TWO = 2, OPTION_FOUR = 4;
       
        boolean continueGame = true;
        int correctGuesses = 0;
        String filePath = "";

        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        System.out.println("CMSC203 Assignment1: Test your ESP skills!" + "Welcome to ESP - extrasensory perception!");

        while (continueGame) {
            correctGuesses = 0; // Reset correct guesses count for each new game session
            System.out.println("Would you please choose one of the 4 options from the menu:\n");

            // Display game menu options
            System.out.println("\t1-\tread and display on the screen first 16 names of colors from a file colors.txt," +
                    " so the player can select one of them names of colors.");
            System.out.println("\t2-\tread and display on the screen first 10 names of colors from a file colors.txt," +
                    " so the player can select one of them names of colors.");
            System.out.println("\t3-\tread and display on the screen first 5 names of colors from a file colors.txt," +
                    " so the player can select one of them names of colors.");
            System.out.println("\t4-\tExit form a program");

            System.out.println("Enter the option:");
            int option = keyboard.nextInt(); // Get user input
            keyboard.nextLine(); // Consume newline

            if (option == OPTION_FOUR) { // Exit condition
                break;
            }

            System.out.println("Enter the file location for colors.txt (e.g., D:\\School\\CMSC203\\Assignment 1): ");
            filePath = keyboard.nextLine().trim(); // Get file path from user
            File file = new File(filePath + "\\colors.txt");

            // Determine the number of colors to read based on user selection
            int colorLimit = (option == OPTION_ONE) ? 16 : (option == OPTION_TWO) ? 10 : 5;

            if (file.exists() && file.getName().equals("colors.txt")) { // Check if file exists
                System.out.println("There are " + colorLimit + " colors from the file:");
            } else {
                System.out.println("File does not exist.");
            }

            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;

                // Read and display the specified number of colors
                for (int i = 0; (line = br.readLine()) != null && i < colorLimit; i++) {
                    System.out.println(line);
                }
                br.close();
            } catch (Exception e) {
                return;
            }

            // Game rounds start
            for (int round = 1; round <= TOTAL_ROUNDS; round++) {
                System.out.println("\nRound " + round + "\n");

                String randomColor;
                try {
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    String line;
                    int randomLineNumber = random.nextInt(colorLimit); // Generate a random index
                    randomColor = null;

                    // Read until reaching the randomly selected color
                    for (int i = 0; i <= randomLineNumber; i++) {
                        randomColor = br.readLine().trim().toLowerCase();
                    }
                    br.close();
                } catch (Exception e) {
                    return;
                }

                System.out.println("I am thinking of a color.");
                System.out.println("Is it one of list of colors above?");
                System.out.println("Enter your guess:");
                String userGuess = keyboard.nextLine().trim().toLowerCase();

                System.out.println("\nI was thinking of " + randomColor);

                // Check if user's guess is correct
                if (randomColor.equalsIgnoreCase(userGuess)) {
                    correctGuesses++;
                }
            }
            System.out.println("Game Over");
            System.out.println("\nYou guessed " + correctGuesses + " out of 3 colors correctly.");

            System.out.println("Would you like to continue the game? Type Yes/No");
            String response = keyboard.nextLine().trim().toLowerCase(); 
            continueGame = response.equals("yes"); // Determine whether to continue the game
        }

        // Collect user information before ending the game
        System.out.println("Enter your name: ");
        String name = keyboard.nextLine().trim();
        System.out.println("Describe yourself: ");
        String description = keyboard.nextLine().trim();
        System.out.println("Due Date: ");
        String due = keyboard.nextLine().trim();

        System.out.println("Username: " + name);
        System.out.println("User Description: " + description);
        System.out.println("Date: " + due);

        // Save game results to a file
        try {
            File file = new File(filePath + "\\EspGameResults.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            bw.write("Game Over\n");
            bw.write("You guessed " + correctGuesses + " out of 3 colors correctly.\n");
            bw.write("Username: " + name + "\n");
            bw.write("User Description: " + description + "\n");
            bw.write("Date: " + due + "\n");
            bw.close();
        } catch (Exception e) {
            return;
        }
    }
}