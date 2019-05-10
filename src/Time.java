/*
Cw 2
Zad 5
http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_03_2019.04.06.pdf
 */

public class Time {

    private int hour;       //[0,23]
    private int minute;     //[0,59]
    private int second;     //[0,59]
                            //no input validation   needed


    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public String toString(){
        String hh;
        String mm;
        String ss;
        if (hour < 10 || minute < 10 || second < 10){
            hh = "0" + Integer.toString(hour);
            mm = "0" + Integer.toString(minute);
            ss = "0" + Integer.toString(second);
        }
        else{
            hh = Integer.toString(hour);
            mm = Integer.toString(minute);
            ss = Integer.toString(second);
        }
        return hh + ":" + mm + ":" + ss;
    }

    public Time nextSecond(){
        Time timeObject = new Time(getHour(), getMinute(), getSecond());
        timeObject.second++;
        return timeObject;
    }

    public Time previousSecond(){
        Time timeObject = new Time(getHour(), getMinute(), getSecond());
        timeObject.second = this.second - 1;
        return timeObject;
    }
}
