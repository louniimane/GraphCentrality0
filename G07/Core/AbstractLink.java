package Core;

/**
 * 
 * @author JackassDestroyer
 * @brief Abstract class to link two GraphNode. 
 * Inherit from it to add other information when linking two nodes
 */
public abstract class AbstractLink<NodeType extends AbstractNode<AbstractLink<NodeType>>>
{
	/** "Parent" node */
	protected NodeType SourceNode;
	/** Node linked to SourceNode */
	protected NodeType DestinationNode;
	
	/**
	 * Default constructor
	 */
	public AbstractLink() {}
	
	/**
	 * Connect two nodes
	 * @param InSourceNode
	 * @param InDestinationNode
	 */
	public AbstractLink(NodeType InSourceNode, NodeType InDestinationNode)
	{		
		LinkNode(InSourceNode, InDestinationNode);
	}
	
	/**
	 * Links two nodes
	 * @param InSourceNode Source node
	 * @param InDestinationNode Destination node
	 */
	public void LinkNode(NodeType InSourceNode, NodeType InDestinationNode)
	{
		SourceNode = InSourceNode;
		DestinationNode = InDestinationNode;
		
		SourceNode.AddLink(this);
	}
		
	/**
	 * Return source node
	 * @return
	 */
	public NodeType GetSourceNode() { return SourceNode; }
	
	/**
	 * Return destination node
	 * @return
	 */
	public NodeType GetDestinationNode() { return SourceNode; }
	
	
}

