package sorts;

import java.util.Comparator;

/**
 * Represents the selection sort algorithm.
 * @author Group 9
 */
public final class SelectionSort {
    /**
     * Sorts the array of shapes using the selection sort algorithm. Comparisons are done using a comparator.
     *
     * @param shapes Array of shapes to be sorted.
     * @param compareType Type of comparator.
     * @param <T> Type of shape.
     */
    public static <T> void doSelectionSort(Comparable<T>[] shapes, Comparator<T> compareType) {
        for(int i = 0; i < shapes.length - 1; i++) {
            int indexOfMin = i;

            for(int j = i+1; j < shapes.length; j++) {
                if(compareType.compare((T) shapes[j], (T) shapes[indexOfMin]) > 0) {
                    indexOfMin = j;
                }
            }

            if (indexOfMin != i) {
                Comparable<T> temp = shapes[indexOfMin];
                shapes[indexOfMin] = shapes[i];
                shapes[i] = temp;
            }
        }
    }

    /**
     * Sorts the array of shapes using the selection sort algorithm. Comparisons are done using .compareTo().
     *
     * @param shapes Array of shapes to be sorted.
     * @param <T> Type of shape.
     */
    public static <T> void doSelectionSort(Comparable<T>[] shapes) {
        for(int i = 1; i < shapes.length - 1; i++) {
            int indexOfMin = i;

            for(int j = i+1; j < shapes.length; j++) {
                if(shapes[j].compareTo((T) shapes[indexOfMin]) > 0) {
                    indexOfMin = j;
                }
            }

            if (indexOfMin != i) {
                Comparable<T> temp = shapes[indexOfMin];
                shapes[indexOfMin] = shapes[i];
                shapes[i] = temp;
            }
        }
    }
}
