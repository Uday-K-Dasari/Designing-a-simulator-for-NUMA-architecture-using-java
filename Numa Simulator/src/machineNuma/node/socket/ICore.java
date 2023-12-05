
package machineNuma.node.socket;

import systree.IHierarchical;


public interface ICore extends IHierarchical{

    /**
     *
     */
    public final String type = "Core"; 
    
    /**
     *
     * @param index
     * @param target
     * @return 
     */
    public String[] load(int index, IHierarchical target);

    /**
     *
     * @param index
     * @param data
     */
    public void store(int index, int data);

    /**
     *
     */
    public void compute();
    
}
