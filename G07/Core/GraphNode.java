package Core;

import java.util.Vector;

/**
 * 
 * @author JackassDestroyer
 * @brief Represents a node in graph
 * Acts as a container of links.
 *  Note : Given links are not checked, you have to handle null-cases
 */
public class GraphNode 
{
	/** Links to other nodes */
	protected Vector<AbstractLink> Links;
	
	/**
	 * Default constructor
	 */
	public GraphNode()
	{
		Links = new Vector<AbstractLink>();
	}
	
	/**
	 * Add given link to links
	 * @param InLink link to add
	 */
	public void AddLink(AbstractLink InLink)
	{
		Links.add(InLink);
	}
	
	/**
	 * Add given link to links
	 * @param InLink Link to remove
	 */
	public void RemoveLink(AbstractLink InLink)
	{
		Links.remove(InLink);
	}
	
	/**
	 * Returns links
	 * @return
	 */
	public Vector<AbstractLink> GetLinks() 
	{
		return Links;
	}
	
	/**
	 * Returns links count
	 * @return
	 */
	public int GetLinkCount()
	{
		return Links.size();
	}
}
