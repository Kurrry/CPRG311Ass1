package shapes;

public class OctagonalPrism extends Prism{
    public OctagonalPrism(double height, double side) {
        setHeight(height);
        setSide(side);
    }

    public String toString() {
        return "OctagonalPrism" + getHeight() + " " + getSide();
    }
}
