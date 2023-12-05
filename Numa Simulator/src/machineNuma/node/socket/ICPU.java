
package machineNuma.node.socket;

import systree.IHierarchical;


public interface ICPU extends IHierarchical{

    /**
     *
     */
    public final String type = "CPU"; 
    
    /**
     *
     * @return
     */
    public int getCountCore();

    /**
     *
     * @return
     */
    public int getSpeed();

    /**
     *
     * @return
     */
    public IHierarchical[] getCores();
}
