public class Node extends Ball
{
    /**
     * Constructor. Extends ball to my Node class meaning we can use the attributes of a ball.
     * 
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