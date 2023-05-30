package shapes;

public class PentagonalPrism extends Prism{
    public PentagonalPrism(double height, double side) {
        this.setHeight(height);
        this.setSide(side);
    }

    @Override
    public double calcBaseArea() {
        return (5 * super.calcBaseArea() * Math.tan(Math.toRadians(54))) / 4;
    }

    @Override
    public double calcVolume() {
        return this.calcBaseArea() * this.getHeight();
    }

    public String toString() {
        return "PentagonalPrism";
    }
}
