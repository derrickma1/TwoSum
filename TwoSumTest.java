import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class TwoSumTest {

	@Test
	public void test1() {
		int[] result = new int[] {1, 2};
		int[] output = TwoSum.twoSum(new int[] { 1, 3, 5, 7 }, 8);
		Arrays.sort(output);
		assertArrayEquals(result, output);
	}
	@Test
	public void test2() {
		int[] result = new int[] {2, 3};
		int[] output = TwoSum.twoSum(new int[] { 2, 4, 6, 8 }, 14);
		Arrays.sort(output);
		assertArrayEquals(result, output);
	}
	
	@Test
	public void test3() {
		int[] result = new int[] {0, 2};
		int[] output = TwoSum.twoSum(new int[] { 10, 17, 101, 33 }, 111);
		Arrays.sort(output);
		assertArrayEquals(result, output);
	}
	
	@Test
	public void test4() {
		int[] result = new int[] {2, 5};
		int[] output = TwoSum.twoSum(new int[] { 9, 8, 7, 6, 5, 3, 2, 1 }, 10);
		Arrays.sort(output);
		assertArrayEquals(result, output);
	}
	
	@Test
	public void test5() {
		int[] result = new int[] {3, 4};
		int[] output = TwoSum.twoSum(new int[] { 1, 100, 101, 20, 50 }, 70);
		Arrays.sort(output);
		assertArrayEquals(result, output);
	}

}
