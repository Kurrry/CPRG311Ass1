package sorts;

import java.util.Comparator;

/**
 * Represents the heap sort algorithm.
 * @author Group 9
 */
public final class HeapSort {
	/**
	 * Sorts the shapes using heap sort. Shape comparisons are done using a comparator.
	 *
	 * @param shapes Array of shapes to sort.
	 * @param compareType Type of comparator to use.
	 * @param <T> Type of shape.
	 */
	public static <T> void doHeapSort(Comparable<T>[] shapes, Comparator<T> compareType) {
		int arrLength = shapes.length;
		
		for (int i = (arrLength / 2 - 1); i >= 0; i--) {
			buildHeapComp(shapes, compareType, arrLength, i);
		}
		
		for (int i = arrLength - 1; i > 0; i--) {
			Comparable<T> tempEle = shapes[0];
			shapes[0] = shapes[i];
			shapes[i] = tempEle;
			
			buildHeapComp(shapes, compareType, i, 0);
		}
	}

	/**
	 * Sorts the shapes using heap sort. Shape comparisons are done using .compareTo().
	 *
	 * @param shapes Array of shapes to sort.
	 * @param <T> Type of shape.
	 */
	public static <T> void doHeapSort(Comparable<T>[] shapes) {
		int arrLength = shapes.length;

		// for loop to build initial heap
		for (int i = (arrLength / 2 - 1); i >= 0; i--) {
			buildHeap(shapes, arrLength, i);
		}

		// get element from heap iteratively, "removing" the sorted max element at end of heap each time
		for (int i = arrLength - 1; i > 0; i--) {

			// move the element at index i to the start of shapes
			Comparable<T> tempEle = shapes[0];
			shapes[0] = shapes[i];
			shapes[i] = tempEle;

			// build max heap
			buildHeap(shapes, i, 0);
		}
		
	}

	/**
	 * Builds the heap from the given array of shapes. Shape comparisons are done using .compareTo().
	 *
	 * @param shapes Array of shapes.
	 * @param arrLength Length of array of shapes.
	 * @param i Index of shape in shapes[].
	 * @param <T> Type of shape.
	 */
	private static <T> void buildHeap(Comparable<T>[] shapes, int arrLength, int i) {
		int largestNum = i; // index of the largest element
		int leftEle = 2 * i + 1;
		int rightEle = 2 * i + 2;

		// if statements to find the largest element
		if (leftEle < arrLength && shapes[leftEle].compareTo((T)shapes[largestNum]) > 0) {
			largestNum = leftEle;
		}
		
		if (rightEle < arrLength && shapes[rightEle].compareTo((T)shapes[largestNum]) > 0) {
			largestNum = rightEle;
		}

		// if the largest element is not at index i, swap them.
		// recursive call to buildHeap after swap until largest element is at index i
		if (largestNum != i) {
			Comparable<T> swapEle = shapes[i];
			shapes[i] = shapes[largestNum];
			shapes[largestNum] = swapEle;
			buildHeap(shapes, arrLength, largestNum);
		}
		
		
		
	}

	/**
	 * Builds the heap from the given array of shapes. Shape comparisons are done using a comparator.
	 *
	 * @param shapes Array of shapes.
	 * @param compareType Type of comparator.
	 * @param arrLength Length of array of shapes.
	 * @param i Index of shape in shapes[].
	 * @param <T> Type of shape.
	 */
	private static <T> void buildHeapComp(Comparable<T>[] shapes, Comparator<T> compareType, int arrLength, int i) {
		int largestNum = i;
		int leftEle = 2 * i + 1;
		int rightEle = 2 * i + 2;
		
		if (leftEle < arrLength && compareType.compare((T)shapes[leftEle], (T)shapes[largestNum]) > 0) {
			largestNum = leftEle;
		}
		
		if (rightEle < arrLength && compareType.compare((T)shapes[rightEle], (T)shapes[largestNum]) > 0) {
			largestNum = rightEle;
		}
		
		if (largestNum != i) {
			Comparable<T> swapEle = shapes[i];
			shapes[i] = shapes[largestNum];
			shapes[largestNum] = swapEle;
			buildHeapComp(shapes, compareType, arrLength, largestNum);
		}
		
		
	}
}
