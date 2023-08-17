package IShapeCalculateImpl;

import IShapeCalculate.Shapes;

public abstract class Circle implements Shapes {

	@Override
	public Double CalculateCircleAreaAndPerimeter(Double radius) {
		
		Double Area;
		Double pi=3.14;
		Area=pi*radius*radius;
		
		return Area;
	}


	

}
