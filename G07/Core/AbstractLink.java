package Core;

/**
 * 
 * @author JackassDestroyer
 * @brief Abstract class to link two GraphNode. 
 * Inherit from it to add other information when linking two nodes
 */
public abstract class AbstractLink 
{
	/** "Parent" node */
	protected GraphNode SourceNode;
	/** Node linked to SourceNode */
	protected GraphNode DestinationNode;
	
	/**
	 * Default constructor
	 */
	public AbstractLink() {}
	
	/**
	 * Connect two nodes
	 * @param InSourceNode
	 * @param InDestinationNode
	 */
	public AbstractLink(GraphNode InSourceNode, GraphNode InDestinationNode)
	{		
		LinkNode(InSourceNode, InDestinationNode);
	}
	
	/**
	 * Links two nodes and add itself to InSourceNode
	 * @param InSourceNode Source node
	 * @param InDestinationNode Destination node
	 */
	public void LinkNode(GraphNode InSourceNode, GraphNode InDestinationNode)
	{
		SourceNode = InSourceNode;
		DestinationNode = InDestinationNode;
		
		SourceNode.AddLink(this);
	}
		
	/**
	 * Return source node
	 * @return
	 */
	public GraphNode GetSourceNode() { return SourceNode; }
	
	/**
	 * Return destination node
	 * @return
	 */
	public GraphNode GetDestinationNode() { return SourceNode; }
	
	
}

