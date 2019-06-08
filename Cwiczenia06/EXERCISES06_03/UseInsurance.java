/*
Zad 3 Cwiczenia 6
Autorzy:    Aleksander Mojzych
            Artur Dembicki 16323
            25.05.2019

http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_06_2019.05.25.pdf
 */

//package Insurance;

import java.util.Scanner;

public class UseInsurance {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Select insurance type: \n1: Health \n2: Life ");
        int selection = input.nextInt();

        if (selection == 1){
            Health healthInsurance = new Health();
            healthInsurance.display();
        }
        else if(selection == 2){
            Life lifeInsurance = new Life();
            lifeInsurance.display();
        }
    }

}
