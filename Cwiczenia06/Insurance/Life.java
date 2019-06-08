/*
Zad 3 Cwiczenia 6
Autorzy:    Aleksander Mojzych
            Artur Dembicki 16323
            25.05.2019

http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_06_2019.05.25.pdf
 */

package Insurance;

public class Life extends Insurance {

    public Life(){
        super();
        setCost();
    }

    public void setCost(){
        monthlyPrice = 36;
    }

    public void display(){
        System.out.println("Monthly life insurance fee costs: " + getMonthlyPrice() +" dollars");
    }
}
