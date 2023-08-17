package IShapeCalculateImpl;
import java.util.Scanner;

import IShapeCalculate.Shapes;

public class Triangle extends Circle implements Shapes{

	@Override
	public Double CalculateTriangleAreaAndPerimeter(Double height,Double base) {
		
		
		
		Double area=height*base*1/2;
		
		return area;
	}

	

}
