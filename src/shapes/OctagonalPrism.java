package shapes;

public class OctagonalPrism extends Prism{
    public OctagonalPrism(double height, double side) {
        this.setHeight(height);
        this.setSide(side);
    }

    @Override
    public double calcBaseArea() {
        return (2 * (1 + Math.sqrt(2))) * super.calcBaseArea();
    }

    @Override
    public double calcVolume() {
        return this.calcBaseArea() * this.getHeight();
    }

    public String toString() {
        return "OctagonalPrism" + this.getHeight() + " " + this.getSide();
    }
}
