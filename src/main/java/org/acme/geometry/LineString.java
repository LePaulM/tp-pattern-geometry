package org.acme.geometry;

import java.util.List;

public class LineString implements Geometry {
	private List<Point> points;

	public LineString() {
		super();
	}

	public LineString(List<Point> points) {
		super();
		this.points = points;
	}
	
	public int getNumPoints() {
		return points.size();
	}
	
	public Point getPointN(int n) {
		return points.get(n);
	}

	@Override
	public String getType() {
		return "LineString";
	}

	@Override
	public boolean isEmpty() {
		boolean isEmpty = true;
		for (Point point : this.points) {
			if (point.isEmpty() == true) {
				isEmpty = true;
				break;
			} else {
				isEmpty = false;
			}
		}
		
		return isEmpty;

	}

	@Override
	public void translate(double dx, double dy) {
		for(Point point : points) {
			point.translate(dx,dy);
		}
	}
	
	@Override
	public LineString clone() {
		return this;
	}

	@Override
	public Enveloppe getEnveloppe() {
		EnveloppeBuilder builder = new EnveloppeBuilder();
		for (Point point : points) {
			builder.insert(point.getCoordinate());
		}
		
		Enveloppe enveloppe = builder.build();
		
		return enveloppe;
	}

	@Override
	public void accept(GeometryVisitor visitor) {
		visitor.visit(this);
		
	}
	
}
