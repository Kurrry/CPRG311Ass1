package sorts;

import java.util.Comparator;

public final class SortController {
    public static <T> void sort (Comparable<T>[] shapes, char sortType) {
        switch (sortType) {
            case 'b': BubbleSort.doBubbleSort(shapes); break;
            case 's': SelectionSort.doSelectionSort(shapes); break;
            case 'i': InsertionSort.doInsertionSort(shapes); break;
            case 'm': MergeSort.doMergeSort(shapes); break;
            case 'q': QuickSort.doQuickSortNoCT(shapes); break;
            case 'z': //HeapSort.doHeapSort(shapes); break;
        }
    }

    public static <T> void sort (Comparable<T>[] shapes, char sortType, Comparator<T> compareType) {
        switch (sortType) {
            case 'b': BubbleSort.doBubbleSort(shapes, compareType); break;
            case 's': SelectionSort.doSelectionSort(shapes, compareType); break;
            case 'i': InsertionSort.doInsertionSort(shapes, compareType); break;
            case 'm': MergeSort.doMergeSort(shapes, compareType); break;
            case 'q': QuickSort.doQuickSortCT(shapes, compareType); break;
            case 'z': //HeapSort.doHeapSort(shapes, compareType); break;
        }
    }
}
