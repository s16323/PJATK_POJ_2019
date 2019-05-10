/*
Cw 4
Zad 2
http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_04_2019.04.27.pdf
*/

import java.util.ArrayList;

class Point2D {

    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {
        this.x = x;
        this.y = y;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float coords[] = new float[2];
        coords[0] = x;
        coords[1] = y;
        return coords;
    }


}
