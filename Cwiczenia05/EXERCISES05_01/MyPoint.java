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

    public double distance(int x, int y){
        // Distance from this point to a given point (x, y)
        double dist = Math.sqrt((this.x - x)^2 + (this.y - y)^2);
        return dist;
    }

    public double distance(MyPoint another){
        // Distance from this point to a given instance of MyPoint

        int x0 = another.getX();
        int y0 = another.getY();

        double dist = Math.sqrt((this.x - x0)^2 + (this.y - y0)^2);
        return dist;
    }

    public double distance(){
        // Distance from this point to (0,0)
        double dist = Math.sqrt((this.x)^2 + (this.y)^2);
        return dist;
    }

}

