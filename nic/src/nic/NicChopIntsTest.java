/**
 * 
 */
package nic;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * @author vvaka
 *
 */
public class NicChopIntsTest {

	NicChopInts nic = new NicChopInts();

	@Test
	public void testIterativeChop() {
		int[] a = { 1, 2, 4, 5, 7 };
		assertThat("element not in the list check but falls before in the befor the first in sequence", nic.chop(0, a),
				is(-1));
		assertThat("element not int the list check but falls in the mid of the sequence", nic.chop(3, a), is(-1));
		assertThat("element not int the list check but end of the sequence", nic.chop(11, a), is(-1));
		assertThat("element at the second half of the list available test", nic.chop(7, a), is(4));
		assertThat("element at the first half of the list available test", nic.chop(2, a), is(1));

		assertThat("find element when a is null", nic.chop(2, null), is(-1));
		int[] a1 = {};
		assertThat("find element when a is empty", nic.chop(2, a1), is(-1));
	}

	@Test
	public void testRecursiveChop() {
		int[] a = { 1, 2, 4, 5, 7 };
		assertThat("element not in the list check but falls before in the befor the first in sequence",
				nic.chopRecursive(0, a), is(-1));
		assertThat("element not int the list check but falls in the mid of the sequence", nic.chopRecursive(3, a),
				is(-1));
		assertThat("element not int the list check but end of the sequence", nic.chopRecursive(11, a), is(-1));
		assertThat("element at the second half of the list available test", nic.chopRecursive(7, a), is(4));
		assertThat("element at the first half of the list available test", nic.chopRecursive(2, a), is(1));

		assertThat("find element when a is null", nic.chopRecursive(2, null), is(-1));
		int[] a1 = {};
		assertThat("find element when a is empty", nic.chopRecursive(2, a1), is(-1));

	}

}
