package Core;

import java.util.Vector;

/**
 * 
 * @author JackassDestroyer
 * @brief Container of TNodeType, acts as a container of Nodes. Provides
 * few methods to handle node creation
 */
public class Graph
{
	protected Vector<GraphNode> Nodes;
	
	/**
	 * Default constructor
	 */
	public Graph()
	{
		Nodes = new Vector<GraphNode>();
	}
	
	/**
	 * Add a node
	 * @param InNode Node to add
	 */
	public void AddNode(GraphNode InNode)
	{
		Nodes.add(InNode);
	}
	
	/**
	 * Remove a node
	 * @param InNode Node to remove
	 */
	public void RemoveNode(GraphNode InNode)
	{
		Nodes.remove(InNode);
	}
	
	/**
	 * Return all nodes
	 * @return
	 */
	public Vector<GraphNode> GetNodes()
	{
		return Nodes;
	}
	
	/**
	 * Returns graph node at given index
	 * @param InIndex
	 * @return Can be null if index is invalid
	 */
	public GraphNode At(int InIndex)
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
