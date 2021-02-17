import java.util.ArrayList;
import java.util.Iterator;
/**
 * Clase que engloba en un arraylist instancias de la clase Contrato
 * @author Fran
 *
 */
public class Contratos {
    ArrayList<Contrato> contratoArrayList = new ArrayList<>();


/**
 * método para añadir instancias de Contrato
 * @param nuevoContrato
 */
    public void annadirContrato(Contrato nuevoContrato){
        System.out.println("El contrato se ha realizado\n");
        contratoArrayList.add(nuevoContrato);

    }
/**
 * lista los contratos existentes mostrándolos por pantalla
 */
    public void listarContratos(){
        Contrato contrato;
        Iterator it=contratoArrayList.iterator();
        while(it.hasNext()){
            contrato = (Contrato) it.next();
            System.out.println(contrato);
        }
}
/**
 * método que gestiona la compraventa
 * @param contrato
 * @return contratoTotal
 */
public double ContratoCompraVenta(Contrato contrato){
        double contratoTotal=0;
     if (contrato.getTipoContrato().equalsIgnoreCase("Compra")){
        cambiarSigno(contrato.getPrecioAcordado());
         System.out.println(contratoTotal-=(contrato.getPrecioAcordado()));
     } else if(contrato.getTipoContrato().equalsIgnoreCase("Venta")){
         System.out.println(contratoTotal=(contrato.getPrecioAcordado()));
     }
return contratoTotal;
}

    


}