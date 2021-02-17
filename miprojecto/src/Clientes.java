import java.util.ArrayList;
import java.util.Iterator;
/**
 * método que engloba en un arraylist estancias de la clase Cliente
 * @author Fran
 *
 */
public class Clientes {
ArrayList <Cliente> clienteArrayList=new ArrayList<>();

/**
 * devuelve la el arraylist de Cliente
 * @return clienteArrayList
 */

    public ArrayList<Cliente> getClienteArrayList() {
        return clienteArrayList;
    }
/**
 * añade clientes al arraylist
 * @param nuevoCliente
 * @return	nombreCliente
 */
   public Cliente annadirCliente (Cliente nuevoCliente){
       Cliente nombreCliente;

        System.out.println("El cliente se ha añadido\n");
        clienteArrayList.add(nuevoCliente);
nombreCliente=nuevoCliente;
return nombreCliente;
   }
   /**
    * lista los clientes, los muestra por pantalla
    */
   public void listarClientesNombres(){
       for (Cliente c: clienteArrayList) {
           System.out.println(c.getNombre());
       }
   }
/**
 * lista los clientes por su DNI
 */
   public void listarClientesByDNI(){
        for (Cliente c:clienteArrayList){
            System.out.println(c.getDni());
        }
   }
/**
 * lista completa de todos los datos del cliente
 */

   public void listarClientesInformacionCompleta(){
        Cliente cliente;
       Iterator it=clienteArrayList.iterator();
       while(it.hasNext()){
           cliente = (Cliente)it.next();
           System.out.println(cliente);
       }


   }


}