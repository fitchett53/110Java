public class Node extends Ball
{
    /**
     * Constructor. Creates an instance of the GameArena class, and displays a window on the
     * screen upon which shapes can be drawn.
     *
     * @param size The size of the node, in pixels.
     * @param xLoc The X location where the node will be put.
     * @param yLoc The Y location where the node will be put.
     * @param colour Holds the basic colou for the 
	 */
    private double size = 50;
    private double xLoc;
    private double yLoc;
    private String colour = "#FF0000";
    public Node(double xInput, double yInput, double size1, String colInput)
    {
        
        super(xInput, yInput, size1, colInput);
    
        
    }
    
}