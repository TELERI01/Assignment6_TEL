/**
 * @author Nathan Johnson, Bellarmine University
 * CS215
 */
public class Application {

	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args)
	{
		
		//System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree=new Tree();//Creates a tree with root
		Node root=aTree.generatePracticeTree(6);
		DFS aSearch=new DFS();
		aSearch.DepthFristSearch(root,1);
		
		

	}



}
