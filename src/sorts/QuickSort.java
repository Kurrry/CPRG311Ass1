package sorts;

import java.util.Comparator;

/**
 * Represents the quick sort algorithm.
 * @author Group 9
 */
public final class QuickSort {
    /**
     * Sorts the shapes using the quicksort algorithm. Shape comparisons are done using a comparator.
     *
     * @param shapes Array of shapes to sort.
     * @param compareType Type of comparator.
     * @param <T> Type of shape.
     */
    public static <T> void doQuickSortCT(Comparable<T>[] shapes, Comparator<T> compareType) {
        // boilerplate method to pass initial values
        int highIndex = shapes.length - 1;
        int lowIndex = 0;

        sortCT(shapes, compareType, lowIndex, highIndex);
    }

    /**
     * Main method that implements the quicksort algorithm.
     *
     * @param shapes Array of shapes to be sorted.
     * @param compareType Type of comparator.
     * @param lowIndex Starting index in the array.
     * @param highIndex Ending index in the array.
     * @param <T> Type of shape
     */
    private static <T> void sortCT(Comparable<T>[] shapes, Comparator<T> compareType, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            // partition shapes based on pivot. pivot will always start at the last element
            int partitionIndex = partitionCT(shapes, compareType, lowIndex, highIndex);

            // recursive method to sort left and right subarrays
            sortCT(shapes, compareType, lowIndex, partitionIndex - 1);
            sortCT(shapes, compareType, partitionIndex + 1, highIndex);
        }
    }

    /**
     * This method takes the first element as the pivot. All elements smaller than the pivot are placed to the left
     * and all bigger elements are placed to the right.
     *
     * @param shapes Array of shapes.
     * @param compareType Type of comparator.
     * @param lowIndex Lowest index in the partitioned array.
     * @param highIndex Highest index in the partitioned array.
     * @return The partition index.
     * @param <T> Type of shape.
     */
    private static <T> int partitionCT(Comparable<T>[] shapes, Comparator<T> compareType, int lowIndex, int highIndex) {
        // lowPointer starts one position behind the moving pointer
        int lowPointer = (lowIndex - 1);

        // use for loop to move both pointers. moving pointer is the first element in the subarray
        for(int movingPointer = lowIndex; movingPointer <= highIndex - 1; movingPointer++) {

            // check if the value at moving pointer is greater than the pivot
            if(compareType.compare((T) shapes[movingPointer], (T) shapes[highIndex]) > 0) {
                lowPointer++; // increment low pointer to avoid out of bounds

                // swap the value at low pointer with the value at moving pointer if they are not at the same index
                // this causes the higher value to move "forward" in the subarray
                if (lowPointer != movingPointer) {
                    Comparable<T> temp = shapes[lowPointer];
                    shapes[lowPointer] = shapes[movingPointer];
                    shapes[movingPointer] = temp;
                }
            }
        }

        // move the pivot element to its sorted place in the array
        Comparable <T> temp = shapes[highIndex];
        shapes[highIndex] = shapes[lowPointer+1];
        shapes[lowPointer+1] = temp;
        return lowPointer + 1; // return the partition index where the sorted element is
    }

    /**
     * Sorts the shapes using the quicksort algorithm. Shape comparisons are done using .compareTo().
     *
     * @param shapes Array of shapes to sort.
     * @param <T> Type of shape.
     */
    public static <T> void doQuickSortNoCT(Comparable<T>[] shapes) {
        int highIndex = shapes.length - 1;
        int lowIndex = 0;

        sortNoCT(shapes, lowIndex, highIndex);
    }

    /**
     * Main method that implements the quicksort algorithm.
     *
     * @param shapes Array of shapes to be sorted.
     * @param lowIndex Starting index in the array.
     * @param highIndex Ending index in the array.
     * @param <T> Type of shape
     */
    private static <T> void sortNoCT(Comparable<T>[] shapes, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int partitionIndex = partitionNoCT(shapes, lowIndex, highIndex);

            sortNoCT(shapes, lowIndex, partitionIndex - 1);
            sortNoCT(shapes, partitionIndex + 1, highIndex);
        }
    }

    /**
     * This method takes the first element as the pivot. All elements smaller than the pivot are placed to the left
     * and all bigger elements are placed to the right.
     *
     * @param shapes Array of shapes.
     * @param lowIndex Lowest index in the partitioned array.
     * @param highIndex Highest index in the partitioned array.
     * @return The partition index.
     * @param <T> Type of shape.
     */
    private static <T> int partitionNoCT(Comparable<T>[] shapes, int lowIndex, int highIndex) {
        int lowPointer = (lowIndex - 1);

        for(int movingPointer = lowIndex; movingPointer <= highIndex - 1; movingPointer++) {
            if(shapes[movingPointer].compareTo ((T) shapes[highIndex]) > 0) {
                lowPointer++;
                if (lowPointer != movingPointer) {
                    Comparable<T> temp = shapes[lowPointer];
                    shapes[lowPointer] = shapes[movingPointer];
                    shapes[movingPointer] = temp;
                }
            }
        }
        Comparable <T> temp = shapes[highIndex];
        shapes[highIndex] = shapes[lowPointer+1];
        shapes[lowPointer+1] = temp;
        return lowPointer + 1;
    }
}
