package nic;

/**
 * @author vvaka
 *
 */
class NicChopInts {

	/**
	 * @param value to find in the array
	 * @param sorted int array 
	 * @return index of the value in the array if found otherwise -1
	 */
	int chop(int val, int[] a) {
		if (a == null)
			return -1;
		int left = 0;
		int right = a.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (a[mid] < val)
				left = mid + 1;
			else if (a[mid] > val)
				right = mid - 1;
			else
				return mid;
		}
		// not found
		return -1;
	}

	/**
	 * @param value to find in the array
	 * @param sorted int array 
	 * @return index of the value in the array if found otherwise -1 
	 */
	int chopRecursive(int val, int[] a) {
		if (a == null)
			return -1;
		return find(val, a, 0, a.length - 1);
	}

	private int find(int value, int[] a, int left, int right) {
		if (right < left)
			return -1;
		int mid = (left + right) / 2;
		if (a[mid] < value)
			return find(value, a, mid + 1, right);
		else if (a[mid] > value)
			return find(value, a, left, mid - 1);
		else
			return mid;

	}

}