package sorts;

import java.util.Comparator;

/**
 * Controls the type of sort used to sort the array of shapes. Controls whether shapes are compared using
 * a comparator or .compareTo().
 * @author Group 9
 */
public final class SortController {
    /**
     * Chooses the type of sort to use. Comparisons are done using .compareTo().
     *
     * @param shapes Array of shapes to be sorted.
     * @param sortType Char representing type of sort to use.
     * @param <T> Type of shape.
     */
    public static <T> void sort (Comparable<T>[] shapes, char sortType) {
        switch (sortType) {
            case 'b': BubbleSort.doBubbleSort(shapes); break;
            case 's': SelectionSort.doSelectionSort(shapes); break;
            case 'i': InsertionSort.doInsertionSort(shapes); break;
            case 'm': MergeSort.doMergeSort(shapes); break;
            case 'q': QuickSort.doQuickSortNoCT(shapes); break;
            case 'z': HeapSort.doHeapSort(shapes); break;
        }
    }

    /**
     * Chooses the type of sort to use. Comparisons are done using a comparator.
     *
     * @param shapes Array of shapes to be sorted.
     * @param sortType Char representing type of sort to use.
     * @param compareType Type of comparator.
     * @param <T> Type of shape.
     */
    public static <T> void sort (Comparable<T>[] shapes, char sortType, Comparator<T> compareType) {
        switch (sortType) {
            case 'b': BubbleSort.doBubbleSort(shapes, compareType); break;
            case 's': SelectionSort.doSelectionSort(shapes, compareType); break;
            case 'i': InsertionSort.doInsertionSort(shapes, compareType); break;
            case 'm': MergeSort.doMergeSort(shapes, compareType); break;
            case 'q': QuickSort.doQuickSortCT(shapes, compareType); break;
            case 'z': HeapSort.doHeapSort(shapes, compareType); break;
        }
    }
}
