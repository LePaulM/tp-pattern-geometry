package org.acme.geometry;

public class EnveloppeBuilder {
	
	
	
	public void insert (Coordinate coordinate) {
		
	}
	
	public Enveloppe build() {
		double xMin = 0;
		double yMin = 0;
		double xMax = 1;
		double yMax = 1;
		
		Coordinate topRight = new Coordinate(xMax,yMax);
		Coordinate bottomLeft = new Coordinate(xMin,yMin);
		
		Enveloppe enveloppe = new Enveloppe(topRight, bottomLeft);
		return enveloppe;
	}
}
