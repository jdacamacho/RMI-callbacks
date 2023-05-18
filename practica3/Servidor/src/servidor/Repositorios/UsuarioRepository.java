/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor.Repositorios;

import java.util.ArrayList;
import java.util.List;
import servidor.DTO.UsuarioDTO;

/**
 *
 * @author INGESIS
 */
public class UsuarioRepository implements UsuarioRepositoryInt{
    
    private final ArrayList<UsuarioDTO> misUsuarios;
    
    public UsuarioRepository()
    {        
        this.misUsuarios = new ArrayList();
    }
    
    @Override
    public boolean registrarUsuario(UsuarioDTO objUsuario) {
       System.out.println("Entrando a registrar");
        boolean bandera=false;
        
        if(this.misUsuarios.size() < 5)
        {            
            bandera=this.misUsuarios.add(objUsuario);
        }
        
        return bandera;
    }

    @Override
    public List<UsuarioDTO> listarUsuarios() {
        System.out.println("Entrando a listar usuarios");
        return this.misUsuarios;
    }
    
}
