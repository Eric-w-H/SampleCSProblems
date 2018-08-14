package summerSeven;

public class Runner {

	/* Sorry these are super long lines....
    Write a function that returns true if its string parameter is a palindrome (and false otherwise). A palindrome is a string that reads the same backwards or forwards, e.g. "Madam, I'm Adam." Actually, this string would fail the test because it contains white space and punctuation. With parameter "madamimadam", the function would return true.

    Write a function that returns its string parameter but with punctuation and spaces removed and letters turned into lower case. Now if you call your function from problem 1 with the output of this new function, "Madam, I'm Adam." would pass the test.

    Ideally, use some existing string function in the language you are familiar with to test for white space and punctuation and to map upper case to lower. No need to reinvent the wheel.
    In CS 2110 we prefer to use the provided language features, including prebuilt library methods, to full effect. The best programmers are the ones who are most effective in using the tools available to them: they write less code, and their code is more expressive and more exact, so they make fewer mistakes.

    Compute the median of a one-dimensional array x containing integers, or count the number of zeros in x (each of these actions would be a separate method, returning an integer value). Compute the mean as a floating point number.

    Given integers b and c, compute b/c as an integer (rounded to the nearest integer).  That is, round down if the remainder is less than 1/2, and up if the remainder is 1/2 or more.  The value returned by the method should be an integer, not a floating point number.

    Count the number of zeroes in a rectangular matrix y. For a square array square, determine whether all the diagonal elements have the same value.

    Define the "balance" of a rectangular matrix y to be the number of elements larger than the mean value (rounded to an integer using the method of question 4) minus the number of elements smaller than the mean. Given an integer matrix, compute its mean and balance.

    (Binary search). Given a sorted integer array segment b[h..k] and an integer x, find the position j such that b[h..j-1] <= x and b[j..k] > x. (by b[h..j-1] <= x, we mean that all values of b[h..j-1] are <= x). Your program should run in time proportional to the logarithm of k+1-h. (Did you have binary search in your previous course? If so, this should be easy.)

	 * Additionally, I added recursive and loop versions of calculating a factorial and generating a fibbonacci sequence below the main method here.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Madam, I'm Adam.");
		System.out.println(Text.palindrome("Madam, I'm Adam."));
		System.out.println(Text.removeBlankAndPunctuation("Madam, I'm Adam."));
		System.out.println(Text.palindrome(Text.removeBlankAndPunctuation("Madam, I'm Adam.")));

		System.out.println("-----------------");

		int[][] array = {
				{0, 1, 0},
				{4, 0, -4},
				{0, -1, 0}
		};

		int[] singleArray = {
				1,3,5,6,4,3,2,1,2,3,4,5,4,3,3,2,1,2,1,1,23456543,2121,232,9,0
		};

		System.out.println(Array.diagonalEquivalence(array));
		System.out.println(Array.intDiv(7, 14));
		System.out.println(Array.mean(singleArray));
		System.out.println(Array.zeroes(array));
		System.out.println(Array.zeroes(singleArray));
		System.out.println(Array.median(singleArray));
		System.out.println(Array.balance(array));

		System.out.println("-----------------");

		int[] array2 = {
				-4,-3,-1,0,3,4,5,6,7,8,9,10,11,23,45,345,346,400,401,454,545,555,666	
		};

		System.out.println(Array.binSearch(array2, 3, 10, 6));


		System.out.println("-----------------");
		System.out.println(fact(5));
		System.out.println(factLoop(5));

		fib(0,1,25);
		System.out.println();
		fibLoop(0,1,25);
	}

	/**
	 * Returns the factorial of i (recursively)
	 * @param i
	 * @return i!
	 */
	public static long fact(int i) {
		if(i > 1) return i * fact(i - 1);
		return 1;
	}

	/**
	 * Returns the factorial of i (via loop)
	 * @param i
	 * @return i!
	 */
	public static long factLoop(int i) {
		long result = i;
		while(i > 1) {
			i --;
			result *= i;
		}
		return result;
	}

	/**
	 * Prints the fibbonacci sequence starting with i and j to k elements (recursively).
	 * @param i The 0th element of the sequence
	 * @param j The first element of the sequene
	 * @param k The number of elements to print.
	 */
	public static void fib(int i, int j, int k) {
		System.out.print(j + " ");
		if(k == 1) return;
		fib(j, i + j, k - 1);
	}

	/**
	 * Prints the fibbonacci sequence starting with i and j to k elements (via loop).
	 * @param i The 0th element of the sequence
	 * @param j The first element of the sequene
	 * @param k The number of elements to print.
	 */	
	public static void fibLoop(int i, int j, int k) {
		while(k > 0) {
			System.out.print(j + " ");

			int temp = i;
			i = j;
			j = temp + j;

			k--;
		}
	}
	//end class
}
