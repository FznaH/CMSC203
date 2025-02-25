/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 * Description: Assignment 2 - Procedure class represents a medical procedure performed on a patient
 * Due: 2/24/2025
 * Platform/compiler: IntelliJ IDEA / Javac
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Hanz Nathaniel Fernandez
 */

public class Procedure {
    private String ProcedureName, ProcedureDate, PractitionerName;
    private double ProcedureCharge;

    // Default no-arg constructor initializes all patient details as empty strings
    public Procedure() {
        ProcedureName = "";
        ProcedureDate = "";
        PractitionerName = "";
        ProcedureCharge = 0;
    }
    // Constructor initializes patient's first, middle, and last name
    public Procedure(String nP, String d) {
        ProcedureName = nP;
        ProcedureDate = d;
    }
    // Constructor initializes all patient details
    public Procedure(String nP, String d, String nT, double c) {
        ProcedureName = nP;
        ProcedureDate = d;
        PractitionerName = nT;
        ProcedureCharge = c;
    }
    // Accessor methods (getters) to retrieve patient details
    // Mutator methods (setters) to modify patient details
    public String getProcedureName() {
        return ProcedureName;
    }
    public String getProcedureDate() {
        return ProcedureDate;
    }
    public String getPractitionerName() {
        return PractitionerName;
    }
    public double getProcedureCharge() {
        return ProcedureCharge;
    }
    public void setProcedureName(String n) {
        ProcedureName = n;
    }
    public void setProcedureDate(String n) {
        ProcedureDate = n;
    }
    public void setPractitionerName(String n) {
        PractitionerName = n;
    }
    public void setProcedureCharge(double n) {
        ProcedureCharge = n;
    }

    /**
     * Returns a string representation of the procedure details.
     *
     * @return A formatted string containing procedure details.
     */
    public String toString() {
        return ("\n\t\tProcedure: " + ProcedureName + "\n\t\tProcedure Date: " + ProcedureDate + "\n\t\tPractitioner: "
                + PractitionerName + "\n\t\tCharge: " + ProcedureCharge);
    }
}