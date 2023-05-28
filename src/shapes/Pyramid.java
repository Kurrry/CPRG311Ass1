package shapes;

public class Pyramid extends Prism {
    public Pyramid(double height, double side) {
        this.setHeight(height);
        this.setSide(side);
    }

    @Override
    public double calcVolume() {
        return ((double) 1 / 3) * super.calcBaseArea() * this.getHeight();
    }

    public String toString() {
        return "Pyramid" + this.getHeight() + " " + this.getSide();
    }
}
