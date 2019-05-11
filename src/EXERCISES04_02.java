/*
Autorzy:   Artur Dembicki 16323
           Aleksander Mojzych
Cw 4
Zad 2
http://szuflandia.pjwstk.edu.pl/~pczapiewski/POJ_2018-2019/POJ_cwiczenia_04_2019.04.27.pdf
*/

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

    public String toString(){
        return "(" + x + "," + y + ")";
    }
}

class Point3D extends Point2D{

    private float z = 0.0f;

    public Point3D() {
        super();
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public float[] getXYZ(){
        float coords[] = new float[3];
        coords[0] = super.getX();
        coords[1] = super.getY();
        coords[2] = z;
        return coords;
    }

    public String toString(){
        return "(" + super.getX() + "," + super.getY() + "," + z +")";
    }

}
