/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 * Description: Assignment 2 - Patient class represents a patient with personal details, address, and emergency contact
 * Due: 2/24/2025
 * Platform/compiler: IntelliJ IDEA / Javac
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Hanz Nathaniel Fernandez
 */

public class Patient {
    private String FirstName, MiddleName, LastName, StreetAddress, City, State, ZipCode, EmergencyContactName,
            EmergencyContactNumber;

    // Default no-arg constructor initializes all patient details as empty strings
    public Patient() {
        FirstName = "";
        MiddleName  = "";
        LastName = "";
        StreetAddress = "";
        City = "";
        State = "";
        EmergencyContactName = "";
        EmergencyContactNumber = "";
    }
    // Constructor initializes patient's first, middle, and last name
    public Patient(String f, String m, String l) {
        FirstName = f;
        MiddleName = m;
        LastName = l;
    }
    // Constructor initializes all patient details
    public Patient(String f, String m, String l, String st, String c, String s, String z, String emN, String emC) {
        FirstName = f;
        MiddleName = m;
        LastName = l;
        StreetAddress = st;
        City = c;
        State = s;
        ZipCode = z;
        EmergencyContactName = emN;
        EmergencyContactNumber = emC;
    }
    // Accessor methods (getters) to retrieve patient details
    // Mutator methods (setters) to modify patient details
    public String getFirstName() {
        return FirstName;
    }
    public String getMiddleName() {
        return MiddleName;
    }
    public String getLastName() {
        return LastName;
    }
    public String getStreetAddress() {
        return StreetAddress;
    }
    public String getCity() {
        return City;
    }
    public String getState() {
        return State;
    }
    public String getZipCode() {
        return ZipCode;
    }
    public String getEmergencyContactName() {
        return EmergencyContactName;
    }
    public String getEmergencyContactNumber() {
        return EmergencyContactNumber;
    }
    public void setFirstName(String n) {
        FirstName = n;
    }
    public void setMiddleName(String n) {
        MiddleName = n;
    }
    public void setLastName(String n) {
        LastName = n;
    }
    public void setStreetAddress(String n) {
        StreetAddress = n;
    }
    public void setCity(String n) {
        City = n;
    }
    public void setState(String n) {
        State = n;
    }
    public void setZipCode(String n) {
        ZipCode = n;
    }
    public void setEmergencyContactName(String n) {
        EmergencyContactName = n;
    }
    public void setEmergencyContactNumber(String n) {
        EmergencyContactNumber = n;
    }
    /**
     * Builds the full name of the patient.
     *
     * @return The concatenated first, middle, and last name.
     */
    public String buildFullName() {
        return FirstName + " " + MiddleName + " " + LastName;
    }
    /**
     * Builds the full address of the patient.
     *
     * @return The concatenated street address, city, state, and zip code.
     */
    public String buildAddress() {
        return StreetAddress + " " + City + " " + State + " " + ZipCode;
    }
    /**
     * Builds the emergency contact information.
     *
     * @return The concatenated emergency contact name and phone number.
     */
    public String buildEmergencyContact() {
        return EmergencyContactName + " " + EmergencyContactNumber;
    }
    /**
     * Returns a string representation of the patient's details.
     *
     * @return A formatted string containing patient details.
     */
    public String toString() {
        return ("Patient info:\n\tName: " + buildFullName() + "\n\tAddress: " + buildAddress() + "\n\t" +
                "Emergency Contact: " + buildEmergencyContact());
    }
}