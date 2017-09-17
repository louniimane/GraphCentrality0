package core;

import java.util.Vector;

/**
 * 
 * @author JackassDestroyer
 * Base class of graph centrality algorithm, evaluates a type of graph (according to NodeType/LinkType)
 * and return candidate graph nodes indices
 * @param <NodeType> Node type
 * @param <LinkType> Link type
 */
public abstract class AbstractAlgorithm
<		
	NodeType extends AbstractNode<?>
	,LinkType extends AbstractLink<?>
>
{

	/**
	 * Evaluates given graph and return indices of graph nodes
	 * @param InGraph Graph to evaluate
	 * @return Indices of candidate graph nodes
	 */
	public abstract 
	<GraphNodeType extends NodeType, GraphLinkType extends LinkType>
	Vector<Integer> Evaluate(AbstractGraph<GraphNodeType, GraphLinkType> InGraph);
}
