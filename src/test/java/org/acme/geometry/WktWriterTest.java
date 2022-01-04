package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class WktWriterTest {
	
	public static  Coordinate c0 = new Coordinate(2.8,4.8);
	public static  Coordinate c1 = new Coordinate(1.3,9.8);
	
	public static  Point p0 = new Point(c0);
	public static  Point p1 = new Point(c1);
	
	@Test
	public void testWrite(){
		WktWriter writer = new WktWriter();

		Geometry g = new Point(new Coordinate(3.0,4.0));
		Assert.assertEquals("POINT(3.0 4.0)", writer.write(g));
		
		List<Point> pts = new ArrayList<Point>();
		
		pts.add(p0);
		pts.add(p1);
		
		LineString lS = new LineString(pts);
		
		Assert.assertEquals("LINESTRING(2.8 4.8,1.3 9.8)", writer.write(lS));
	}

}
