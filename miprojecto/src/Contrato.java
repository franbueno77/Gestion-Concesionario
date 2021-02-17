import java.util.Objects;
/**
 * método Contrato, establece aspectos del contrato
 * @author Fran
 *
 */
public class Contrato {

    Vehiculo vehiculo;
    Cliente cliente;
    private String tipoContrato;
    private double precioAcordado;
/**
 * método constructor
 * @param vehiculo
 * @param cliente
 * @param tipoContrato
 * @param precioAcordado
 */
    public Contrato(Vehiculo vehiculo, Cliente cliente, String tipoContrato, double precioAcordado) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.tipoContrato = tipoContrato;
        this.precioAcordado = precioAcordado;
    }
/**
 * devuelve el tipo de contrato
 * @return tipoContrato
 */
    public String getTipoContrato() {
        return tipoContrato;
    }
/**
 * establece tipo de contrato
 * @param tipoContrato
 */
    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
/**
 * devuelve el precio que ha acordado el cliente con el concesionario
 * @return precioAcordado
 */
    public double getPrecioAcordado() {
        return precioAcordado;
    }
/**
 * establece el precio acordado en el contrato
 * @param precioAcordado
 */
    public void setPrecioAcordado(double precioAcordado) {
        this.precioAcordado = precioAcordado;
    }
/**
 * método toString
 * 
 * @return String
 */
    @Override
    public String toString() {
        return "Contrato{" +
                "Vehiculo=" + vehiculo +
                ", Cliente=" + cliente +
                ", Tipo Contrato='" + tipoContrato + '\'' +
                ", Precio Acordado=" + precioAcordado +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        Contrato c=(Contrato) o;
        return c.getTipoContrato().equalsIgnoreCase(this.getTipoContrato());
    }





}