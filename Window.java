public class Window
{
    public static void main(String[] args)
    {
        int input= 3;
        GameArena window = new GameArena(1000,800);
        
       


        Node nodes[];
        int[] xLocs;
        int[] yLocs;
        Connector connectors[];
        Text textarray[];
        Arrow arrowArray[];
        
        WindowsMode status = new WindowsMode(input);
        status.NodePos();
        // status.getGameArena(window);
        status.LinePos(window);
        arrowArray = status.getarrowArray();
        textarray = status.getTextArray();
        nodes = status.getArray();
        connectors = status.getLineArray();
        for(int z = 0; z < connectors.length;z++){
            window.addLine(connectors[z]);
        }
        // for(int z = 0; z < arrowArray.length;z++){
        //     window.addLine(arrowArray[z]);
        // }
        for(int x = 0; x < nodes.length;x++){
            window.addText(textarray[x]);
            window.addBall(nodes[x]);
        }
        for(int x = 0; x < textarray.length;x++){
            window.addText(textarray[x]);
        }
        
        
        
        window.update();
    }
    
}