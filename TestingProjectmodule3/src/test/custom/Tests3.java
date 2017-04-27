import fr.inria.spirals.testingprojectforbears.Main3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests3 {

	@Test
	public void test() {
		assertEquals(4, Main3.anything(3, 1));
	}

	@Test
	public void test2() {
		assertEquals(11, Main3.anything(9, 2));
	}
	
	@Test
	public void test3() {
		assertEquals(7, Main3.anything(11, 4));
	}
	
	@Test
	public void test4() {
		assertEquals(12, Main3.anything(10, 2));
	}
}