
package machineNuma.icn;

import systree.IHierarchical;


public interface IRequest {

    
    public IHierarchical getSource();
    
    public IHierarchical getTarget();
    public void setSource(IHierarchical source);
    public int getIndex();
    public int getPageIndex();
    
    public boolean isPorcessing();
    public void setPorcessing(boolean processing);
    

    /**
     *
     * @return
     */
        public String getMessage();
}
