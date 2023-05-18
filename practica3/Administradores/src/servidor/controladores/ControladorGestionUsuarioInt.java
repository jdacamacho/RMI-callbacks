/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor.controladores;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import servidor.DTO.UsuarioDTO;
/**
 *
 * @author INGESIS
 */
public interface ControladorGestionUsuarioInt extends Remote  {
    
    public boolean registrarUsuario(UsuarioDTO objUsuario) throws RemoteException;
    public List<UsuarioDTO> listarUsuarios() throws RemoteException;
    
}
