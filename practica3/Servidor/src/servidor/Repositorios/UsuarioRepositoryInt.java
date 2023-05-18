/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor.Repositorios;

import java.util.List;
import servidor.DTO.UsuarioDTO;

/**
 *
 * @author INGESIS
 */
public interface UsuarioRepositoryInt {
    public boolean registrarUsuario(UsuarioDTO objUsuario);
    public List<UsuarioDTO> listarUsuarios();
}
