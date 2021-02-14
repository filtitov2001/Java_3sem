package Lab6;

public class Main {

    public static void main(String[] args) {
        MovablePoints point = new MovablePoints(0, 0, 1, 1);
        System.out.println("Изначальные координаты точки: ");
        System.out.println(point);
        switch ((int) (1 + Math.random()*3))
        {
            case 1:
                point.movingUp();
                break;
            case 2:
                point.movingLeft();
                break;
            case 3:
                point.movingDown();
                break;
            case 4:
                point.movingRight();
        }
        System.out.println("Новые координаты точки: ");
        System.out.println(point);


        MovableRectangle rectangle = new MovableRectangle(0, 0, 1, 1, 1, 1);
        System.out.println("Изначальные координаты прямоугольника: ");
        System.out.println(rectangle);
        System.out.println("Новые координаты прямоугольника: ");
        switch ((int) (1 + Math.random()))
        {
            case 1:
                rectangle.movingUp();
                rectangle.movingLeft();
                break;
            case 2:
                rectangle.movingDown();
                rectangle.movingRight();
                break;


        }
        System.out.println(rectangle);
    }
}
