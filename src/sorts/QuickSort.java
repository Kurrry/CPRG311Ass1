package sorts;

import java.util.Comparator;

public final class QuickSort {
    public static <T> void doQuickSortCT(Comparable<T>[] shapes, Comparator<T> compareType) {
        int highIndex = shapes.length - 1;
        int lowIndex = 0;

        sortCT(shapes, compareType, lowIndex, highIndex);
    }

    private static <T> void sortCT(Comparable<T>[] shapes, Comparator<T> compareType, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int partitionIndex = partitionCT(shapes, compareType, lowIndex, highIndex);

            sortCT(shapes, compareType, lowIndex, partitionIndex - 1);
            sortCT(shapes, compareType, partitionIndex + 1, highIndex);
        }
    }

    private static <T> int partitionCT(Comparable<T>[] shapes, Comparator<T> compareType, int lowIndex, int highIndex) {
        int lowPointer = (lowIndex - 1);

        for(int movingPointer = lowIndex; movingPointer <= highIndex - 1; movingPointer++) {
            if(compareType.compare((T) shapes[movingPointer], (T) shapes[highIndex]) > 0) {
                lowPointer++;
                Comparable<T> temp = shapes[lowPointer];
                shapes[lowPointer] = shapes[movingPointer];
                shapes[movingPointer] = temp;
            }
        }
        Comparable <T> temp = shapes[highIndex];
        shapes[highIndex] = shapes[lowPointer+1];
        shapes[lowPointer+1] = temp;
        return lowPointer + 1;
    }

    public static <T> void doQuickSortNoCT(Comparable<T>[] shapes) {
        int highIndex = shapes.length - 1;
        int lowIndex = 0;

        sortNoCT(shapes, lowIndex, highIndex);
    }

    private static <T> void sortNoCT(Comparable<T>[] shapes, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int partitionIndex = partitionNoCT(shapes, lowIndex, highIndex);

            sortNoCT(shapes, lowIndex, partitionIndex - 1);
            sortNoCT(shapes, partitionIndex + 1, highIndex);
        }
    }

    private static <T> int partitionNoCT(Comparable<T>[] shapes, int lowIndex, int highIndex) {
        int lowPointer = (lowIndex - 1);

        for(int movingPointer = lowIndex; movingPointer <= highIndex - 1; movingPointer++) {
            if(shapes[movingPointer].compareTo ((T) shapes[highIndex]) > 0) {
                lowPointer++;
                Comparable<T> temp = shapes[lowPointer];
                shapes[lowPointer] = shapes[movingPointer];
                shapes[movingPointer] = temp;
            }
        }
        Comparable <T> temp = shapes[highIndex];
        shapes[highIndex] = shapes[lowPointer+1];
        shapes[lowPointer+1] = temp;
        return lowPointer + 1;
    }
}
