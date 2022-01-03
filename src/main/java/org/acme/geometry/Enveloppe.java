package org.acme.geometry;

public class Enveloppe {
	private Coordinate bottomLeft;
	private Coordinate topRight;
	
	
	public Enveloppe() {
		super();
	}

	public Enveloppe(Coordinate bottomLeft, Coordinate topRight) {
		super();
		this.bottomLeft = bottomLeft;
		this.topRight = topRight;
	}
	
	public boolean isEmpty() {
		if (bottomLeft == null || bottomLeft == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getXMin() {
		return this.bottomLeft.getX();
	}
	
	public double getXMax() {
		return this.topRight.getX();
	}
	
	public double getYMin() {
		return this.bottomLeft.getY();
	}
	
	public double getYMax() {
		return this.topRight.getY();
	}
}
