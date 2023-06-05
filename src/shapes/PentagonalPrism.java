package shapes;

/**
 * Represents a pentagonal prism.
 * @author Group 9
 */
public class PentagonalPrism extends Prism{
    /**
     * Constructor assigns values for height and edge length of a pentagonal prism.
     *
     * @param height Height holds the pentagonal prism's height.
     * @param side Side holds the pentagonal prism's edge length.
     */
    public PentagonalPrism(double height, double side) {
        this.setHeight(height);
        this.setSide(side);
    }

    /**
     * Calculates the base area.
     *
     * @return Pentagonal prism base area.
     */
    @Override
    public double calcBaseArea() {
        return (5 * super.calcBaseArea() * Math.tan(Math.toRadians(54))) / 4;
    }

    /**
     * Calculates the volume.
     *
     * @return Pentagonal prism volume.
     */
    @Override
    public double calcVolume() {
        return this.calcBaseArea() * this.getHeight();
    }

    public String toString() {
        return "PentagonalPrism";
    }
}
