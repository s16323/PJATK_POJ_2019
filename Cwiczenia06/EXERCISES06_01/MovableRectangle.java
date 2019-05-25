public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    @Override
    public String toString() {
        return "MovableRectangle{}";
    }

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y1 = y2;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}
