/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 * Description: Assignment 2 - PatientDriverApp class collects patient and procedure details from user input, creates
 * corresponding Patient and Procedure objects, displays their information, and calculates the total procedure charges.
 * Due: 2/24/2025
 * Platform/compiler: IntelliJ IDEA / Javac
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Hanz Nathaniel Fernandez
 */

import java.util.Scanner;

public class PatientDriverApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Collect patient information from user input
        System.out.println("Enter patient's first name: ");
        String FirstName = keyboard.nextLine().trim();

        System.out.println("Enter patient's last name: ");
        String LastName = keyboard.nextLine().trim();

        System.out.println("Enter patient's middle name: ");
        String MiddleName = keyboard.nextLine().trim();

        System.out.println("Enter patient's street address: ");
        String StreetAddress = keyboard.nextLine().trim();

        System.out.println("Enter patient's city: ");
        String City = keyboard.nextLine().trim();

        System.out.println("Enter patient's state: ");
        String State = keyboard.nextLine().trim();

        System.out.println("Enter patient's zip code: ");
        String ZipCode = keyboard.nextLine().trim();

        System.out.println("Enter patient's emergency contact name: ");
        String EmergencyContactName = keyboard.nextLine().trim();

        System.out.println("Enter patient's emergency contact number: ");
        String EmergencyContactNumber = keyboard.nextLine().trim();

        Patient patientInfo = new Patient(FirstName, MiddleName, LastName, StreetAddress, City, State, ZipCode,
                EmergencyContactName, EmergencyContactNumber);

        // Collect three procedure information from user input
        System.out.println("Enter the first procedure name: ");
        String ProcedureName1 = keyboard.nextLine().trim();

        System.out.println("Enter the first procedure date: ");
        String ProcedureDate1 = keyboard.nextLine().trim();

        System.out.println("Enter the first practitioner's name: ");
        String PractitionerName1 = keyboard.nextLine().trim();

        System.out.println("Enter the first procedure charge: ");
        double ProcedureCharge1 = keyboard.nextDouble();

        keyboard.nextLine(); // Consume leftover newline

        Procedure procedureInfo1 = new Procedure(ProcedureName1, ProcedureDate1, PractitionerName1, ProcedureCharge1);

        System.out.println("Enter the second procedure name: ");
        String ProcedureName2 = keyboard.nextLine().trim();

        System.out.println("Enter the second procedure date: ");
        String ProcedureDate2 = keyboard.nextLine().trim();

        System.out.println("Enter the second practitioner's name: ");
        String PractitionerName2 = keyboard.nextLine().trim();

        System.out.println("Enter the second procedure charge: ");
        double ProcedureCharge2 = keyboard.nextDouble();

        keyboard.nextLine(); // Consume leftover newline

        Procedure procedureInfo2 = new Procedure(ProcedureName2, ProcedureDate2, PractitionerName2, ProcedureCharge2);

        System.out.println("Enter the third procedure name: ");
        String ProcedureName3 = keyboard.nextLine().trim();

        System.out.println("Enter the third procedure date: ");
        String ProcedureDate3 = keyboard.nextLine().trim();

        System.out.println("Enter the third practitioner's name: ");
        String PractitionerName3 = keyboard.nextLine().trim();

        System.out.println("Enter the third procedure charge: ");
        double ProcedureCharge3 = keyboard.nextDouble();

        keyboard.nextLine(); // Consume leftover newline

        Procedure procedureInfo3 = new Procedure(ProcedureName3, ProcedureDate3, PractitionerName3, ProcedureCharge3);

        // Display patient and procedure details
        displayPatient(patientInfo);
        displayProcedure(procedureInfo1);
        displayProcedure(procedureInfo2);
        displayProcedure(procedureInfo3);

        // Display total charge information
        System.out.printf("\nTotal Charges: $%.2f!%n", calculateTotalCharges(ProcedureCharge1, ProcedureCharge2,
                ProcedureCharge3));

        // Display student information
        System.out.println("\nStudent Name: Hanz Nathaniel Fernandez");
        System.out.println("M#: M21196964");
        System.out.println("Due Date: 02/24/2025");
    }
    /**
     * Displays patient information.
     * This method prints the details of a Patient object using its toString() method.
     * It ensures that all patient details, including name, address, and emergency contact,
     * are properly displayed.
     *
     * @param n The Patient object containing patient details
     */
    public static void displayPatient(Patient n) {
        System.out.println(n.toString());
    }
    /**
     * Displays procedure information.
     * This method prints the details of a Procedure object using its toString() method.
     * It ensures that all relevant procedure details such as name, date, practitioner,
     * and charge are properly displayed.
     *
     * @param n The Procedure object containing procedure details
     */
    public static void displayProcedure(Procedure n) {
        System.out.println(n);
    }
    /**
     * Calculates the total charges of three procedures
     * This method takes three double values representing procedure charges and returns
     * the sum of these values.
     *
     * @param x The charge of the first procedure
     * @param z The charge of the second procedure
     * @param y The charge of the third procedure
     * @return The total sum of all procedure charges
     */
    public static double calculateTotalCharges(double x, double z, double y) {
        return x + z + y;
    }
}