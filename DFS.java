/**
 * DepthFirstsearch
 * @author tylerlericos
 * CS215
 * 11/20/23
 */
public class DFS {
    Node root;
    public DFS() {               
        System.out.println("Call DepthFirstSearch with root node to do a Depth First Search.");
    }
    public void DepthFristSearch(Node node, int visitNode)
    {
        	System.out.println("Node: " + node.getData());
        	System.out.println("Nodes Visited: " + visitNode);
        	
            //ADD CODE TO TRAVERSE THE TREE HERE
            //THIS IS APPROXIMATELY THREE LINES OF CODE
            //INCLUDING AN IF STATEMENT TO
            //SEE IF THE NODE IS A LEAF
            //AND TWO RECURSIVE CALLS TO THE CHILDREN
            if(node.getlChild() != null|| node.getrChild() != null){
            	System.out.println("Right Child: " + node.getrChild().getData());
            	System.out.println("Left Child: " + node.getlChild().getData());
            	System.out.println("Height: " + visitNode);
                DepthFristSearch(node.getlChild(), visitNode + 1);
                DepthFristSearch(node.getrChild(), visitNode +1 );
            } 
            //MODIFY OTHER CODE AS NECESSARY
    }
}
