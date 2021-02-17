import java.util.ArrayList;
import java.util.Iterator;
/**
 * m�todo que engloba instancias de la clase Vehiculo en un arrayList
 * @author Fran
 *
 */
public class Vehiculos {

    ArrayList<Vehiculo> vehiculoArrayList = new ArrayList<>();

/**
 * devuelve el arrayList con las instancias de la clase Vehiculo
 * @return vehiculoArraylist
 */
    public ArrayList<Vehiculo> getVehiculoArrayList() {
        return vehiculoArrayList;
    }
/**
 * a�ade instancias de la clase Vehiculo al arrayList
 * @param nuevoVehiculo
 * @return nombreVehiculo
 */
    public Vehiculo annadirVehiculo(Vehiculo nuevoVehiculo) {

        Vehiculo nombreVehiculo;
        System.out.println("El veh�culo se ha a�adido\n");

        vehiculoArrayList.add(nuevoVehiculo);
nombreVehiculo=nuevoVehiculo;
        return nombreVehiculo;
    }


/**
 * muestra una lista de los veh�culos
 */
    public void listarVehiculoPorNumeroBastidor(){
        for (Vehiculo v: vehiculoArrayList  ) {
            System.out.println(v.getNumBastidor());
        }
    }
/**
 * lista los veh�culos mostrando una informaci�n completa
 */
public void listarVehiculosInformacionCompleta(){
        Vehiculo vehiculo;
        Iterator it= vehiculoArrayList.iterator();
        while (it.hasNext()){
            vehiculo= (Vehiculo)it.next();
            System.out.println(vehiculo);
        }
}


}