import java.util.ArrayList;
import java.util.Iterator;
/**
 * método que engloba instancias de la clase Vehiculo en un arrayList
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
 * añade instancias de la clase Vehiculo al arrayList
 * @param nuevoVehiculo
 * @return nombreVehiculo
 */
    public Vehiculo annadirVehiculo(Vehiculo nuevoVehiculo) {

        Vehiculo nombreVehiculo;
        System.out.println("El vehículo se ha añadido\n");

        vehiculoArrayList.add(nuevoVehiculo);
nombreVehiculo=nuevoVehiculo;
        return nombreVehiculo;
    }


/**
 * muestra una lista de los vehículos
 */
    public void listarVehiculoPorNumeroBastidor(){
        for (Vehiculo v: vehiculoArrayList  ) {
            System.out.println(v.getNumBastidor());
        }
    }
/**
 * lista los vehículos mostrando una información completa
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