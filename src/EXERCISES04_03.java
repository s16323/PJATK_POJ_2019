/*
Cw 4
Zad 3
http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_04_2019.04.27.pdf
*/

class Point {

    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {
        this.x = x;
        this.y = y;
    }

    public Point(float x, float y) {
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

    public String toString(){
        return "(" + x + "," + y + ")";
    }
}


class MovablePoint extends Point{

    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }

    public float[] getSpeed() {
        float displacementVector[] = new float[2];
        displacementVector[0] = xSpeed;
        displacementVector[1] = ySpeed;
        return displacementVector;
    }

    public String toString(){
        return "(" + super.getX() + "," + super.getY() + "), speed = (" + xSpeed + "," + ySpeed + ")";
    }

}