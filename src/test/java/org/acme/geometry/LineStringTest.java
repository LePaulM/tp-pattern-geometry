package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LineStringTest {
	
	public static final double EPSILON = 1.0e-15;
	
	public static  Coordinate c0 = new Coordinate(2.8,4.8);
	public static  Coordinate c1 = new Coordinate(1.3,9.8);
	public static  Coordinate c2 = new Coordinate(6.3,2.5);
	public static  Coordinate c3 = new Coordinate(0.5,1.3);
	
	public static  Point p0 = new Point(c0);
	public static  Point p1 = new Point(c1);
	public static  Point p2 = new Point(c2);
	public static  Point p3 = new Point(c3);
	
	@Test
	public void testDefaultConstructor(){
		LineString lS = new LineString();
		
		Assert.assertEquals("LineString", lS.getType());
	}
	
	@Test
	public void testConstructor(){
		
		List<Point> pts = new ArrayList<Point>();
			
		pts.add(p0);
		pts.add(p1);
		pts.add(p2);
		pts.add(p3);
		
		LineString lS = new LineString(pts);
		
		Assert.assertEquals("LineString", lS.getType());
	}
	
	@Test
	public void testGetNumPoints(){
		List<Point> pts = new ArrayList<Point>();
		
		pts.add(p0);
		pts.add(p1);
		pts.add(p2);
		pts.add(p3);
		
		LineString lS = new LineString(pts);
		
		Assert.assertEquals(pts.size(),lS.getNumPoints(),EPSILON);
	}
	
	@Test
	public void testGetPointN(){
		List<Point> pts = new ArrayList<Point>();
		
		pts.add(p0);
		pts.add(p1);
		pts.add(p2);
		pts.add(p3);
		
		LineString lS = new LineString(pts);
		
		Assert.assertEquals(p2,lS.getPointN(2));
	}
	
	@Test
	public void testIsEmpty(){

		Coordinate cEmpty = new Coordinate();
		Point pEpmty = new Point(cEmpty);
		List<Point> ptsEmpty = new ArrayList<Point>();
		ptsEmpty.add(pEpmty);
		LineString emptyLS = new LineString(ptsEmpty);
		
		Assert.assertEquals(true,emptyLS.isEmpty());
		
		List<Point> pts = new ArrayList<Point>();
		
		pts.add(p0);
		pts.add(p1);
		pts.add(p2);
		pts.add(p3);
		
		LineString fullLS = new LineString(pts);
		
		Assert.assertEquals(false,fullLS.isEmpty());
	}
	
	@Test
	public void testTranslate(){
		List<Point> pts = new ArrayList<Point>();
		
		pts.add(p0);
		pts.add(p1);
		pts.add(p2);
		pts.add(p3);
		
		LineString lS = new LineString(pts);
		lS.translate(1, 1);
		
		Assert.assertEquals(lS.isEmpty(),false);
	}
	
	@Test
	public void testClone(){
		List<Point> pts = new ArrayList<Point>();
		
		pts.add(p0);
		pts.add(p1);
		pts.add(p2);
		pts.add(p3);
		
		LineString lS = new LineString(pts);
		
		Geometry copy = lS.clone();
		
		lS.translate(1, 1);
		copy.translate(1, 1);
		Assert.assertEquals(lS,copy);
	}
	
	@Test
	public void testGetEnveloppe(){
		List<Point> pts = new ArrayList<Point>();
		
		pts.add(p0);
		pts.add(p1);
		pts.add(p2);
		pts.add(p3);
		
		LineString lS = new LineString(pts);
		
		double xMin = 1000;
		for (int i = 0; i<4;i++) {
			if (lS.getPointN(i).getCoordinate().getX() < xMin) {
				xMin = lS.getPointN(i).getCoordinate().getX();
			}
		}
		
		
		Enveloppe result = lS.getEnveloppe();
		Assert.assertEquals(xMin,result.getXMin(),EPSILON);
	}
}
