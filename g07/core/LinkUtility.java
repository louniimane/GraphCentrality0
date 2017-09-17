package core;

/**
 * 
 * @author JackassDestroyer
 * Provides static methods to simplify node linking
 */
public class LinkUtility 
{
	/**
	 * Links two nodes
	 * @param InSourceNode Source node
	 * @param InDestinationNode Destination node
	 * @return Created link
	 */
	public static Link Link(Node InSourceNode, Node InDestinationNode)
	{
		Link Output = new Link(InSourceNode, InDestinationNode);
		InSourceNode.AddLink(Output);
		
		return Output;
	}
}
