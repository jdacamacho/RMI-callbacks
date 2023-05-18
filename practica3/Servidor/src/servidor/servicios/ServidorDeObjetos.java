/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.servicios;


import java.rmi.Remote;
import servidor.utilidades.UtilidadesRegistroS;
import servidor.utilidades.UtilidadesConsola;
import java.rmi.RemoteException;
import servidor.Repositorios.UsuarioRepository;
import servidor.controladores.ControladorGestionAdministradoresImpl;
import servidor.controladores.ControladorGestionUsuarioImpl;

public class ServidorDeObjetos
{
    public static void main(String args[]) throws RemoteException
    {        
         
        int numPuertoRMIRegistry = 0;
        String direccionIpRMIRegistry = "";
                       
        System.out.println("Cual es el la dirección ip donde se encuentra  el rmiRegistry ");
        direccionIpRMIRegistry = UtilidadesConsola.leerCadena();
        System.out.println("Cual es el número de puerto por el cual escucha el rmiRegistry ");
        numPuertoRMIRegistry = UtilidadesConsola.leerEntero(); 
     
        UsuarioRepository objRepository = new UsuarioRepository();
        ControladorGestionAdministradoresImpl objRemotoGestionAdministradores = new ControladorGestionAdministradoresImpl();
        ControladorGestionUsuarioImpl objRemoto = new ControladorGestionUsuarioImpl(objRepository,objRemotoGestionAdministradores);//se leasigna el puerto de escucha del objeto remoto
        
        try
        {
           UtilidadesRegistroS.arrancarNS(numPuertoRMIRegistry);
           UtilidadesRegistroS.RegistrarObjetoRemoto((Remote)objRemoto, direccionIpRMIRegistry, numPuertoRMIRegistry, "objServicioGestionUsuarios");            
           UtilidadesRegistroS.RegistrarObjetoRemoto((Remote)objRemotoGestionAdministradores, direccionIpRMIRegistry, numPuertoRMIRegistry, "objServicioGestionAdministradores");
        } catch (Exception e)
        {
            System.err.println("No fue posible Arrancar el NS o Registrar el objeto remoto" +  e.getMessage());
        }
        
        
    }
}
