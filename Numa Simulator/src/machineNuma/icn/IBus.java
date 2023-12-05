
package machineNuma.icn;

import systree.IHierarchical;


public interface IBus extends IHierarchical{

    /**
     *
     */
    public final String type = "Bus"; 
      //

    /**
     *
     * @return 
     */
    public IHierarchical getMemory();
    
    /**
     *
     * @return
     */
    public IHierarchical[] getSocket();
    
    /**
     *
     * @return
     */
    public int getSocketCount();
    
    
    public IHierarchical[] getCPU();
    
    public int getCPUCount();

    
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
}
