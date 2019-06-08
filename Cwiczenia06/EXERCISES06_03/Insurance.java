/*
Zad 3 Cwiczenia 6
Autorzy:    Aleksander Mojzych
            Artur Dembicki 16323
            25.05.2019

http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_06_2019.05.25.pdf
 */

//package Insurance;

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
