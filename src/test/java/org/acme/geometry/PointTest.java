package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

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
	public void testGetCoordinate(){	
		Coordinate c = new Coordinate(1.0,0.0);
		Point p = new Point(c);
		Assert.assertEquals(p.getCoordinate().getX(),1.0,EPSILON);
		Assert.assertEquals(p.getCoordinate().getY(),0.0,EPSILON);
	}
	
	@Test
	public void testIsEmpty(){
		Coordinate cEmpty = new Coordinate();
		Point pEpmty = new Point(cEmpty);
		Assert.assertEquals(pEpmty.getCoordinate().getX(),Double.NaN,EPSILON);
		
		Coordinate cFull = new Coordinate(0.0,0.0);
		Point pFull = new Point(cFull);
		Assert.assertEquals(pFull.getCoordinate().getX(),0.0,EPSILON);
	}
	
	@Test
	public void testTranslate(){
		Coordinate c = new Coordinate(0.0,0.0);
		Point p = new Point(c);
		p.translate(1, 1);
		Assert.assertEquals(p.getCoordinate().getX(),1.0,EPSILON);
	}
	
	@Test
	public void testClone(){
		Coordinate c = new Coordinate(0.0,0.0);
		Point p = new Point(c);
		Geometry copy = p.clone();
		
		p.translate(1, 1);
		copy.translate(1, 1);
		Assert.assertEquals(p,copy);
	}
	
	@Test
	public void testGetEnveloppe(){
		Coordinate c = new Coordinate(0.0,0.0);
		Point p = new Point(c);
		Enveloppe result = p.getEnveloppe();
		Assert.assertEquals(p.getCoordinate().getX(),result.getXMin(),EPSILON);
	}
}
