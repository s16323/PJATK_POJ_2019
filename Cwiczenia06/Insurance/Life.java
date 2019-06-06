/*
Autorzy: Aleksander Mojzych, Artur Dembicki  25.05.2019
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
