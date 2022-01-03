package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public class EnveloppeBuilder {
	private List<Coordinate> coordinates = new ArrayList<>();
	private List<Double> xVals = new ArrayList<Double>();
	private List<Double> yVals = new ArrayList<Double>();
	
	public EnveloppeBuilder() {
		super();
	}

	public void insert (Coordinate coordinate) {
		this.coordinates.add(coordinate);
		this.xVals.add(coordinate.getX());
		this.yVals.add(coordinate.getY());
	}
	

	public Enveloppe build() {
		double xMin = Double.NaN;
		double yMin = Double.NaN;
		double xMax = Double.NaN;
		double yMax = Double.NaN;
		
		
		
		for (Coordinate c : coordinates) {
			if (c.getX() < xMin || Double.isNaN(xMin)) {
				xMin = c.getX();
			}
			if (c.getX() > xMax  || Double.isNaN(xMax)) {
				xMax = c.getX();
			}
			if (c.getY() < yMin  || Double.isNaN(yMin)) {
				yMin = c.getY();
			}
			if (c.getY() > yMax  || Double.isNaN(yMax)) {
				yMax = c.getY();
			}
		}

		Coordinate topRight = new Coordinate(xMax,yMax);
		Coordinate bottomLeft = new Coordinate(xMin,yMin);
		
		Enveloppe enveloppe = new Enveloppe(bottomLeft, topRight);
		return enveloppe;
	}

	public List<Coordinate> getCoordinates() {
		return coordinates;
	}
	

}
