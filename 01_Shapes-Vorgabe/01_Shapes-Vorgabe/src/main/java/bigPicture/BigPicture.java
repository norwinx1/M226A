package bigPicture;

import shapes.Picture;
import shapes.Triangle;

public class BigPicture {

    private final Triangle triangle2;
    private final Triangle triangle1;
    private final Cloud cloud1;
    private final Cloud cloud2;
    private final Flower flower;
    private final Picture picture;

    public BigPicture() {
        triangle2 = new Triangle();
        triangle2.changeSize(200, 1800);
        triangle2.moveHorizontal(100);
        triangle2.moveVertical(100);
        triangle2.changeColor("green");
        triangle2.makeVisible();
        triangle1 = new Triangle();
        triangle1.changeSize(200, 1800);
        triangle1.moveHorizontal(100);
        triangle1.moveVertical(-50);
        triangle1.changeColor("blue");
        triangle1.makeVisible();
        cloud1 = new Cloud();
        cloud2 = new Cloud();
        cloud2.moveVertical(20);
        cloud2.moveHorizontal(80);
        picture = new Picture();
        picture.draw();
        flower = new Flower();
        flower.moveHorizontal(170);
        flower.moveVertical(140);
    }

    public void sunset() {
        picture.sunset();
        triangle1.changeColor("black");
        picture.makeBuildingVisible();
    }
}
