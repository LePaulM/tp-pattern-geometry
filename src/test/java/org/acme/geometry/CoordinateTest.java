package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class CoordinateTest {

	public static final double EPSILON = 1.0e-15;

	@Test
	public void testDefaultConstructor(){
		Coordinate c = new Coordinate();
		Assert.assertEquals(Double.NaN, c.getX(), EPSILON);
		Assert.assertEquals(Double.NaN, c.getY(), EPSILON);
	}
	
	@Test
	public void testConstructor(){
		Coordinate c = new Coordinate(0.0,0.0);
		Assert.assertEquals(0.0, c.getX(), EPSILON);
		Assert.assertEquals(0.0, c.getY(), EPSILON);
	}
	
	@Test
	public void testIsEmpty(){
		Coordinate cEmpty = new Coordinate();
		Assert.assertEquals(cEmpty.isEmpty(),true);
		Coordinate cFull = new Coordinate(0.0,0.0);
		Assert.assertEquals(cFull.isEmpty(),false);
	}

}
