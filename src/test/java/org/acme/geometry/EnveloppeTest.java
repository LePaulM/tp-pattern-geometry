package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class EnveloppeTest {
	public static final double EPSILON = 1.0e-15;
	
	
	public static  Coordinate c0 = new Coordinate(2.8,4.8);
	public static  Coordinate c1 = new Coordinate(1.3,9.8);
	public static  Coordinate c2 = new Coordinate(6.3,2.5);
	public static  Coordinate c3 = new Coordinate(0.5,1.4);
	
	@Test
	public void testDefaultConstructor(){
		Enveloppe result = new Enveloppe();
		
		Assert.assertEquals(result.isEmpty(),true);
	}
	
	
	@Test
	public void testIsEmpty(){
		Enveloppe empty = new Enveloppe();
		
		Assert.assertEquals(empty.isEmpty(),true);
		
		EnveloppeBuilder builder = new EnveloppeBuilder();
		builder.insert(c0);
		builder.insert(c1);
		builder.insert(c2);
		builder.insert(c3);
		
		Enveloppe result = builder.build();

		Assert.assertEquals(result.isEmpty(),false);
	}
	
	@Test
	public void testGetters(){
		Enveloppe empty = new Enveloppe();
		
		Assert.assertEquals(empty.isEmpty(),true);
		
		EnveloppeBuilder builder = new EnveloppeBuilder();
		builder.insert(c0);
		builder.insert(c1);
		builder.insert(c2);
		builder.insert(c3);
		
		Enveloppe result = builder.build();
	
		
		Assert.assertEquals(result.getXMin(),0.5,EPSILON);
		Assert.assertEquals(result.getXMax(),6.3,EPSILON);
		Assert.assertEquals(result.getYMin(),1.4,EPSILON);
		Assert.assertEquals(result.getYMax(),9.8,EPSILON);
	}
}
