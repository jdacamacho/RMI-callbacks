package cliente.vista;

import cliente.utilidades.UtilidadesConsola;
import java.rmi.RemoteException;
import java.util.List;
import servidor.DTO.UsuarioDTO;
import servidor.controladores.ControladorGestionUsuarioInt;

public class Menu {
    
    private final ControladorGestionUsuarioInt objRemoto;
    
    public Menu(ControladorGestionUsuarioInt objRemoto)
    {
        this.objRemoto=objRemoto;
    }
    
    public void ejecutarMenuPrincipal()
    {
        int opcion = 0;
        do
        {
            System.out.println("==Menu==");
            System.out.println("1. Registrar usuario");			
            System.out.println("2. Listar usuario");
            System.out.println("3. Salir");

            opcion = UtilidadesConsola.leerEntero();

            switch(opcion)
            {
                case 1:
                        Opcion1();
                        break;
                case 2:
                        Opcion2();
                        break;	
                case 3:
                        System.out.println("Salir...");
                        break;
                default:
                        System.out.println("Opción incorrecta");
            }

        }while(opcion != 3);
    }

    private void Opcion1() 
    {
        try
        {
                System.out.println("==Registro del producto==");
                System.out.println("Ingrese el tipo de identificacion");
                String tipoIdentificacion = UtilidadesConsola.leerCadena();
                System.out.println("Ingrese el numero de identificacion");
                String numeroIdentificacion = UtilidadesConsola.leerCadena();
                System.out.println("Ingrese los nombres ");
                String nombres = UtilidadesConsola.leerCadena();
                System.out.println("Ingrese los apellidos ");
                String apellidos = UtilidadesConsola.leerCadena();
                System.out.println("Ingrese la edad");
                int edad = UtilidadesConsola.leerEntero();
                UsuarioDTO objUsuario = new UsuarioDTO(tipoIdentificacion,numeroIdentificacion,nombres,apellidos,edad);
                boolean bandera = objRemoto.registrarUsuario(objUsuario);
                if(bandera)
                        System.out.println("Registro realizado satisfactoriamente...");
                else
                        System.out.println("no se pudo realizar el registro...");
        }
        catch(RemoteException e)
        {
                System.out.println("La operacion no se pudo completar, intente nuevamente...");
        }
    }



    private void Opcion2()
    {	
            try
            {
                    System.out.println("== Usuarios ==");
                    List<UsuarioDTO> usuarios  = objRemoto.listarUsuarios();
                    for(int i = 0 ; i<usuarios.size() ; i++){
                        System.out.println(usuarios.get(i).toString());
                    }
            }
            catch(RemoteException e)
            {
                    System.out.println("La operación no se pudo completar, intente nuevamente...");
                    System.out.println("Excepcion generada: " + e.getMessage());
            }	
    }

    
}
