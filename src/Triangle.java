import java.lang.Math;
public class Triangle extends Figure {
	private final double a=30, b=50, c=30; // sides of triangle

	 //overrides the methods of abstract class Figure
	@Override
	void findArea() {
		/* Heron's formula:
         area of triangle = SquareRoot(s * (s - a) * (s - b) * (s - c)) 
         where s = (a + b + c) / 2, or 1/2 of the perimeter of the triangle */
		
        double s = (a + b + c) / 2;
        dim1=Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("area of triangle -->"+dim1);		
	}
	@Override
	void findPerimeter() {
		// perimeter of triangle = a + b + c
		dim1 = (a + b + c);
		System.out.println("perimeter of triangle -->"+dim1);
	}
	
}
