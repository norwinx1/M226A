package bigPicture;

import shapes.Circle;

import java.util.Random;

public class Cloud {
    private final Circle circle1;
    private final Circle circle2;
    private final Circle circle3;
    private final Circle circle4;

    public Cloud() {
        circle1 = new Circle();
        circle2 = new Circle();
        circle3 = new Circle();
        circle4 = new Circle();
        circle1.changeColor("white");
        circle2.changeColor("white");
        circle3.changeColor("white");
        circle4.changeColor("white");
        Random random = new Random();
        int i = random.nextInt(22 - 18 + 1) + 18;
        circle2.moveHorizontal(i);
        circle3.moveVertical(i);
        circle4.moveHorizontal(i);
        circle4.moveVertical(i);
        circle1.makeVisible();
        circle2.makeVisible();
        circle3.makeVisible();
        circle4.makeVisible();
    }

    public void moveVertical(int distance) {
        circle1.moveVertical(distance);
        circle2.moveVertical(distance);
        circle3.moveVertical(distance);
        circle4.moveVertical(distance);
    }

    public void moveHorizontal(int distance) {
        circle1.moveHorizontal(distance);
        circle2.moveHorizontal(distance);
        circle3.moveHorizontal(distance);
        circle4.moveHorizontal(distance);
    }
}
