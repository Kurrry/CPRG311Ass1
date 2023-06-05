package shapes;

/**
 * Represents a pyramid.
 * @author Group 9
 */
public class Pyramid extends Prism {
    /**
     * Constructor assigns values for height and edge length of a pyramid.
     *
     * @param height Height holds the pyramid's height.
     * @param side Side holds the pyramid's edge length.
     */
    public Pyramid(double height, double side) {
        this.setHeight(height);
        this.setSide(side);
    }

    /**
     * Calculates the volume.
     *
     * @return Pyramid volume.
     */
    @Override
    public double calcVolume() {
        return ((double) 1 / 3) * super.calcBaseArea() * this.getHeight();
    }

    public String toString() {
        return "Pyramid";
    }
}
