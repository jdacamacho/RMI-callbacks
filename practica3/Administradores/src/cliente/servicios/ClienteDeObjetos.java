/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente.servicios;

import cliente.controladores.ControladorCallBackImpl;
import cliente.utilidades.UtilidadesRegistroC;
import java.rmi.RemoteException;
import servidor.controladores.ControladorGestionAdministradoresInt;

/**
 *
 * @author TOSHIBA
 */
public class ClienteDeObjetos {
    public static void main(String [] args) throws RemoteException{
        int numPuertoRMIRegistry = 0;
        String direccionIpRMIRegistry = "";
        
        System.out.println("Cual es el la dirección ip donde se encuentra  el rmiRegistry ");
        direccionIpRMIRegistry = cliente.utilidades.UtilidadesConsola.leerCadena();
        System.out.println("Cual es el número de puerto por el cual escucha el rmiRegistry ");
        numPuertoRMIRegistry = cliente.utilidades.UtilidadesConsola.leerEntero();
        
        ControladorCallBackImpl objRemoto = new ControladorCallBackImpl();
        ControladorGestionAdministradoresInt objRemoteServidor = (ControladorGestionAdministradoresInt)UtilidadesRegistroC.obtenerObjRemoto(direccionIpRMIRegistry, numPuertoRMIRegistry,"objServicioGestionAdministradores");
        objRemoteServidor.registrarReferenciaRemota(objRemoto);
        System.out.println("Esperando notificacion");
        
        
    }   
}
