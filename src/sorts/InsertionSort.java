package sorts;

import java.util.Comparator;

public final class InsertionSort {

    //public static <T> void doInsertionSort(Comparable<?>[] shapes, Comparator<?> compareType) {

    //}


    public static <T> void doInsertionSort(Comparable<T>[] shapes) {
        for(int i = 1; i <= shapes.length - 1; i++) {
            Comparable<T> current = shapes[i];
            int j = i;

            while (j > 0 && shapes[j-1].compareTo((T) current) > 0) {
                shapes[j] = shapes[j-1];
                j -= 1;
            }
            shapes[j] = current;
        }
    }
}
