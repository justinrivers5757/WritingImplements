class Marker extends Pen
{
	private String tipShape;
 
 	
	/**
	 * Accessor method for tipShape
	 *
	 * returns the shape of the writing tip
	 */
	public String getTipShape()
	{
		return tipShape;
	}
  
	
	/**
	 * mutator method for tipShape. Valid shapes are "chisel", "bullet", and "wide"
	 *
	 * @param tipShape 	the shape of the writing tip.
	 */
	private void setTipShape(String tipShape)
   {
		if (   (tipShape == "chisel")
          || (tipShape == "bullet")
          || (tipShape == "wide") )
			this.tipShape = tipShape;
 		else
			this.tipShape = "chisel";
		
	}

        
	/**
	 * The constructor for a Marker. It allows you to specify its color, shape, and size
	 *
	 * @param 	inkColor	The color of the marker. It can be any string that names a color
	 * @param 	tipShape	The shape of the writing tip. Valid shapes are "chisel", "bullet", and "wide"
	 * @param 	tipSize	The size of the tip in millimeters. Must be positive
	 */
   public Marker(String inkColor, String tipShape, double tipSize)
	
	{
		super(inkColor, "plastic", tipSize);
		this.tipShape = tipShape;
	}


	/*
	 * The default constructor for a marker. It creates a black chisel point marker with a
	 * quarter-inch (63.5mm) tip.
	 */
	public Marker()
	
	{
		this("black", "chisel", 6.35);
	}

	/**
	 * Method to describe the marker drawing something
	 *
	 * @param 	something	the item being drawn
	 */
	public void draw(String something)
   {
		System.out.println("The " + getInkColor() + " marker just drew: " + something);
	}

        
 	/**
 	 * A method to simulate the marker coloring a shape
 	 *
 	 * @param 	shape		the shape being colored
	 */
 	public void Color(String shape)
	{
		System.out.println("The " + getInkColor() + " marker just colored a: " + shape);
	}

}

