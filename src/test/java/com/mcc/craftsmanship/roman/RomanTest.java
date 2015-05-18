package com.mcc.craftsmanship.roman;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanTest {

	@Test
	public void testFoo() {
		Roman roman = new Roman();
		assertEquals("I", roman.convert(1));
		assertEquals("II", roman.convert(2));
		assertEquals("III", roman.convert(3));
		assertEquals("IV", roman.convert(4));
		assertEquals("V", roman.convert(5));
		assertEquals("VI", roman.convert(6));
		assertEquals("VII", roman.convert(7));
		assertEquals("VIII", roman.convert(8));
		assertEquals("IX", roman.convert(9));
		assertEquals("X", roman.convert(10));
		assertEquals("XCIX", roman.convert(99));
		assertEquals("L", roman.convert(50));
		assertEquals("D", roman.convert(500));
		assertEquals("M", roman.convert(1000));
	}

}
