package shapes;

public class Building {

    private final Square square;
    private final Square square2;
    private final Square square3;
    private final Triangle triangle;

    public Building() {
        square = new Square();
        square.moveVertical(120);
        square.moveHorizontal(30);
        square.changeColor("red");
        square.changeSize(80);
        square.makeVisible();

        square2 = new Square();
        square2.moveVertical(140);
        square2.moveHorizontal(40);
        square2.changeColor("black");
        square2.changeSize(20);
        square2.makeVisible();

        square3 = new Square();
        square3.moveVertical(140);
        square3.moveHorizontal(80);
        square3.changeColor("green");
        square3.changeSize(20);
        square3.makeVisible();

        triangle = new Triangle();
        triangle.moveVertical(110);
        triangle.moveHorizontal(80);
        triangle.changeColor("red");
        triangle.changeSize(50, 100);
        triangle.makeVisible();
    }

    public void makeVisible() {
        square.makeVisible();
        square2.makeVisible();
        square3.makeVisible();
        triangle.makeVisible();
    }

    public void makeInvisible() {
        square.makeInvisible();
        square2.makeInvisible();
        square3.makeInvisible();
        triangle.makeInvisible();
    }
}
