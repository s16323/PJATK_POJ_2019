/*
Autor: Artur Dembicki 16323
Cw 5, Zad 2
http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_05_2019.05.11.pdf
*/

public class MyCircle {

    private MyPoint center;
    private int radius;

    public MyCircle() {
        this.center = new MyPoint(0,0);
        this.radius = 1;
    }

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
         center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public int[] getCenterXY() {

        int[] coordinates = new int[2];
        coordinates[0] = getCenterX();
        coordinates[1] = getCenterY();
        return coordinates;
    }

    public void setCenterXY(int x, int y) {

        this.center = new MyPoint(x, y);
    }

    @Override
    public String toString() {
        return "MyCircle[radius = " + radius + ", center = " + center.toString() + "]";
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
    public double distance(MyPoint another){
        return another.distance(this.center);
    }
}
