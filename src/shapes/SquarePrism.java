package shapes;

public class SquarePrism extends Prism{
    public SquarePrism(double height, double side) {
        this.setHeight(height);
        this.setSide(side);
    }

    @Override
    public double calcVolume() {
        return super.calcBaseArea() * this.getHeight();
    }

    public String toString() {
        return "SquarePrism" + this.getHeight() + " " + this.getSide();
    }
}
