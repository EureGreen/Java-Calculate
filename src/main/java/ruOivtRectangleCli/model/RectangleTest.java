package ruOivtRectangleCli.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	void testGetters() {
		Rectangle r = new Rectangle(3, 4);
		assertEquals(3.0, r.getA(), 1e-9);
		assertEquals(4.0, r.getB(), 1e-9);
	}

	@Test
	void testArea() {
		assertEquals(12.0, new Rectangle(3, 4).area(), 1e-9);
	}

	@Test
	void testPerimeter() {
		assertEquals(14.0, new Rectangle(3, 4).perimeter(), 1e-9);
	}

	@Test
	void testDiagonal() {
		assertEquals(5.0, new Rectangle(3, 4).diagonal(), 1e-9);
	}

	@Test
	void testInscribedCircleRadius() {
		assertEquals(1.5, new Rectangle(3, 4).inscribedCircleRadius(), 1e-9);
	}

	@Test
	void testRadiusUsesShorterSide() {
		assertEquals(1.5, new Rectangle(10, 3).inscribedCircleRadius(), 1e-9);
	}

	@Test
	void testSquareArea() {
		assertEquals(25.0, new Rectangle(5, 5).area(), 1e-9);
	}

	@Test
	void testSquarePerimeter() {
		assertEquals(20.0, new Rectangle(5, 5).perimeter(), 1e-9);
	}

	@Test
	void testSquareDiagonal() {
		assertEquals(7.0710678118654755, new Rectangle(5, 5).diagonal(), 1e-9);
	}

	@Test
	void testSquareRadius() {
		assertEquals(2.5, new Rectangle(5, 5).inscribedCircleRadius(), 1e-9);
	}

	@Test
	void testFractionalSides() {
		Rectangle r = new Rectangle(2.5, 4);
		assertEquals(10.0, r.area(), 1e-9);
		assertEquals(13.0, r.perimeter(), 1e-9);
	}

	@Test
	void testSmallSides() {
		Rectangle r = new Rectangle(0.5, 0.25);
		assertEquals(0.125, r.area(), 1e-9);
		assertEquals(1.5, r.perimeter(), 1e-9);
		assertEquals(0.125, r.inscribedCircleRadius(), 1e-9);
	}

	@Test
	void testZeroFirstSide() {
		assertThrows(IllegalArgumentException.class, () -> new Rectangle(0, 5));
	}

	@Test
	void testZeroSecondSide() {
		assertThrows(IllegalArgumentException.class, () -> new Rectangle(5, 0));
	}

	@Test
	void testNegativeFirstSide() {
		assertThrows(IllegalArgumentException.class, () -> new Rectangle(-1, 5));
	}

	@Test
	void testNegativeSecondSide() {
		assertThrows(IllegalArgumentException.class, () -> new Rectangle(5, -1));
	}

	@Test
	void testBothSidesNegative() {
		assertThrows(IllegalArgumentException.class, () -> new Rectangle(-2, -3));
	}

	@Test
	void testExceptionMessage() {
		IllegalArgumentException ex = assertThrows(
				IllegalArgumentException.class, () -> new Rectangle(0, 5));
		assertEquals("Стороны должны быть > 0", ex.getMessage());
	}

}