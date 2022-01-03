package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
	public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testDefaultConstructor(){
		Point p = new Point();
		Assert.assertEquals("Point", p.getType());
	}
	
	@Test
	public void testConstructor(){
		Coordinate c = new Coordinate(0.0,0.0);
		Point p = new Point(c);
		Assert.assertEquals("Point", p.getType());
	}
	
	@Test
	public void testIsEmpty(){
		Coordinate cEmpty = new Coordinate();
		Point pEpmty = new Point(cEmpty);
		Assert.assertEquals(pEpmty.isEmpty(),true);
		
		Coordinate cFull = new Coordinate(0.0,0.0);
		Point pFull = new Point(cFull);
		Assert.assertEquals(pFull.isEmpty(),false);
	}
	
	@Test
	public void testTranslate(){
		Coordinate c = new Coordinate(0.0,0.0);
		Point p = new Point(c);
		p.translate(1, 1);
		Assert.assertEquals(p.isEmpty(),false);
	}
}
