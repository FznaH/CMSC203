/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 * Description: Lab1 – Driver and Data Element Driver to test a class
 * Due: 2/24/2025
 * Platform/compiler: IntelliJ IDEA / Javac
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Hanz Nathaniel Fernandez
 */

import java.util.Scanner;

public class MovieDriver_Task1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Movie movie = new Movie(); // Create a movie object
        System.out.println("Enter the title of a movie: "); // Input movie title
        String title = keyboard.nextLine().trim();
        movie.setTitle(title); // Set movie title (Setter method)

        System.out.println("Enter the movie's rating: ");  // Input movie rating
        String rating = keyboard.nextLine().trim();
        movie.setRating(rating); // Set movie rating (Setter method)

        System.out.println("Enter the number of tickets sold: "); // Input number of tickets sold
        int soldTickets = keyboard.nextInt();
        movie.setSoldTickets(soldTickets); // Set tickets sold (Setter method)

        System.out.println(movie.toString()); // Display movie details using toString method
    }
}