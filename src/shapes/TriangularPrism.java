package shapes;

public class TriangularPrism extends Prism{
    public TriangularPrism(double height, double side) {
        this.setHeight(height);
        this.setSide(side);
    }

    @Override
    public double calcBaseArea() {
        return (super.calcBaseArea() * Math.sqrt(3)) / 4;
    }

    @Override
    public double calcVolume() {
        return this.calcBaseArea() * this.getHeight();
    }

    public String toString() {
        return "TriangularPrism";
    }
}
