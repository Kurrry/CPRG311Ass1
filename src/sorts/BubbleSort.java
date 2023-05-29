package sorts;

import java.util.Comparator;

public final class BubbleSort {
    public static <T> void doBubbleSort(Comparable<T>[] shapes, Comparator<T> compareType) {
        for(int i = 0; i <= shapes.length - 1; i++) {

            for(int j = 1; j <= shapes.length - i - 1; j++) {
                if(compareType.compare((T) shapes[j-1], (T) shapes[j]) > 0) {
                    Comparable<T> temp = shapes[j-1];
                    shapes[j-1] = shapes[j];
                    shapes[j] = temp;
                }
            }
        }
    }

    public static <T> void doBubbleSort(Comparable<T>[] shapes) {
        for(int i = 0; i <= shapes.length - 1; i++) {

            for(int j = 1; j <= shapes.length - i - 1; j++) {
                if(shapes[j-1].compareTo((T) shapes[j]) > 0) {
                    Comparable<T> temp = shapes[j-1];
                    shapes[j-1] = shapes[j];
                    shapes[j] = temp;
                }
            }
        }
    }
}
