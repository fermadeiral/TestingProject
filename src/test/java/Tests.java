import static org.junit.Assert.*;

import org.junit.Test;

import fr.inria.spirals.testingprojectforbears.Main;

public class Tests {

	@Test
	public void test() {
		Main main = new Main();

        assertEquals("5 + 1 must be 6", 6, main.add(5, 1));
        assertEquals("5 + 5 must be 10", 10, main.add(5, 5));
	}

}