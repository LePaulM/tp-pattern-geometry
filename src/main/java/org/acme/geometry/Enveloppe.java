package org.acme.geometry;

public class Enveloppe {
	private Coordinate bottomLeft = new Coordinate();
	private Coordinate topRight= new Coordinate();
	
	
	public Enveloppe() {
		super();
	}

	public Enveloppe(Coordinate bottomLeft, Coordinate topRight) {
		super();
		this.bottomLeft = bottomLeft;
		this.topRight = topRight;
	}
	
	public boolean isEmpty() {
		if (bottomLeft.isEmpty() || topRight.isEmpty()) {
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
