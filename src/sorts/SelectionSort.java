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
            // maximum element is assumed to be starting position
            int indexOfMax = i;

            for(int j = i+1; j < shapes.length; j++) {
                // compare elements until a new max element is found
                if(compareType.compare((T) shapes[j], (T) shapes[indexOfMax]) > 0) {
                    indexOfMax = j; // save the index of the max element
                }
            }

            if (indexOfMax != i) {
                // swap the max element with the element at index i, unless they are in the same position
                Comparable<T> temp = shapes[indexOfMax];
                shapes[indexOfMax] = shapes[i];
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
            int indexOfMax = i;

            for(int j = i+1; j < shapes.length; j++) {
                if(shapes[j].compareTo((T) shapes[indexOfMax]) > 0) {
                    indexOfMax = j;
                }
            }

            if (indexOfMax != i) {
                Comparable<T> temp = shapes[indexOfMax];
                shapes[indexOfMax] = shapes[i];
                shapes[i] = temp;
            }
        }
    }
}
