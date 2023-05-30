package sorts;

import java.util.Comparator;

public final class SortController {
    public static <T> void sort (Comparable<T>[] shapes, char sortType) {
        switch (sortType) {
            case 'b' -> BubbleSort.doBubbleSort(shapes);
            case 's' -> SelectionSort.doSelectionSort(shapes);
            case 'i' -> InsertionSort.doInsertionSort(shapes);
            case 'm' -> MergeSort.doMergeSort(shapes);
            //case 'q' -> new QuickSort(shapes);
            //case 'z' -> new RadixSort(shapes);
        }
    }

    public static <T> void sort (Comparable<T>[] shapes, char sortType, Comparator<T> compareType) {
        switch (sortType) {
            case 'b' -> BubbleSort.doBubbleSort(shapes, compareType);
            case 's' -> SelectionSort.doSelectionSort(shapes, compareType);
            case 'i' -> InsertionSort.doInsertionSort(shapes, compareType);
            case 'm' -> MergeSort.doMergeSort(shapes, compareType);
            //case 'q' -> new QuickSort(shapes, compareType);
            //case 'z' -> new RadixSort(shapes, compareType);
        }
    }
}
