
package machineNuma.icn;

import systree.IHierarchical;


public interface IChannel extends IHierarchical{

    /**
     *
     * @param rsp
     */
    public void receive(IResponse rsp);

    /**
     *
     * @param rqt
     */
    public void send(IRequest rqt);
}
