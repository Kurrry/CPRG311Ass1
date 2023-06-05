package shapes;

/**
 * Represents round shapes.
 * @author Group 9
 */
public abstract class RoundShapes extends Shapes{
    double radius;

    /**
     * Gets the radius.
     *
     * @return Round shape radius.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Calculates the base area.
     *
     * @return Round shape base area.
     */
    @Override
    public double calcBaseArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    /**
     * Calculates the volume.
     *
     * @return Round shape volume.
     */
    @Override
    public double calcVolume() {
        return this.calcBaseArea() * this.getHeight();
    }

    /**
     * Sets the radius.
     *
     * @param radius Round shape radius.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
