class Pencil extends WritingImplement
{


	/// <summary>
	/// The color of the pencil (not the color it writes). Can be any string that names a color
	/// </summary>
	private String bodyColor;
   
	/**
	 * Accessor method for bodyColor
	 *
	 * returns the color of the pencil
	 */
	public String getBodyColor()
	{
		return bodyColor;
	}
	
	/**
	 * Mutator method for bodyColor
	 *
	 * @param bodyColor	the color of the pencil. can be any string
	 */
	private void setBodyColor(String bodyColor)
	{
		this.bodyColor = bodyColor;
	}

        

        
	/**
	 * A constructor for Pencil objects
	 *
	 * @param	bodyMaterial	The material the pencil is made of. Must be "plastic", "wooden", or "metal"
	 * @param 	bodyColor		The color of the pencil, not the color it writes
	 * @param	leadSize			The size of the writing point in mm.
	 */
	public Pencil(String bodyMaterial, String bodyColor, double leadSize)
	   
	{
		super(bodyMaterial, leadSize);
		setBodyColor(bodyColor);
	}

        
	/**
	 * The default constructor for the pencil. Creates a yellow wooden pencil with 0.5mm writing point
	 */
	public Pencil()
	{
		this("wooden", "yellow", 0.5);
	}

 
        
	/**
	 * This method simulates the pencil erasing somethig
	 *
	 * @param 	words		The words the pencil erased
	 */
	public void erase(String words)
	{
		System.out.println("The " + bodyColor + " " + getBodyMaterial() + " pencil just erased the words: " + words);
	}
 
	/**
	 * This method describes the pencil drawing something
	 *
	 * @param	shape		The shape or object drawn
	 */
   public void draw(String shape)
	{
		System.out.println("The " + bodyColor + " " + getBodyMaterial() + " pencil just drew: " + shape);
	}

}
