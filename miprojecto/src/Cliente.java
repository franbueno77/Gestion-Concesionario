import java.util.Objects;
/**
 * clase donde se establecen los datos del cliente
 * @author Fran
 *
 */
public class Cliente {

    private String nombre;
    private String apellido;
    private String dni;
    private double cuentaBancaria;
/**
 * método constructor
 * @param nombre
 * @param apellido
 * @param dni
 * @param cuentaBancaria
 */
    public Cliente(String nombre, String apellido, String dni, double cuentaBancaria) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentaBancaria = cuentaBancaria;
    }

/**
 * método toString
 * @return String
 */
    @Override
    public String toString() {
        return "Cliente{" +
                "Nombre='" + nombre + '\'' +
                ", Apellido='" + apellido + '\'' +
                ", DNI='" + dni + '\'' +
                ", Cuenta Bancaria='" + cuentaBancaria + '\'' +
                '}'+"\n";
    }
/**
 * método para obtener el nombre
 * 
 * @return nombre
 */
    public String getNombre() {
        return nombre;
    }
/**
 * método para establecer el nombre
 * @param nombre
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * método para obtener el apellido
 * @return apellido
 */
    public String getApellido() {
        return apellido;
    }
/**
 * método para establecer el apellido
 * @param apellido
 */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
/**
 * método para obtener el dni
 * @return
 */
    public String getDni() {
        return dni;
    }
/**
 * método para establecer el dni
 * @param dni
 */
    public void setDni(String dni) {
        this.dni = dni;
    }
/**
 * metodo para obtener la cantidad de dinero que tiene el cliente en la cuenta bancaria
 * @return	cuentaBancaria
 */
    public double getCuentaBancaria() {
        return cuentaBancaria;
    }
    /**
     * metodo para establecer la cantidad de dinero del cliente en la  cuenta bancaria
     * 
     */
    public void setCuentaBancaria(double cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    @Override
    public boolean equals(Object o) {
Cliente cliente=(Cliente)o;
return cliente.getDni().equalsIgnoreCase(this.getDni());

    }
/**
 * método que devuelve un hash (encriptación) del dni
 *@return int 
 *
 */
     
    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}