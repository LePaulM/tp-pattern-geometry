package org.acme.geometry;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LogGeometryVisitorTest {

	
	@Test
	public void testVisitPoint() throws UnsupportedEncodingException{
		Geometry geometry = new Point(new Coordinate(3.0,4.0));
		
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		PrintStream out = new PrintStream(os);
		LogGeometryVisitor visitor = new LogGeometryVisitor(out);
		geometry.accept(visitor);

		String result = os.toString("UTF8");
		System.out.println("result : " + result);
		geometry.accept(visitor);
		
		Assert.assertEquals("Je suis un point avec x=3.0 et y=4.0", result);
	}
	
	public void testVisitLineString() throws UnsupportedEncodingException{
		Coordinate c0 = new Coordinate(2.8,4.8);
		Coordinate c1 = new Coordinate(1.3,9.8);	
		Coordinate c2 = new Coordinate(6.3,2.5);
		Coordinate c3 = new Coordinate(0.5,1.3);
		Point p0 = new Point(c0);
		Point p1 = new Point(c1);
		Point p2 = new Point(c2);
		Point p3 = new Point(c3);
		List<Point> pts = new ArrayList<Point>();
		pts.add(p0);
		pts.add(p1);
		pts.add(p2);
		pts.add(p3);
		LineString lS = new LineString(pts);
		
		System.out.println("lS.getNumPoints : " + lS.getNumPoints());
		/*
		 * ByteArrayOutputStream os = new ByteArrayOutputStream(); 
		 * PrintStream out = newPrintStream(os); 
		 * LogGeometryVisitor visitor = new LogGeometryVisitor(out);
		 * geometry.accept(visitor);
		 * 
		 * String result = os.toString("UTF8");
		 
		
		Assert.assertEquals("Je suis une polyligne définie par 2 point(s)", result);
		*/
	}
	

}
