package shapes;

import java.util.Comparator;

/**
 * Represents a comparator for the volume of shapes.
 * @author Group 9
 */
public class VolumeCompare implements Comparator<Shapes> {
    /**
     * Compares the volume of two shapes.
     *
     * @param o1 the first shape to be compared.
     * @param o2 the second shape to be compared.
     * @return 1 if the first shape is larger. -1 if the first shape is smaller. 0 if both shapes are equal.
     */
    @Override
    public int compare(Shapes o1, Shapes o2) {
        if (o1.calcVolume() > o2.calcVolume()) {
            return 1;
        } else if (o1.calcVolume() < o2.calcVolume()) {
            return -1;
        }

        return 0;

    }
}
