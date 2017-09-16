package Core;

/**
 * 
 * @author JackassDestroyer
 * Mere graph of nodes and links (shortcut class)
 */
public class Graph extends AbstractGraph<Node, Link> 
{
	/**
	 * Link two nodes (in the graph)
	 * @param InSourceNodeIndex Source node index in graph
	 * @param InDestinationNodeIndex Destination node index in graph
	 */
	public void LinkNode(int InSourceNodeIndex, int InDestinationNodeIndex)
	{
		LinkUtility.Link(At(InSourceNodeIndex), At(InDestinationNodeIndex));
	}
}
