/*
Autorzy: Aleksander Mojzych, Artur Dembicki  25.05.2019
 */

package Insurance;

abstract class Insurance {

    protected String insuranceType;
    protected double monthlyPrice;

    public void Insurance(String insuranceType){

    }

    public String getInsuranceType(){
        return insuranceType;
    }

    public double getMonthlyPrice(){
        return monthlyPrice;
    }

    public abstract void setCost();
    public abstract void display();
}
