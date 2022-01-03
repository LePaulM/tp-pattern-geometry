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
		// TODO Auto-generated method stub
		return "LineString";
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (points.isEmpty() != true) {
			return false;
		} else {
			return true;
		}
		
	}
	
}
