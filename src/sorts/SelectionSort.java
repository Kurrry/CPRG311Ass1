package sorts;

import java.util.Comparator;

public final class SelectionSort {
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
