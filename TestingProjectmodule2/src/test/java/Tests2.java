import fr.inria.spirals.testingprojectforbears.Main2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests2 {

	@Test
	public void test() {
		assertEquals(4, Main2.anything(3, 1));
	}

	@Test
	public void test2() {
		assertEquals(11, Main2.anything(9, 2));
	}
	
	@Test
	public void test3() {
		assertEquals(7, Main2.anything(11, 4));
	}
	
	@Test
	public void test4() {
		assertEquals(12, Main2.anything(10, 2));
	}
}