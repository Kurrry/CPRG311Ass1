package sorts;

import java.util.Comparator;

/**
 * Represents the insertion sort algorithm.
 * @author Group 9
 */
public final class InsertionSort {

    /**
     * Sorts the shapes using insertion sort. Shape comparisons are done using a comparator.
     *
     * @param shapes Array of shapes to sort.
     * @param compareType Type of comparator.
     * @param <T> Type of shape.
     */
    public static <T> void doInsertionSort(Comparable<T>[] shapes, Comparator<T> compareType) {
        for(int i = 1; i <= shapes.length - 1; i++) {
            Comparable<T> current = shapes[i]; // track the current element
            int j = i;

            // iterate through array until we find an element that is smaller than the current
            while (j > 0 && compareType.compare((T) shapes[j-1], (T) current) < 0) {
                shapes[j] = shapes[j-1]; // move the element up one space if we do not find a smaller element
                j -= 1;
            }
            shapes[j] = current; // set the current elements sorted position
        }
    }

    /**
     * Sorts the shapes using insertion sort. Shape comparisons are done using .compareTo().
     *
     * @param shapes Array of shapes to sort.
     * @param <T> Type of shape.
     */
    public static <T> void doInsertionSort(Comparable<T>[] shapes) {
        for(int i = 1; i <= shapes.length - 1; i++) {
            Comparable<T> current = shapes[i];
            int j = i;

            while (j > 0 && shapes[j-1].compareTo((T) current) < 0) {
                shapes[j] = shapes[j-1];
                j -= 1;
            }
            shapes[j] = current;
        }
    }
}
