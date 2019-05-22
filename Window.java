public class Window
{
    public static void main(String[] args)
    {
        //Input decides which graph we will draw.
        Node nodes[];
        Connector connectors[];
        Text textarray[];
        int input= 3;
        WindowsMode status = new WindowsMode(input);
        //This creates an instance of the Game arena class.
        GameArena window = new GameArena(1000,800,true);
        //This updates the node positon of the screen.
        status.NodePos();
        status.LinePos(window);
        //These arrays hold the balls, text and lines to be added.
        textarray = status.getTextArray();
        nodes = status.getArray();
        connectors = status.getLineArray();
        //These if statements add the balls, thentext, and thelines to the Game Arena
        for(int z = 0; z < connectors.length;z++){
            window.addLine(connectors[z]);
        }
        for(int x = 0; x < nodes.length;x++){
            window.addText(textarray[x]);
            window.addBall(nodes[x]);
        }
        for(int x = 0; x < textarray.length;x++){
            window.addText(textarray[x]);
        }
        //This updates the screen.
        window.update();
    }
    
}