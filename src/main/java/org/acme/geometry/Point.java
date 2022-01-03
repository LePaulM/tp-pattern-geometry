package org.acme.geometry;

public class Point implements Geometry {
	private Coordinate coordinate;

	public Point() {
		super();
	}

	public Point(Coordinate coordinate) {
		super();
		this.coordinate = coordinate;
	}

	@Override
	public String getType() {
		return "Point";
	}

	@Override
	public boolean isEmpty() {
		if (coordinate.isEmpty() == true) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void translate(double dx, double dy) {
		this.coordinate = new Coordinate(
				this.coordinate.getX()+dx,
				this.coordinate.getY()+dy);
	}
	
	@Override
	public Point clone() {
		return this;
	}
	
}
