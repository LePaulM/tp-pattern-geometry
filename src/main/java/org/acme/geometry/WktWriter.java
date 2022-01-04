package org.acme.geometry;

public class WktWriter {
	
	public String write(Geometry geometry) {
		String result = "";
		
		if ( geometry instanceof Point ){
		    Point point = (Point)geometry;
		    result += "POINT(" + point.getCoordinate().getX() + " " 
		    + point.getCoordinate().getY() + ")";

		}else if ( geometry instanceof LineString ){
		    LineString lineString = (LineString)geometry;
		    result += "LINESTRING(";
		    
			for (int i = 0; i<lineString.getNumPoints(); i++) {
				result += lineString.getPointN(i).getCoordinate().getX() + " " 
					    + lineString.getPointN(i).getCoordinate().getY() + ",";
			}
			result += ")";
			
		}else{
		    throw new RuntimeException("geometry type not supported");
		}
		return result;
	}

}
