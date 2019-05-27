/*
Autor: Artur Dembicki 16323
Cw 6, Zad 2
http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_06_2019.05.25.pdf
 */
import java.lang.Math;

public class Circle implements GeometricObject {

    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}
