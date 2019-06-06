/*
Autorzy: Aleksander Mojzych, Artur Dembicki  25.05.2019
 */

package Insurance;

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
