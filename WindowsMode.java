public class WindowsMode
{
    private Node[] nodeArray = new Node[15];
    private int[] xPositions;
    private int[] yPositions;
    private Connector[] lineArray = new Connector[15];
    private Arrow[] arrows = new Arrow[15];
    private Text[] textArray = new Text[15];
    private GameArena arena;
    private int Input;
    public WindowsMode(int input)
    {
        Input = input;
        
    }
    public void NodePos()
    {
        if(Input == 0){
            for(int x = 0; x < (nodeArray.length);x++){
                nodeArray[x] = new Node(0,0,0,"");
                textArray[0] = new Text("1", 50, 50, 10, "#FFFFFF");

            }
        }
        else if(Input == 1){
            nodeArray[0] = new Node(50, 50, 10, "#FF0000");
            nodeArray[1] = new Node(50, 150, 10, "#FF0000");
            nodeArray[2] = new Node(150, 50, 10, "#FF0000");
            nodeArray[3] = new Node(150, 150, 10, "#FF0000");
            textArray[0] = new Text("A", 47, 53, 10, "#FFFFFF");
            textArray[1] = new Text("C", 47, 153, 10, "#FFFFFF");
            textArray[2] = new Text("B", 147, 53, 10, "#FFFFFF");
            textArray[3] = new Text("D", 147, 153, 10, "#FFFFFF");
            
        }
        else if(Input == 2){
            nodeArray[0] = new Node(100, 25, 10, "#FF0000");
            nodeArray[1] = new Node(50, 50, 10, "#FF0000");
            nodeArray[2] = new Node(75, 150, 10, "#FF0000");
            nodeArray[3] = new Node(150, 50, 10, "#FF0000");
            nodeArray[4] = new Node(125, 150, 10, "#FF0000");
            textArray[0] = new Text("E", 97, 28, 10, "#FFFFFF");           
            textArray[1] = new Text("I", 47, 53, 10, "#FFFFFF");
            textArray[2] = new Text("H", 72, 153, 10, "#FFFFFF");
            textArray[3] = new Text("F", 147, 53, 10, "#FFFFFF");
            textArray[4] = new Text("G", 122, 153, 10, "#FFFFFF");
            
        }
        else if(Input == 3){
            nodeArray[0] = new Node(100, 25, 10, "#FF0000");
            nodeArray[1] = new Node(50, 100, 10, "#FF0000");
            nodeArray[2] = new Node(100, 175, 10, "#FF0000");
            nodeArray[3] = new Node(150, 100, 10, "#FF0000");
            textArray[0] = new Text("1", 97, 28, 10, "#FFFFFF");
            textArray[1] = new Text("2", 47, 103, 10, "#FFFFFF");
            textArray[2] = new Text("3", 97, 178, 10, "#FFFFFF");
            textArray[3] = new Text("4", 147, 103, 10, "#FFFFFF");
            
        }
        else{
            nodeArray[0] = new Node(50, 50, 50, "#FF0000");
            textArray[0] = new Text("1", 50, 50, 10, "#FFFFFF");

        }

    }
    public void LinePos(GameArena gameare)
    {
        if(Input == 0){
            for(int x = 0; x < (lineArray.length);x++){
                lineArray[x] = new Connector(0,0,0,0,0,"#0000FF");
            }
        }
        else if(Input == 1){
           lineArray[0] = new Connector(50,60,50,150,2, "#0000FF");
           lineArray[1] = new Connector(50,50,150,50,2, "#0000FF");
           lineArray[2] = new Connector(60,150,150,150,2, "#0000FF");
           lineArray[3] = new Connector(150,60,150,150,2, "#0000FF");
           
            
        }
        else if(Input == 2){
            lineArray[0] = new Connector(50,60,75,150,2, "#0000FF");
            lineArray[1] = new Connector(50,50,150,50,2, "#0000FF");
            lineArray[2] = new Connector(75,150,125,150,2, "#0000FF");
            lineArray[3] = new Connector(150,60,125,150,2, "#0000FF");
            lineArray[4] = new Connector(100,25,50,50,2, "#0000FF");
            lineArray[5] = new Connector(100,25,150, 50,2, "#0000FF");
            lineArray[6] = new Connector(100,25,75,150,2, "#0000FF");
            lineArray[7] = new Connector(100,25,125, 150,2, "#0000FF");
            lineArray[8] = new Connector(125,150,50,50,2, "#0000FF");
            lineArray[9] = new Connector(75,150,150, 50,2, "#0000FF");

         }
         else if(Input == 3){
            arrows[0] = new Arrow(100,25,50,95,2, "#0000FF", gameare);
            arrows[1] = new Arrow(50,100,100,170,2, "#0000FF",gameare);
            arrows[2] = new Arrow(100,175,150,105,2, "#0000FF",gameare);
            arrows[3] = new Arrow(150,100,100,30,2, "#0000FF",gameare);
            
             
         }
        else{
            lineArray[0] = new Connector(55,65,55,210,5, "#0000FF");
        }
    }

    public Node[] getArray()
    {
        return nodeArray;
    }
    public Connector[] getLineArray()
    {
        return lineArray;
    }
    public Text[] getTextArray()
    {
        return textArray;
    }
    public Arrow[] getarrowArray()
    {
        return arrows;
    }
    public Node getNode(int index)
    {
        return nodeArray[index];
    }
}