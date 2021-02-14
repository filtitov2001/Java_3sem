package Lab6;
public class MovablePoints implements Movable {
    protected int x;
    protected int y;
    protected int speedOX;
    protected int speedOY;

    public MovablePoints(int x, int y, int speedOX, int speedOY) {
        this.x = x;
        this.y = y;
        this.speedOX = speedOX;
        this.speedOY = speedOY;
    }


    @Override
    public void movingUp() {

        y+=speedOY;
    }


    public void movingDown()
    {
        y-=speedOY;

    }

    @Override
    public void movingLeft() {
        x+=speedOX;
    }

    @Override
    public void movingRight() {

        x-=speedOX;
    }
    public String toString() {

        return "Точка с координатами: (" + x + ", " + y + ")";
    }

}
