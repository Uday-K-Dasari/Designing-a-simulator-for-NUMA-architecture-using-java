
package machineNuma.icn;

import systree.IHierarchical;


public interface IInterConnection extends  IHierarchical{
    /**
     *
     */
    public final String type = "Interconnection"; 
    //

    
    /**
     *
     * @return
     */
    public IHierarchical[] getNodes();
    
    /**
     *
     * @return
     */
    public int getNodeCount();
    
    
    
    /**
     *
     * @return
     */
    public int getLevel();

    /**
     *
     * @param level
     */
    public void setLevel(int level);
    
    public Request getRequest();
    
    public Response getResponse();
}
