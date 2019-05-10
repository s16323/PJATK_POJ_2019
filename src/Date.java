/*
Cw 2
Zad 4
http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_03_2019.04.06.pdf
 */

public class Date {

    private int day;        //[1, 31]
    private int month;      //[1, 12]
    private int year;       //[1900, 9999]
                            //no input validation   needed


    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year){
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public String toString(){
        String dd;
        String mm;
        String yyyy;
        if (day < 10 || month < 10){
            dd = "0" + Integer.toString(day);
            mm = "0" + Integer.toString(month);
        }
        else{
            dd = Integer.toString(day);
            mm = Integer.toString(month);
        }
        yyyy = Integer.toString(year);
        return dd + "/" + mm + "/" + yyyy;

    }
}
