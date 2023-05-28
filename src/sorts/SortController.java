package sorts;

import java.util.Comparator;

public final class SortController {
    public static <T> void sort (Comparable<T>[] shapes, char sortType) {
        switch (sortType) {
            //case 'b' -> new BubbleSort(shapes);
            //case 's' -> new SelectionSort(shapes);
            case 'i' -> InsertionSort.doInsertionSort(shapes);
            //case 'm' -> new MergeSort(shapes);
            //case 'q' -> new QuickSort(shapes);
            //case 'z' -> new RadixSort(shapes);
        }
    }

    public static <T> void sort (Comparable<T>[] shapes, char sortType, Comparator<T> compareType) {
        switch (sortType) {
            //case 'b' -> new BubbleSort(shapes, compareType);
            //case 's' -> new SelectionSort(shapes, compareType);
            case 'i' -> InsertionSort.doInsertionSort(shapes, compareType);
            //case 'm' -> new MergeSort(shapes, compareType);
            //case 'q' -> new QuickSort(shapes, compareType);
            //case 'z' -> new RadixSort(shapes, compareType);
        }
    }
}
