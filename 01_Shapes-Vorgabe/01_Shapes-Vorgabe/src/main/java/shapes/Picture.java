package shapes;

public class Picture {
    private final Circle circle;
    private Building building;

    public Picture() {
        circle = new Circle();
    }

    public void draw() {
        circle.moveHorizontal(170);
        circle.changeColor("yellow");
        circle.makeVisible();
        building = new Building();
    }

    public void sunset() {
        circle.slowMoveVertical(80);
        circle.makeInvisible();
        makeBuildingInvisible();
    }

    public void makeBuildingInvisible() {
        building.makeInvisible();
    }

    public void makeBuildingVisible() {
        building.makeVisible();
    }
}
