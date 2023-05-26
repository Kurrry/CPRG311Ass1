package shapes;

public class TriangularPrism extends Prism{
    public TriangularPrism(double height, double side) {
        setHeight(height);
        setSide(side);
    }

    public String toString() {
        return "TriangularPrism" + getHeight() + " " + getSide();
    }
}
