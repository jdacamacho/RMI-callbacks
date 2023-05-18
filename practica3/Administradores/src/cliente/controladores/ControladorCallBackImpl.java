/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente.controladores;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import servidor.DTO.UsuarioDTO;
/**
 *
 * @author TOSHIBA
 */
public class ControladorCallBackImpl extends UnicastRemoteObject implements ControladorCallBackInt{
    
    public ControladorCallBackImpl() throws RemoteException{
        super();
    }
    
    @Override
    public void notificarRegistrarUsuario(UsuarioDTO objUsuario) throws RemoteException {
        System.out.println("Usuario nuevo registrado");
        System.out.println("Tipo identificacion: " + objUsuario.getTipoIdentificacion());
        System.out.println("Identificacion: " + objUsuario.getIdentificacion());
        System.out.println("Nombres: " + objUsuario.getNombres());
        System.out.println("Apellidos: " + objUsuario.getApellidos());
        System.out.println("Edad: " + objUsuario.getEdad());
    }
    
}
