package org.acme.geometry;

import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;

public class EnveloppeBuilderTest {
	public static final double EPSILON = 1.0e-15;
	
	public static  Coordinate c0 = new Coordinate(2.8,4.8);
	public static  Coordinate c1 = new Coordinate(1.3,9.8);
	public static  Coordinate c2 = new Coordinate(6.3,2.5);
	public static  Coordinate c3 = new Coordinate(0.5,1.3);
	
	@Test
	public void testDefaultConstructor(){
		EnveloppeBuilder builder = new EnveloppeBuilder();
	}
	
	@Test
	public void testInsert(){
		EnveloppeBuilder builder = new EnveloppeBuilder();
		builder.insert(c0);
		builder.insert(c1);
		
		Assert.assertEquals(c0.getX(), 
				builder.getCoordinates().get(0).getX(),EPSILON);
	}
	
	@Test
	public void testBuild(){
		EnveloppeBuilder builder = new EnveloppeBuilder();
		builder.insert(c0);
		builder.insert(c1);
		builder.insert(c2);
		builder.insert(c3);
		
		Enveloppe result = builder.build();

		Assert.assertEquals(result.isEmpty(),false);
	}
	
}
