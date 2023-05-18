/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cliente.controladores;

import java.rmi.Remote;
import java.rmi.RemoteException;
import servidor.DTO.UsuarioDTO;
/**
 *
 * @author TOSHIBA
 */
public interface ControladorCallBackInt extends Remote{
    public void notificarRegistrarUsuario(UsuarioDTO objUsuario) throws RemoteException;
}
