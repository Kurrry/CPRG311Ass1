package sorts;

import java.util.Comparator;

/**
 * Represents the bubble sort algorithm.
 * @author Group 9
 */
public final class BubbleSort {
    /**
     * Sorts the shapes using bubble sort. Shape comparisons are done using a comparator.
     *
     * @param shapes Array of shapes to sort.
     * @param compareType Type of comparator to use.
     * @param <T> Type of shape.
     */
    public static <T> void doBubbleSort(Comparable<T>[] shapes, Comparator<T> compareType) {
        for(int i = 0; i <= shapes.length - 1; i++) {

            for(int j = 1; j <= shapes.length - i - 1; j++) {
                if(compareType.compare((T) shapes[j-1], (T) shapes[j]) < 0) {
                    Comparable<T> temp = shapes[j-1];
                    shapes[j-1] = shapes[j];
                    shapes[j] = temp;
                }
            }
        }
    }

    /**
     * Sorts the shapes using bubble sort. Shape comparisons are using .compareTo().
     *
     * @param shapes Array of shapes to sort.
     * @param <T> Type of shape.
     */
    public static <T> void doBubbleSort(Comparable<T>[] shapes) {
        for(int i = 0; i <= shapes.length - 1; i++) {

            for(int j = 1; j <= shapes.length - i - 1; j++) {
                if(shapes[j-1].compareTo((T) shapes[j]) < 0) {
                    Comparable<T> temp = shapes[j-1];
                    shapes[j-1] = shapes[j];
                    shapes[j] = temp;
                }
            }
        }
    }
}
