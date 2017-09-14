package Core;

import java.util.Vector;

/**
 * 
 * @author JackassDestroyer
 * @brief Container of TNodeType, acts as a container of Nodes. Provides
 * few methods to handle node creation
 */
public class Graph<NodeType 
extends AbstractNode<AbstractLink<NodeType>>,
		LinkType extends AbstractLink<NodeType>>
{
	protected Vector<NodeType> Nodes;
	
	/**
	 * Default constructor
	 */
	public Graph()
	{
		Nodes = new Vector<NodeType>();
	}
	
	/**
	 * Add a node
	 * @param InNode Node to add
	 */
	public void AddNode(NodeType InNode)
	{
		Nodes.add(InNode);
	}
	
	/**
	 * Remove a node
	 * @param InNode Node to remove
	 */
	public void RemoveNode(NodeType InNode)
	{
		Nodes.remove(InNode);
	}
	
	/**
	 * Return all nodes
	 * @return
	 */
	public Vector<NodeType> GetNodes()
	{
		return Nodes;
	}
	
	/**
	 * Returns graph node at given index
	 * @param InIndex
	 * @return Can be null if index is invalid
	 */
	public NodeType At(int InIndex)
	{
		if(InIndex < 0 || InIndex >= Nodes.size())
			return null;
		
		return Nodes.get(InIndex);
	}
	
	/**
	 * Returns node count
	 * @return
	 */
	public int GetNodeCount()
	{
		return Nodes.size();
	}
}
