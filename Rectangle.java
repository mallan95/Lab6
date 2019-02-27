import java.util.ArrayList;

/**
 * Class to represent a rectangle, a type of Polygon.
 *
 * Specifically, defines a quadrilateral with two sets of equal sides, each set parallel to each other and perpendicular to the other set
 *
 * @author Matt
 * @version 2019-02-26
 */
public class Rectangle extends Polygon
{
	/**
	 * The variables storing the lengths of the left/right sides of the trapezoid and the lengths of the
	 * top/bottom bases.
	 */
	private double horizontalSide, verticalSide;

	/**
     * The rectangle constructor. Store the side and base information and store in the sideLengths array.
     *
     * @param id The created shape's name id.
     * @param horizontalSide length of the Rectangle.
     * @param verticalSide length of the Rectangle.
     */
	public Rectangle(String id, double horizontalSide, double verticalSide)
	{
		// TODO: complete this...
	    
	    super(id);
	    
	    //ArrayList<Double> sidesTrapezoid = new ArrayList<Double>(4); //Mistake
	    
	    this.sideLengths.add(horizontalSide);
	    this.sideLengths.add(horizontalSide);
	    this.sideLengths.add(verticalSide);
	    this.sideLengths.add(verticalSide);
	    
	    
	    
	}

	/**
	 * Calculates and returns the area of the rectangle.
	 *
	 * Formula as obtained from:
	 *
	 * @return Area of the rectangle.
	 */
	@Override
	public double getArea()
	{
		// Use shorter variables names for sake of simplicty:
		double a = this.horizontalSide;
		double b = this.verticalSide;
		
		// Calculate:
		return a * b;
	}

	/**
	 * Gets the type of the shape.
	 *
	 * @return The string "Rectangle"
	 */
	@Override
	public String getShapeType()
	{
		// TODO: complete this...
	    
	    return "Rectangle";
	    
	}

}
