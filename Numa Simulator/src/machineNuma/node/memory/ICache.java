
package machineNuma.node.memory;

import systree.IHierarchical;


public interface ICache  extends IHierarchical{

    /**
     *
     */
    public final String type = "Cache"; 
    
    
    /**
     *
     * @return
     */
        public long getSize();
    
    
    // to update the cache pages

    /**
     *
     */
        public void update();
    
    // to return true for hit and false for miss

    /**
     *
     * @return
     */
        public boolean hitOrMiss();
    
}
