package shapes;

/**
 * Represents a prism.
 * @author Group 9
 */
public abstract class Prism extends Shapes{
    double side;

    /**
     * Gets the edge length.
     *
     * @return Prism edge length.
     */
    public double getSide() {
        return side;
    }

    /**
     * Calculates the base area.
     *
     * @return Prism base area.
     */
    @Override
    public double calcBaseArea() {
        return Math.pow(this.getSide(), 2);
    }

    /**
     * Sets the edge length
     *
     * @param side Prism edge length.
     */
    public void setSide(double side) {
        this.side = side;
    }


}
