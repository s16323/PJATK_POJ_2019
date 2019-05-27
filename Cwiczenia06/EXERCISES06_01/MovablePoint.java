public class MovablePoint implements Movable {

    //Instance variables:
    int x, y, xSpeed, ySpeed;   //package access

    //Constructor:
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    //Abstract methods declared in Movable interface:
    @Override
    public void moveUp() {
        y -= ySpeed;    //y-axis points down
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;    //x-axis points right
    }
}
