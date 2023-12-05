
package machineNuma.node.socket;

import systree.IHierarchical;


public interface ISocket extends IHierarchical {

    /**
     *
     */
    public final String type = "Socket"; 
    
    /**
     *
     * @return
     */
    public IHierarchical[] getCPU();

    /**
     *
     * @return
     */
    public IHierarchical[] getCore();
    
    /**
     *
     * @return
     */
    public int getCPUCount();

    /**
     *
     * @return
     */
    public int getCoreCount();
    
}
