/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor.controladores;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import servidor.controladores.ControladorGestionAdministradoresInt;
import cliente.controladores.ControladorCallBackInt;
import java.util.LinkedList;
import servidor.DTO.UsuarioDTO;
/**
 *
 * @author TOSHIBA
 */
public class ControladorGestionAdministradoresImpl extends UnicastRemoteObject implements ControladorGestionAdministradoresInt {
    
    private final LinkedList<ControladorCallBackInt> listReferencias;
    
    public ControladorGestionAdministradoresImpl() throws RemoteException{
        super();
        this.listReferencias = new LinkedList();
    }
    
    @Override
    public boolean registrarReferenciaRemota(ControladorCallBackInt referencia) throws RemoteException{
        return this.listReferencias.add(referencia);
    }
    
    public void notificarAdministradores(UsuarioDTO objUsuario){
        this.listReferencias.forEach(
                obj->{
            try {        
                obj.notificarRegistrarUsuario(objUsuario);
            }catch (RemoteException ex){
                System.out.println("Error al notificar al administrador");
            }
        }    
        );
    }
}
