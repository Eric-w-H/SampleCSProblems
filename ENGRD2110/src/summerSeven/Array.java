package summerSeven;

import java.util.Arrays;

public class Array {
	Array(){}

	/**
	 * Returns the median of the array a.
	 * @param a An int[].
	 * @return The median of a.
	 */
	public static int median(int[] a) {
		Arrays.sort(a);

		if(a.length % 2 == 0) { //if the array is even, the median is the average of the two nearest to center elements. Otherwise, its the middle element.
			return (a[a.length / 2] + a[a.length / 2 + 1]) / 2;
		}

		return (a[a.length / 2]);
	}

	/**
	 * Returns the number of elements in an array that have the value "0".
	 * @param array An int[].
	 * @return The number of zeroes in the array.
	 */
	public static int zeroes(int[] array) {
		int count = 0;
		for(int i : array) {
			if(i == 0) count ++;
		}

		return count;
	}

	/**
	 * Returns the number of elements in an array that have the value "0".
	 * @param array An int[][].
	 * @return The number of zeroes in the array.
	 */
	public static int zeroes(int[][] array) {
		int count = 0;
		for(int[] subArray : array) {
			for(int i : subArray) {
				if(i == 0) count ++;
			}
		}

		return count;
	}

	/**
	 * Calculates the mean of the array.
	 * @param array An int[].
	 * @return The mean of the array.
	 */
	public static float mean(int[] array) {
		int mean = 0;

		for(int i : array) {
			mean += i;
		}

		return mean / array.length;
	}

	/**
	 * Returns the a / b to the nearest integer.
	 * @param a An integer
	 * @param b An integer
	 * @return a / b rounded to the nearest integer.
	 */
	public static int intDiv(int a, int b) {
		return (int) ((double)a / b + 0.5);
	}
	
	/**
	 * Checks the diagonal elements for equivalence
	 * @param array A square array
	 * @return Whether or not the diagonal elements of array are equal
	 */
	public static boolean diagonalEquivalence(int[][] array) {
		boolean result = true; //establish result
		int val = array[0][0]; //set first val to compare to.
		
		//Compare the previous result to the diagonal elements (of which there are "array.length").
		for(int index = 0; index < array.length & result; index ++) {
			result = result & (val == array[array.length - 1 - index][index]) & (val == array[index][index]);
		}
				
		return result;
	}
	
	/**
	 * Returns the balance (as defined in the green comment in Runner) of the array.
	 * @param array A two dimensional array to balance
	 * @return The balance of array
	 */
	public static int balance(int[][] array) {
		int mean = 0;
		for(int[] arr : array) {
			mean += Array.mean(arr);
		}
		mean = Array.intDiv(mean, array.length);
		
		int result = array.length * array[1].length;
		
		for(int[] arr : array) {
			for(int i : arr) {
				if(i <= mean) result --;
			}
		}
		
		return result;
	}
	
	/**
	 * Returns an integer j corresponding to the position in the array for which array[h..j-1] <= x and array[j..k] > x. 
	 * @param array The array for which a segment is array[h..k]
	 * @param h The start of the sorted array segment.
	 * @param k The end of the sorted array segment.
	 * @param x The integer to search for.
	 * @return
	 */
	public static int binSearch(int[] array, int h, int k, int x) {
		if(array[h] > x) return h;
		if(array[k] <= x) return k;
		return binSearch(array, h + 1, k - 1, x);
	}
	//end class
}
