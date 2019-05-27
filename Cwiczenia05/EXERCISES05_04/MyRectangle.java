/*
Autor: Artur Dembicki 16323
Cw 5, Zad 4
http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_05_2019.05.11.pdf
*/
public class MyRectangle {

    private MyPoint top_left;
    private MyPoint bottom_right;

    public MyRectangle(MyPoint top_left, MyPoint bottom_right) {
        this.top_left = top_left;
        this.bottom_right = bottom_right;
    }

    public MyPoint getTop_left() {
        return top_left;
    }

    public void setTop_left(MyPoint top_left) {
        this.top_left = top_left;
    }

    public MyPoint getBottom_right() {
        return bottom_right;
    }

    public void setBottom_right(MyPoint bottom_right) {
        this.bottom_right = bottom_right;
    }

    @Override
    public String toString() {
        return "MyRectangle{" +
                "top_left=" + top_left +
                ", bottom_right=" + bottom_right +
                '}';
    }
}
