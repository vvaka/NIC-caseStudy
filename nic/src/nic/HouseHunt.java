package nic;

/*
 * In a given street of houses with consecutive numbers between 50 and 500, find the house number, 
 * for which, the sum of numbers on the left is equal to the sum of numbers on the right.
 Implement this routine in the language of your choice with two different techniques.
 */
public class HouseHunt {

	public static void main(String... args) {
		int n = 500;

		for (int i = 50; i <= n; i++) {
			for (int j = i + 1; j <= n; j++) {

				if (sum(i, j) == sum(j, n)) {
					System.out.println(i);
				}

			}
		}
	}

	private static int sum(int first, int num) {
		int sum = 0;

		if (first == num)
			return 0;

		for (int i = first + 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}

	
	
	public Integer findHouse(Integer[] houses) {
		int size = houses.length;
		// Using 2 auxiliary arrays to store the cumilativeSum forward & backward respectively
		Integer[] forwardCumulativeSums = new Integer[size];
		Integer[] backwardCumulativeSums = new Integer[size];
		// Initialize the arrays with first and last elements respectively
		forwardCumulativeSums[0] = houses[0];
		backwardCumulativeSums[size - 1] = houses[size - 1];
		// start the loop with 2nd element from First and Last
		for (int i = 1, j = size - 2; i <= size - 1 && j >= 0; i++, j--) {
			forwardCumulativeSums[i] = forwardCumulativeSums[i - 1] + houses[i];
			backwardCumulativeSums[j] = backwardCumulativeSums[j + 1] + houses[j];
		}
		// Find the element by running the loop starting form 2 nd index to n-1 th index 
		for (int i = 1; i <= size - 2; i++) {
			// compare left Sum and right Sum of from forward and backward
			// cumulative sum Arrays if equal return the element at index
			/*[51, 126, 206, 412, 512, 618]
			  [618, 567, 492, 412, 206, 106]
			*/		
			if (forwardCumulativeSums[i-1].equals(backwardCumulativeSums[i+1])) {
				return houses[i];
			}
		}
		// not found
		return -1;
	}
}