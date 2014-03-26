abstract class WritingImplement
{
    private String bodyMaterial;
    private double pointSize;
    private double length; 

    /**
	  * Accessor method for pointSize
	  *
	  * @return the size of the writing tip in mm
	  */	
    public double getPointSize()
    {
       return pointSize;
    }
    
    /**
     * Method for getting the length
     * 
     * @return the length
     */
    public double getLength()
    {
    	return length;
    }
    
	 /**
	  * Mutator method for pointSize
	  *
	  * @param	pointSize  the size of the writing tip in mm (must be postitive, defaults to 0.5)
	  */
	 public void setPointSize(double pointSize)
    {
        if (pointSize > 0)
        {
            this.pointSize = pointSize;
        }
        else    // invalid point size... set to 0
        {
            this.pointSize = 0.5;
        }
    }

	
	 /**
     * Accessor method for bodyMaterial      
	  *
	  * @return	the material the implment is made of.
	  */
    public String getBodyMaterial()
    {
        return bodyMaterial;
    }
	 
    
	 /**
     * Mutator method for bodyMaterial      
	  *
	  * @param	bodyMaterial	the material the implment is made of. Must be one of "plastic", "wooden", or "metal".
	  */
	 private void setBodyMaterial(String bodyMaterial)
    {
        if ((bodyMaterial == "plastic")
            || (bodyMaterial == "wooden")
            || (bodyMaterial == "metal"))
        {
            this.bodyMaterial = bodyMaterial;
        }
        else
        {
            this.bodyMaterial = "plastic";
        }
        
    }
        
        
    /*
     * A constructor for the WritingImplement class
     *
	  * @param 	bodyMaterial 	The material the object is made of. Must be "plastic", "wooden", or "metal"</param>
     * @param 	pointsize		The size of the writing point. Must be positive.
	  */
    public WritingImplement(String bodyMaterial, double pointsize, double length)
    {
        setBodyMaterial(bodyMaterial);
        setPointSize(pointsize);
        this.length = 5.5;
        
    }
     



    /**
	  * A method to simulate the writing implement writing a message.
     *
     * @param	message	the message the writing implement writes
	  */
    public void write(String message)
    {
        System.out.println("The " + bodyMaterial + " writing implement just wrote:  " + message);
    }
    
	 
	 
	 
	 /**
	  * Method to describe the writing implement drawing something
     *
     * @param	something	the item being drawn
	  */
    public void draw(String something)
    {
        System.out.println("The " + bodyMaterial + " writing implement just drew: " + something);
    }

 }
