import java.lang.Math;
public class Circle extends Figure {
	private final double r=5;//radius of circle
    final double pi = Math.PI;
  
    //overrides the methods of abstract class Figure
	@Override
	void findArea() {
		//area of circle = pi * r * r
		dim1 = pi * r * r;
		System.out.println("area of Circle -->"+dim1);		
	}	
	@Override
	void findPerimeter() {
		//perimeter of circle = 2 * pi * r
		dim1 = 2 * pi * r;
		System.out.println("perimeter of Circle -->"+dim1);	
	}

}
