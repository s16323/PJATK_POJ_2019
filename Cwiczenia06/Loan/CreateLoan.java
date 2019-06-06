/*
Autorzy: Aleksander Mojzych, Artur Dembicki  07.06.2019
 */

package Loan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CreateLoan {
    private Loan[] loanDetails = new Loan[5];

    public static void main(String[] args){
        CreateLoan loan = new CreateLoan();

        loan.getLoanDetails();
        loan.displayDetails();
    }

    public void displayDetails(){
        System.out.println("Loan Number\t Last Name\t Loan Amount\t Interest Rate\t Loan Term\t Total Amount Owed");

        for (int x = 0; x < loanDetails.length; x++ ){
            System.out.println(loanDetails[x].toString());
        }
    }

    public static Character getLoanType(){
        Scanner sc = new Scanner(System.in);
        Character loanType;

        do {
            System.out.print("Is the loan for personal or business purposes? (P/B): ");
            loanType = sc.next().toUpperCase().charAt(0);

            if (!((loanType.equals('P')) || (loanType.equals('B'))))
                System.out.println(" >> Error: Invalid input.");
        } while (!((loanType.equals('P'))|| (loanType.equals('B'))));
        return loanType;
        }

    public static String getLoanNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Loan number");
        return sc.next();
    }

    public static String getLastName(){
        Scanner sc = new Scanner(System.in);
        String lastName;

        try {
            System.out.print("Customer last name");
            lastName = sc.next();

            for (int x = 0; x < lastName.length(); x++){
                if (Character.isDigit(lastName.charAt(x)) || !(Character.isLetterOrDigit(lastName.charAt(x)))) {
                    throw (new InputMismatchException("Invalid. Last name contains digits or symbols"));
                }
            }
        } catch (InputMismatchException e ){
            getExceptionMessage("last name", e);
            return getLastName();
        }
        return  lastName;
    }

    public static double getLoanAmount(){
        Scanner sc = new Scanner(System.in);
        double loanAmount;

        try {
            System.out.print("Loan amount");
            loanAmount = sc.nextDouble();

            if (loanAmount <= 0) {
                throw (new InputMismatchException("Loan amount must not be zero or lesser."));
            } else if (loanAmount > 100000) {
                throw (new InputMismatchException("Loan amount must not be over 10000"));
            }
            return loanAmount;
        } catch (InputMismatchException e){
            getExceptionMessage("loan amount", e);
            return getLoanAmount();
        }
    }

    public static double getPrimeInterestRate(){
        Scanner sc = new Scanner(System.in);
        double primeIntRate;

        try {
            System.out.print(" Prime interest rate (%): ");
            primeIntRate = sc.nextDouble();

            if (primeIntRate <= 0){
                throw (new InputMismatchException("Interest rate must " +
                        "not be zero or lesser."));
            }

            return primeIntRate;
        } catch (InputMismatchException e) {
            getExceptionMessage("interest rate", e);
            return getPrimeInterestRate();
        }
    }

    public static int getTerm(){
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Loan term(1, 3 or 5): ");
            return sc.nextInt();
        } catch (InputMismatchException e){
            getExceptionMessage("loan term", e);
            return getTerm();
        }
    }

    public void getLoanDetails(){
        Character loanType;
        String loanNumber;
        String lastName;
        double loanAmount;
        double primeInterestRate;
        int term;

        for (int x = 0; x < loanDetails.length; x++){
            System.out.println("Enter loan details for customer " + (x + 1) + "...");

            loanType = getLoanType();
            loanNumber = getLoanNumber();
            lastName = getLastName();
            loanAmount = getLoanAmount();
            primeInterestRate = getPrimeInterestRate();
            term = getTerm();
            System.out.println();

            if(loanType.equals('P')) {
                loanDetails[x] = new PersonalLoan(loanNumber, lastName, loanAmount, term, primeInterestRate);
            } else if (loanType.equals('B')) {
                loanDetails[x] = new BusinessLoan(loanNumber, lastName, loanAmount, term, primeInterestRate);
            }
        }
    }

    public static void getExceptionMessage(String data, InputMismatchException e){
        if (e.getMessage() == null) {
            System.out.println(" >> Error: Invalid input. Enter " + data + " detail agian");
        } else {
            System.out.println(">> Error: " + e.getMessage());
        }
    }
}
