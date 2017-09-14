package Core;

/**
 * 
 * @author JackassDestroyer
 * Provides static methods to simplify node linking
 */
public class LinkUtility 
{
	/**
	 * Links two graph nodes
	 * @param InSourceNode Source node
	 * @param InDestinationNode Destination node
	 * @return Created link
	 */
	public static SimpleLink Link(SimpleNode InSourceNode, SimpleNode InDestinationNode)
	{
		return new SimpleLink(InSourceNode, InDestinationNode);
	}
}
