
import java.util.Objects;
/**
 * clase Vehiculo 
 * @author Fran
 *
 */
public class Vehiculo {

    private String modelo;
    private String marca;
    private String color;
    private String annoFabricacion;
    private String estado;
    private double precio ;
    private String numBastidor;
/**
 * método constructor
 * @param modelo
 * @param marca
 * @param color
 * @param annoFabricacion
 * @param estado
 * @param precio
 * @param numBastidor
 */
    public Vehiculo(String modelo, String marca, String color, String annoFabricacion, String estado, double precio, String numBastidor) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.annoFabricacion = annoFabricacion;
        this.estado = estado;
        this.precio = precio;
        this.numBastidor=numBastidor;
    }
/**
 * obtiene el número del bastidor
 * @return numBastidor
 */
    public  String getNumBastidor(){
        return numBastidor;

    }
    /**
     * establece el número de bastidor
     * @param numBastidor
     */
    public void setNumBastidor(String numBastidor){
        this.numBastidor=numBastidor;
    }

/**
 * se obtiene el modelo del vehículo
 * @return modelo
 */
    public String getModelo() {
        return modelo;
    }
/**
 * establece el modelo del vehículo
 * @param modelo
 */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
/**
 * se obtiene la marca del vehículo
 * @return marca
 */
    public String getMarca() {
        return marca;
    }
/**
 * se establece la marca del vehículo
 * @param marca
 */
    public void setMarca(String marca) {
        this.marca = marca;
    }
/**
 * se obtiene el color del vehículo
 * @return color
 */
    public String getColor() {
        return color;
    }
/**
 * establece el color del vehículo
 * @param color
 */
    public void setColor(String color) {
        this.color = color;
    }
/**
 * se obtiene el año de fabricación del vehículo
 * @return
 */
    public String getAnnoFabricacion() {
        return annoFabricacion;
    }
/**
 * se establece el año de fabricación del vehículo
 * @param annoFabricacion
 */
    public void setAnnoFabricacion(String annoFabricacion) {
        this.annoFabricacion = annoFabricacion;
    }
/**
 * se obtiene el estado del vehículo
 * @return estado
 */
    public String getEstado() {
        return estado;
    }
/**
 * se establece el estado del vehículo
 * @param estado
 */
    public void setEstado(String estado) {
        this.estado = estado;
    }
/**
 * se obtiene el precio del vehículo
 * @return precio
 */
    public double getPrecio() {
        return precio;
    }
/**
 * se establece el precio del vehiculo
 * @param precio
 */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
/**
 * método toString
 * @return String
 */
    @Override
    public String toString() {
        return "Vehiculo{" +
                "Modelo='" + modelo + '\'' +
                ", Marca='" + marca + '\'' +
                ", Color='" + color + '\'' +
                ", Año Fabricacion='" + annoFabricacion + '\'' +
                ", Estado='" + estado + '\'' +
                ", Precio Venta=" + precio +
                ", Nº Bastidor='" + numBastidor + '\'' +
                '}'+"\n";
    }
    /**
     * si el numero de los bastidores es igual , devuelve true
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
       Vehiculo v=(Vehiculo)o;
       return v.getNumBastidor().equalsIgnoreCase(this.getNumBastidor());
    }


}