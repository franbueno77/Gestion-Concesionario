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
 * m�todo constructor
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
 * m�todo toString
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
 * m�todo para obtener el nombre
 * 
 * @return nombre
 */
    public String getNombre() {
        return nombre;
    }
/**
 * m�todo para establecer el nombre
 * @param nombre
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * m�todo para obtener el apellido
 * @return apellido
 */
    public String getApellido() {
        return apellido;
    }
/**
 * m�todo para establecer el apellido
 * @param apellido
 */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
/**
 * m�todo para obtener el dni
 * @return
 */
    public String getDni() {
        return dni;
    }
/**
 * m�todo para establecer el dni
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
 * m�todo que devuelve un hash (encriptaci�n) del dni
 *@return int 
 *
 */
     
    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}