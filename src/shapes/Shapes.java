package shapes;

/**
 * Represents the base class for all shapes.
 * @author Group 9
 */
public abstract class Shapes implements Comparable<Shapes> {

    double height;

    /**
     * Calculates the volume.
     *
     * @return Shape volume.
     */
    public double calcVolume() {
        return 0;
    }

    /**
     * Calculates the base area.
     *
     * @return Shape area.
     */
    public double calcBaseArea() {
        return 0;
    }

    /**
     * Gets the height.
     *
     * @return Shape height.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height.
     *
     * @param height Shape height.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Compares the height of two shapes.
     *
     * @param s The shape to be compared.
     * @return 1 if this shape is larger. -1 if this shape is smaller. 0 if this shape is equal.
     */
    @Override
    public int compareTo(Shapes s) {
        if (this.getHeight() > s.getHeight()) {
            return 1;
        } else if (this.getHeight() < s.getHeight()) {
            return -1;
        }

        return 0;
    }
}
