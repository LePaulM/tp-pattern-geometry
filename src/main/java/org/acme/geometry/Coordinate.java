package org.acme.geometry;

public class Coordinate {
	private double x;
	private double y;
	
	public Coordinate() {
		super();
		this.x = 0.0;
		this.y = 0.0;
	}

	public Coordinate(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
}
