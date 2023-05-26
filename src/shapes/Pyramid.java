package shapes;

public class Pyramid extends Prism {
    public Pyramid(double height, double side) {
        setHeight(height);
        setSide(side);
    }

    public String toString() {
        return "Pyramid" + getHeight() + " " + getSide();
    }
}
