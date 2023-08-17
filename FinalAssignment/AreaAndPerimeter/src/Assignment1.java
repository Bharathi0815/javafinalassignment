import java.util.Scanner;
import IShapeCalculateImpl.Circle;
import IShapeCalculateImpl.Triangle;
public class Assignment1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Radius of the circle ");
		
		Double r=scan.nextDouble();
		
		Triangle c=new Triangle();
	Double area=c.CalculateCircleAreaAndPerimeter(r);
		
		System.out.println("Area of a circle :"+area);
		
		Scanner scan2=new Scanner(System.in);
		System.out.println("Enter Height of Triangle ");
		Double h=scan.nextDouble();
		System.out.println("Enter base of triangle ");
		Double b=scan.nextDouble();
		
	Double trianglearea=c.CalculateTriangleAreaAndPerimeter( h, b);
	System.out.println("Area of Triangle :"+trianglearea);
		

	}

}
