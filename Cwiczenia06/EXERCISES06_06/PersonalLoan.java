/*
Zad 6 Cwiczenia 6
Autorzy:    Aleksander Mojzych
            Artur Dembicki 16323
            07.06.2019

http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_06_2019.05.25.pdf
 */

//package Loan;

public class PersonalLoan extends Loan {
    PersonalLoan(String loanNumber, String lastName, double loanAmount, int term, double primeInterestRate){
        super(loanNumber, lastName, loanAmount, term);
        super.interestRate = 0.02 / (primeInterestRate / 100);
    }

}
