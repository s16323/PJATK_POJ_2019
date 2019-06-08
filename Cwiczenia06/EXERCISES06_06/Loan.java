/*
Zad 6 Cwiczenia 6
Autorzy:    Aleksander Mojzych
            Artur Dembicki 16323
            07.06.2019

http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_06_2019.05.25.pdf
 */

//package Loan;

import java.util.InputMismatchException;

public abstract class Loan implements LoanConstants {

    private String loanNumber;
    private String lastName;
    private double loanAmount;
    protected double interestRate;
    private int term;

    public Loan(String loanNumber, String lastName, double loanAmount, int term) {
        this.loanNumber = loanNumber;
        this.lastName = lastName.toUpperCase();

        try {
            if (loanAmount > MAX_LOAN_AMOUNT){
                throw (new InputMismatchException("Loan amount was exceeded"));
            } else {
                this.loanAmount = loanAmount;
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }

        switch (term){
            case MEDIUM_TERM:
            case LONG_TERM:
                this.term = term;
                break;

            case SHORT_TERM:
            default:
                this.term = 1;
                break;
        }
    }

    @Override
    public String toString(){
        return String.format("%s\t\t%s\t\t$%,.2f\t%.2f%%\t\t%d\t\t$%,.2f",
                this.loanNumber, this.lastName, this.loanAmount, this.interestRate * 100,
                this.term, this.loanAmount + (this.loanAmount * this.interestRate));
    }
}
