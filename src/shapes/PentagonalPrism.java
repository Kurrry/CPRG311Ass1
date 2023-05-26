package shapes;

public class PentagonalPrism extends Prism{
    public PentagonalPrism(double height, double side) {
        setHeight(height);
        setSide(side);
    }

    public String toString() {
        return "PentagonalPrism" + getHeight() + " " + getSide();
    }
}
