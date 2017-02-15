import static org.junit.Assert.*;

import org.junit.Test;

import fr.inria.spirals.testingprojectforbears.Main;

public class Tests {

	@Test
	public void test() {
		assertEquals("5 + 1 must be 6", 6, Main.add(5, 1));
	}

	@Test
	public void test2() {
		assertEquals("5 + 5 must be 10", 10, Main.add(5, 5));
	}
	
}