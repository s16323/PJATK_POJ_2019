/*
Autorzy: Aleksander Mojzych, Artur Dembicki  07.06.2019
 */

package Loan;

public class PersonalLoan extends Loan {
    PersonalLoan(String loanNumber, String lastName, double loanAmount, int term, double primeInterestRate){
        super(loanNumber, lastName, loanAmount, term);
        super.interestRate = 0.02 / (primeInterestRate / 100);
    }

}
