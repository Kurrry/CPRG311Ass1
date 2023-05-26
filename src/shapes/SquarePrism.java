package shapes;

public class SquarePrism extends Prism{
    public SquarePrism(double height, double side) {
        setHeight(height);
        setSide(side);
    }

    public String toString() {
        return "SquarePrism" + getHeight() + " " + getSide();
    }
}
