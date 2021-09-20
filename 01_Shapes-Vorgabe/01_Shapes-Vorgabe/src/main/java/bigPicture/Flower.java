package bigPicture;

import shapes.Circle;
import shapes.Square;
import shapes.Triangle;

import java.util.ArrayList;

public class Flower {
    private final Circle yellowCircle;
    private final Circle circle1;
    private final Circle circle2;
    private final Circle circle3;
    private final Circle circle4;
    private final ArrayList<Square> squares;
    private final Triangle triangle1;
    private final Triangle triangle2;


    public Flower() {
        circle1 = new Circle();
        circle1.changeColor("white");
        circle1.moveHorizontal(-10);
        circle2 = new Circle();
        circle2.changeColor("white");
        circle2.moveVertical(-10);
        circle3 = new Circle();
        circle3.changeColor("white");
        circle3.moveHorizontal(10);
        circle4 = new Circle();
        circle4.changeColor("white");
        circle4.moveVertical(10);
        Square square1 = new Square();
        Square square2 = new Square();
        Square square3 = new Square();
        Square square4 = new Square();
        Square square5 = new Square();
        Square square6 = new Square();
        Square square7 = new Square();
        Square square8 = new Square();
        Square square9 = new Square();
        Square square10 = new Square();
        squares = new ArrayList<>();
        squares.add(square1);
        squares.add(square2);
        squares.add(square3);
        squares.add(square4);
        squares.add(square5);
        squares.add(square6);
        squares.add(square7);
        squares.add(square8);
        squares.add(square9);
        squares.add(square10);
        int i = 0;
        for (Square square : squares) {
            i = i + 3;
            square.changeSize(5);
            square.moveVertical(47 + i);
            square.moveHorizontal(-27);
        }
        yellowCircle = new Circle();
        yellowCircle.changeColor("yellow");
        triangle1 = new Triangle();
        triangle2 = new Triangle();
        triangle1.changeColor("red");
        triangle2.changeColor("red");
        triangle1.moveVertical(85);
        triangle1.moveHorizontal(-9);
        triangle2.moveVertical(100);
        triangle2.moveHorizontal(-21);
        triangle1.changeSize(10, 10);
        triangle2.changeSize(10, 10);

        circle1.makeVisible();
        circle2.makeVisible();
        circle3.makeVisible();
        circle4.makeVisible();
        for (Square square : squares) {
            square.makeVisible();
        }
        yellowCircle.makeVisible();
        triangle1.makeVisible();
        triangle2.makeVisible();
    }

    public void moveVertical(int distance) {
        circle1.moveVertical(distance);
        circle2.moveVertical(distance);
        circle3.moveVertical(distance);
        circle4.moveVertical(distance);
        yellowCircle.moveVertical(distance);
        for (Square square : squares) {
            square.moveVertical(distance);
        }
        triangle1.moveVertical(distance);
        triangle2.moveVertical(distance);
    }

    public void moveHorizontal(int distance) {
        circle1.moveHorizontal(distance);
        circle2.moveHorizontal(distance);
        circle3.moveHorizontal(distance);
        circle4.moveHorizontal(distance);
        yellowCircle.moveHorizontal(distance);
        for (Square square : squares) {
            square.moveHorizontal(distance);
        }
        triangle1.moveHorizontal(distance);
        triangle2.moveHorizontal(distance);
    }
}
