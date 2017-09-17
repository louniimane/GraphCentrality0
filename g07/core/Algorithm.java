package core;

import java.util.Vector;

/**
 * 
 * @author JackassDestroyer
 * Algorithm based on mere graph (node/link). Inherit from it
 */
public class Algorithm extends AbstractAlgorithm<Node, Link>
{
	/**
	 * Default constructor
	 */
	public Algorithm() {}

	/**
	 * Simple algorithm returning the "most important" node (highest degree) 
	 */
	@Override
	public <GraphNodeType extends Node, GraphLinkType extends Link> 
	Vector<Integer> Evaluate(AbstractGraph<GraphNodeType, GraphLinkType> InGraph) 
	{
		Vector<Integer> Results = new Vector<Integer>();
		
		int NodeIndex = 0;
		for(int i = 0; i < InGraph.GetNodeCount(); i++)
		{
			Node CurrentNode = InGraph.At(i);
			if(CurrentNode.GetLinkCount() > InGraph.At(NodeIndex).GetLinkCount())
				NodeIndex = i;
		}
		
		Results.add(NodeIndex);
		
		return Results;
	}

	
}
