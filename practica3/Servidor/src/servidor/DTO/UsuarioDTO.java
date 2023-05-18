/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor.DTO;
import java.io.Serializable;
/**
 *
 * @author INGESIS
 */
public class UsuarioDTO implements Serializable{
    private String tipoIdentificacion;
    private String identificacion;
    private String nombres;
    private String apellidos;
    private int edad;
    
    public UsuarioDTO(String tipoIdentificacion, String identificacion, String nombres, String apellidos, int edad) {
        this.tipoIdentificacion = tipoIdentificacion;
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return "UsuarioDTO{" + "tipoIdentificacion=" + tipoIdentificacion + ", identificacion=" + identificacion + ", nombres=" + nombres + ", apellidos=" + apellidos + ", edad=" + edad + '}';
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
