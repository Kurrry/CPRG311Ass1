package shapes;

/**
 * Represents an octagonal prism.
 * @author Group 9
 */
public class OctagonalPrism extends Prism{
    /**
     * Constructor assigns values for height and edge length of an octagonal prism.
     *
     * @param height Height holds the octagonal prism's height.
     * @param side Side holds the octagonal prism's edge length.
     */
    public OctagonalPrism(double height, double side) {
        this.setHeight(height);
        this.setSide(side);
    }

    /**
     * Calculates the base area.
     *
     * @return Octagonal prism base area.
     */
    @Override
    public double calcBaseArea() {
        return (2 * (1 + Math.sqrt(2))) * super.calcBaseArea();
    }

    /**
     * Calculates the volume.
     *
     * @return Octagonal prism volume.
     */
    @Override
    public double calcVolume() {
        return this.calcBaseArea() * this.getHeight();
    }

    public String toString() {
        return "OctagonalPrism";
    }
}
