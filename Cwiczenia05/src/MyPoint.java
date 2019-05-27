/*
Autor: Artur Dembicki 16323
Cw 5, Zad 1
http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_05_2019.05.11.pdf
 */
import java.lang.Math;
import java.lang.reflect.Array;

public class MyPoint {

    private int x = 0;
    private int y = 0;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint() {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        //return 2 elem. int array of {x,y}
//        int arr[] = {x, y};
        return new int[]{x,y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

//    public double distance(int x, int y){
//
//
//    }

    public double distance(MyPoint another){

        int x0 = another.getX();
        int y0 = another.getY();

//    double dist = java.lang.Math.sqrt(Math.pow((this.x - x0), 2)+ Math.pow((this.y - y0), 2));
        double dist = Math.sqrt((this.x - x0)^2 + (this.y - y0)^2);
        return dist;
    }

    public double distance(){

        double dist = Math.sqrt((this.x)^2 + (this.y)^2);
        return dist;
    }

}

class Main {

    public static void main(String[] args) {

        MyPoint myPoint = new MyPoint(1,1);

        //Array<MyPoint> list = new Array();
        List<MyPoint> list = new

        for (i = 1, i <= list.length, i++){

//            list.add(MyPoint(i,i));

        }
    }
}
