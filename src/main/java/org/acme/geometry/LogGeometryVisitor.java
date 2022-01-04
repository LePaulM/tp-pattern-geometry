package org.acme.geometry;

import java.io.PrintStream;

public class LogGeometryVisitor implements GeometryVisitor {

	public LogGeometryVisitor(PrintStream out) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void visit(Point point) {
		System.out.println("Je suis un point avec "
				+ "x="+ point.getCoordinate().getX()+" et "
				+ "y="+point.getCoordinate().getY());
	}

	@Override
	public void visit(LineString lineString) {
		System.out.println("Je suis une polyligne définie par "
				+lineString.getNumPoints()+" point(s)");
	}

}
