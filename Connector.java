public class Connector extends Line
{
    private double w = 5;
    private double start_xLoc;
    private double start_yLoc;
    private double end_xLoc;
    private double end_yLoc;
    private String colour = "#0000FF";
    private Line line;
    public Connector(double startX, double startY, double endX, double endY, double w, String col)
    {
        
        super(startX, startY, endX, endY, w, col);
        start_xLoc = startX;
        start_yLoc = startY;
        end_xLoc = endX;
        end_yLoc = endY;
        colour = col;
    }
    
}