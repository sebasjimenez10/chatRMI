
/**
 *
 * @author Menes
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IChatClient extends Remote {

    public void viewBoardMsg(String msg) throws RemoteException;

    public String getAlias() throws RemoteException;
}