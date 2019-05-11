/*
Autor: Artur Dembicki 16323
Cw 5, Zad 1
http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_05_2019.05.11.pdf

 */


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


    }


}
