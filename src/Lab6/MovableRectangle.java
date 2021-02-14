package Lab6;

public class MovableRectangle implements Movable {
    private MovablePoints UpperLeft;
    private MovablePoints LowerRight;
    public MovableRectangle (int x1, int y1, int x2, int y2, int speedOX, int speedOY) {
        this.UpperLeft = new MovablePoints(x1, y1, speedOX, speedOY);
        this.LowerRight = new MovablePoints(x2, y2, speedOX, speedOY);
        identicalSpeed();
    }
    private void identicalSpeed(){
        if(UpperLeft.speedOY != LowerRight.speedOY){
            UpperLeft.speedOY = LowerRight.speedOY;
        }
        if(UpperLeft.speedOX != LowerRight.speedOX){
            UpperLeft.speedOX = LowerRight.speedOX;
        }
    }

    @Override
    public void movingUp() {
        UpperLeft.movingUp();
        LowerRight.movingUp();
    }
    @Override
    public void movingDown() {
        UpperLeft.movingDown();
        LowerRight.movingDown();
    }


    @Override
    public void movingRight() {
        UpperLeft.movingRight();
        LowerRight.movingRight();
    }
    @Override
    public void movingLeft() {
        UpperLeft.movingLeft();
        LowerRight.movingLeft();
    }
    @Override
    public String toString() {
        return "Прямоугольник с координатами: (" + UpperLeft.x + ", " + UpperLeft.y + ", " +
                LowerRight.x + ", " + LowerRight.y + ")";
    }
}
