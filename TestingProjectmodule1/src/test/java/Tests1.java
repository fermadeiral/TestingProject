import fr.inria.spirals.testingprojectforbears.Main1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests1 {

	@Test
	public void test() {
		assertEquals(4, Main1.anything(3, 1));
	}

	@Test
	public void test2() {
		assertEquals(11, Main1.anything(9, 2));
	}
	
	@Test
	public void test3() {
		assertEquals(7, Main1.anything(11, 4));
	}
	
	@Test
	public void test4() {
		assertEquals(12, Main1.anything(10, 2));
	}

	@Test
	public void test5() {
		assertEquals(12, Main1.anything(10, 2));
	}
}