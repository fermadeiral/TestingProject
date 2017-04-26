import org.junit.Test;

import fr.inria.spirals.testingprojectforbears.Main;

import static org.junit.Assert.assertEquals;

public class Tests {

	@Test
	public void test() {
		assertEquals(4, Main.anything(3, 1));
	}

	@Test
	public void test2() {
		assertEquals(11, Main.anything(9, 2));
	}
	
	@Test
	public void test3() {
		assertEquals(7, Main.anything(11, 4));
	}
	
	@Test
	public void test4() {
		assertEquals(12, Main.anything(10, 2));
	}
}