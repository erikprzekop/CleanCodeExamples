package com.mcc.craftsmanship.videostore;

import junit.framework.TestCase;

import org.junit.Test;

public class VideoTest extends TestCase {

	@Test
	public void testStatement() {
		Movie monty = new Movie("Life of Brian", Movie.REGULAR);
		Movie terry = new Movie("Brazil", Movie.REGULAR);
		Movie disney = new Movie("Snow White", Movie.CHILDRENS);
		Movie nicole = new Movie("Moulin Rouge", Movie.NEW_RELEASE);

		Customer ken = new Customer("Ken Anderson");
		ken.addRental(new Rental(monty, 7));
		ken.addRental(new Rental(terry, 14));
		ken.addRental(new Rental(disney, 4));
		ken.addRental(new Rental(nicole, 2));

		String result = ken.statement();

		assertEquals(expectedStatement(), result);
	}

	@Test
	public void testHtmlStatement() {
		Movie monty = new Movie("Life of Brian", Movie.REGULAR);
		Movie terry = new Movie("Brazil", Movie.REGULAR);
		Movie disney = new Movie("Snow White", Movie.CHILDRENS);
		Movie nicole = new Movie("Moulin Rouge", Movie.NEW_RELEASE);

		Customer ken = new Customer("Ken Anderson");
		ken.addRental(new Rental(monty, 7));
		ken.addRental(new Rental(terry, 14));
		ken.addRental(new Rental(disney, 4));
		ken.addRental(new Rental(nicole, 2));

		String result = ken.htmlStatement();

		assertEquals(expectedHtmlStatement(), result);
	}

	String expectedStatement() {
		String s = "Rental Record for Ken Anderson\n" +
				"	Life of Brian	9.5\n" +
				"	Brazil	20.0\n" +
				"	Snow White	3.0\n" +
				"	Moulin Rouge	6.0\n" +
				"Amount owed is 38.5\n" +
				"You earned 5 frequent renter points";
		return s;
	}

	String expectedHtmlStatement() {
		String s = "<table border='1'>\n" +
				"<head>Rental Record for Ken Anderson</head>\n" +
				"<tr><td>Life of Brian</td><td>9.5</td></tr>\n" +
				"<tr><td>Brazil</td><td>20.0</td></tr>\n" +
				"<tr><td>Snow White</td><td>3.0</td></tr>\n" +
				"<tr><td>Moulin Rouge</td><td>6.0</td></tr>\n" +
				"<tr><td>Amount owed is</td><td>38.5</td></tr>\n" +
				"<tr><td colspan='2'>You earned 5 frequent renter points</td></tr>\n" +
				"</table>";
		return s;
	}

}
