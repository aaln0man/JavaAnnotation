package test;

import static org.junit.jupiter.api.Assertions.*;

import main.Calculate;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		Calculate c = new Calculate();
		assertEquals(3, c.add(1, 2), "");
		assertEquals(-1, c.subtract(1, 2), "");
		assertEquals(2, c.multiplicate(1, 2), "");
		assertEquals(0.5, c.divide(1, 2), "");
	}

}