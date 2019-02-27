import java.util.ArrayList;

/**
 * Class to represent a trapezoid, a type of Square.
 *
 * Specifically, defines a quadrilateral with all 4 sides of equal length and intersecting at 90 degrees
 * @author Matt
 * @version 2019-02-26
 */
public class Square extends Rectangle
{
	/**
	 * The variables storing the lengths of the left/right sides of the trapezoid and the lengths of the
	 * top/bottom bases.
	 */
	private double sideLength;

	/**
     * The rectangle constructor. Store the side and base information and store in the sideLengths array.
     *
     * @param id The created shape's name id.
     * @param leftSide The left side (not parallel) of the trapezoid.
     * @param rightSide The right side (not parallel) of the trapezoid.
     * @param topBase The top base (parallel to the bottom base) of the trapezoid.
     * @param bottomBase The bottom base (pallel to the top base) of the trapezoid.
     */
	public Square(String id, double sideLength)
	{
		// TODO: complete this...
	    
	    super(id, sideLength, sideLength);
	    
	    //ArrayList<Double> sidesTrapezoid = new ArrayList<Double>(4); //Mistake
	    
	    this.sideLengths.add(sideLength);
	    this.sideLengths.add(sideLength);
	    this.sideLengths.add(sideLength);
	    this.sideLengths.add(sideLength);
	    
	    
	    
	}

	/**
	 * Calculates and returns the area of the square.
	 *
	 * Formula as obtained from:
	 * https://math.stackexchange.com/questions/2637690/is-there-a-formula-to-calculate-the-area-of-a-trapezoid-knowing-the-length-of-al?rq=1
	 *
	 * @return Area of the trapezoid.
	 */
	@Override
	public double getArea()
	{
		// Use shorter variables names for sake of simplicty:
		double a = this.sideLength;

		// Calculate:
		return Math.pow(a, 2);
	}

	/**
	 * Gets the type of the shape.
	 *
	 * @return The string "Square"
	 */
	@Override
	public String getShapeType()
	{
		// TODO: complete this...
	    
	    return "Square";
	    
	}

}
