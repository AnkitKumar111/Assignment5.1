public class Rectangle extends Figure {
	private final double l=20, w=70; //length and width of rectangle

	 //overrides the methods of abstract class Figure
	@Override
	void findArea() {
		//area of rectangle = length * width 
		dim1 = l * w;
	    System.out.println("area of Rectangle -->"+dim1);
	}
	@Override
	void findPerimeter() {
		//perimeter of rectangle = 2 * (length + width)
		dim1 = 2 * (l + w);;
	    System.out.println("perimeter of Rectangle -->"+dim1);
	}

}
