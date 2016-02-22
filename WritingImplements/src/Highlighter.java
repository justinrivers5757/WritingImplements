
/**
 * Write a description of class Highlighter.
 * 
 * @author (Megan Hatfield 
 * @version (1.0)
 */
class Highlighter extends Marker 
{
    // instance variables - replace the example below with your own
   String bodySize;
   String bodyColor;
    /**
     * Constructor for a Highlighter. Allows you to choose the color, size of the tip,
     * and the size of the actual highlighter. 
     * 
     * @param   bodySize    Size of the highlighter
     * @param   tipSize     Size of the highlighter tip
     * @param   bodyColor  Color of the highlighter body
     */
    public Highlighter(String bodySize, String bodyColor)
    {
        super("pink", "chizel", 2.5);
        this.bodySize = bodySize;
        this.bodyColor = bodyColor;
    }
    
    /**
     * Default constructor
     */
    public Highlighter()
    {
        this("large","yellow");
    }
    
    
    /**
     * A method to hightlight "words"
     * 
     * @param  string   words to be highlighted
     * @return the "text" was highlighted
     */
    public void highlight(String something )
    {
        System.out.println("The " + bodyColor + " highlighter just highlighted " + something);
    }
}
