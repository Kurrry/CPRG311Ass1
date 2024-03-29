package sorts;

import java.util.Comparator;

/**
 * Represents the merge sort algorithm.
 * @author Group 9
 */
public final class MergeSort {
    /**
     * Sorts the shapes using merge sort. Shape comparisons are done using a comparator.
     *
     * @param shapes Array of shapes to sort.
     * @param compareType Type of comparator.
     * @param <T> Type of shape.
     */
    public static <T> void doMergeSort(Comparable<T>[] shapes, Comparator<T> compareType) {
        // boilerplate method to pass initial values

        int left = 0;
        int right = shapes.length - 1;

        splitCT(shapes, compareType, left, right);
    }

    /**
     * Main method that implements the merge sort algorithm.
     *
     * @param shapes Array of shapes.
     * @param compareType Type of comparator.
     * @param left Leftmost index of array.
     * @param right Rightmost index of array.
     * @param <T> Type of shape.
     */
    private static <T> void splitCT(Comparable<T>[] shapes, Comparator<T> compareType, int left, int right) {
        if(left < right) {
            // find middle/pivot point between left and right values
            int middle = left + (right - left) / 2;

            // recursive method reduces/sorts left and right subarrays to smaller subarrays
            splitCT(shapes, compareType, left, middle);
            splitCT(shapes, compareType, middle+1, right);

            // merge the subarrays into their final sorted form
            mergeCT(shapes, compareType, left, middle, right);
        }
    }

    /**
     * Merges two sub arrays of shapes[]. First array is [left ... middle]. Second is [middle + 1 ... right].
     *
     * @param shapes Array of shapes.
     * @param compareType Type of comparator.
     * @param left Leftmost index of the array.
     * @param middle Middle index of the array.
     * @param right Rightmost index of the array.
     * @param <T> Type of shape.
     */
    private static <T> void mergeCT(Comparable<T>[] shapes, Comparator<T> compareType, int left, int middle, int right) {
        // find the size of the new arrays to be created
        int leftSize = middle - left + 1;
        int rightSize = right - middle;

        // create arrays using the previous values
        Comparable<T>[] leftArray = new Comparable[leftSize];
        Comparable<T>[] rightArray = new Comparable[rightSize];

        // copy values from shapes array into the left and right array
        for(int i = 0; i < leftSize; i++) {
            leftArray[i] = shapes[left + i];
        }
        for(int i = 0; i < rightSize; i++) {
            rightArray[i] = shapes[middle + 1 + i];
        }

        // create pointers
        int leftPointer = 0;
        int rightPointer = 0;
        int startingPoint = left; // pointer for original shapes array

        // iterate until one of the pointers reaches the end of its array
        while (leftPointer < leftSize && rightPointer < rightSize) {
            // compare left array with right array
            if(compareType.compare((T) leftArray[leftPointer], (T) rightArray[rightPointer]) >= 0) {
                // place the appropriate value into shapes and increment pointer
                shapes[startingPoint] = leftArray[leftPointer];
                leftPointer++;
            } else {
                shapes[startingPoint] = rightArray[rightPointer];
                rightPointer++;
            }
            // increment shapes pointer to avoid copying over the value we just sorted
            startingPoint++;
        }

        // empty any remaining values from left array into shapes as these are sorted
        while(leftPointer < leftSize) {
            shapes[startingPoint] = leftArray[leftPointer];
            leftPointer++;
            startingPoint++;
        }

        // empty any remaining values from right array into shapes as these are sorted
        while(rightPointer < rightSize) {
            shapes[startingPoint] = rightArray[rightPointer];
            rightPointer++;
            startingPoint++;
        }
    }

    /**
     * Sorts the shapes using insertion sort. Shape comparisons are done using .compareTo().
     *
     * @param shapes Array of shapes to sort.
     * @param <T> Type of shape.
     */
    public static <T> void doMergeSort(Comparable<T>[] shapes) {
        int left = 0;
        int right = shapes.length - 1;

        splitNoCT(shapes, left, right);
    }

    /**
     * Main method that implements the merge sort algorithm.
     *
     * @param shapes Array of shapes.
     * @param left Leftmost index of array.
     * @param right Rightmost index of array.
     * @param <T> Type of shape.
     */
    private static <T> void splitNoCT(Comparable<T>[] shapes, int left, int right) {
        if(left < right) {
            int middle = left + (right - left) / 2;

            splitNoCT(shapes, left, middle);
            splitNoCT(shapes, middle+1, right);

            mergeNoCT(shapes, left, middle, right);
        }
    }

    /**
     * Merges two sub arrays of shapes[]. First array is [left ... middle]. Second is [middle + 1 ... right].
     *
     * @param shapes Array of shapes.
     * @param left Leftmost index of the array.
     * @param middle Middle index of the array.
     * @param right Rightmost index of the array.
     * @param <T> Type of shape.
     */
    private static <T> void mergeNoCT(Comparable<T>[] shapes, int left, int middle, int right) {
        int leftSize = middle - left + 1;
        int rightSize = right - middle;

        Comparable<T>[] leftArray = new Comparable[leftSize];
        Comparable<T>[] rightArray = new Comparable[rightSize];

        for(int i = 0; i < leftSize; i++) {
            leftArray[i] = shapes[left + i];
        }
        for(int i = 0; i < rightSize; i++) {
            rightArray[i] = shapes[middle + 1 + i];
        }

        int leftPointer = 0;
        int rightPointer = 0;
        int shapesPointer = left;

        while (leftPointer < leftSize && rightPointer < rightSize) {
            if(leftArray[leftPointer].compareTo((T) rightArray[rightPointer]) >= 0) {
                shapes[shapesPointer] = leftArray[leftPointer];
                leftPointer++;
            } else {
                shapes[shapesPointer] = rightArray[rightPointer];
                rightPointer++;
            }
            shapesPointer++;
        }

        while(leftPointer < leftSize) {
            shapes[shapesPointer] = leftArray[leftPointer];
            leftPointer++;
            shapesPointer++;
        }

        while(rightPointer < rightSize) {
            shapes[shapesPointer] = rightArray[rightPointer];
            rightPointer++;
            shapesPointer++;
        }
    }
}
