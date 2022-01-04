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

	public Coordinate getCoordinate() {
		return coordinate;
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

	@Override
	public Enveloppe getEnveloppe() {
		EnveloppeBuilder builder = new EnveloppeBuilder();
		builder.insert(this.coordinate);
		
		Enveloppe enveloppe = builder.build();
		
		return enveloppe;
	}
	
}
