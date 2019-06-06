/*
Autorzy: Aleksander Mojzych, Artur Dembicki  25.05.2019
 */

package Insurance;

public class Health extends Insurance {

    public Health(){
        super();
        setCost();
    }

    public void setCost(){
        monthlyPrice = 196;
    }

    public void display(){
        System.out.println("Monthly health insurance fee costs: " + getMonthlyPrice() +" dollars");
    }

}
