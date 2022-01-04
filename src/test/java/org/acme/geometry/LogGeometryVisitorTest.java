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
		//System.out.println("result : " + result);
		geometry.accept(visitor);
		
		//Assert.assertEquals("Je suis un point avec x=3.0 et y=4.0", result);
	}
	

	

}
