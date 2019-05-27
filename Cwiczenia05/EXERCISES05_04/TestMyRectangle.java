/*
Autor: Artur Dembicki 16323
Cw 5, Zad 4
http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_05_2019.05.11.pdf
*/
public class TestMyRectangle {

    public static void main(String[] args) {

        MyPoint top_left = new MyPoint(0,0);
        MyPoint bottom_right = new MyPoint(1, 1);
        MyRectangle rectangle = new MyRectangle(top_left, bottom_right);

        System.out.println(rectangle.toString());       // MyRectangle{top_left=(0,0), bottom_right=(1,1)}

    }
}
