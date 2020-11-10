package utp_class;
/* @author jpaz*/
public class Trabajador_MedioTiempo extends Trabajador {
    private String TipoContrato;
    private String seguro;
    private int tiempodeservicio;
    private String bono;
    private String descuento;
    private String pagoTotal;

    public Trabajador_MedioTiempo(String TipoContrato, String seguro, int tiempodeservicio, String codigo, String nombre, String ocupacion) {
        super(codigo, nombre, ocupacion);
        this.TipoContrato = TipoContrato;
        this.seguro = seguro;
        this.tiempodeservicio = tiempodeservicio;
    }
//Getter and Setter
    public String getTipoContrato() {
        return TipoContrato;
    }

    public void setTipoContrato(String TipoContrato) {
        this.TipoContrato = TipoContrato;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public int getTiempodeservicio() {
        return tiempodeservicio;
    }

    public void setTiempodeservicio(int tiempodeservicio) {
        this.tiempodeservicio = tiempodeservicio;
    }

    public String getBono() {
        return bono;
    }

    public void setBono(String bono) {
        this.bono = bono;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String getPagoTotal() {
        return pagoTotal;
    }

    public void setPagoTotal(String pagoTotal) {
        this.pagoTotal = pagoTotal;
    }
    
    
    public String bonificacion() {
        //los que tienen contrato indefinido
        setBono("No recibe Bono");

        return getBono();
    }

    public String descuento() {
        //los que tienen contrato indefinido
        setDescuento("No recibe descuento");
        return getDescuento();
    }
    
    public String PagoTotal() {
        //los que tienen contrato indefinido
        setPagoTotal("Su pago sigue siendo "+getSueldo());
        return getPagoTotal();
    }
    
    @Override
    public String toString() {
        return super.toString()+"Sueldo=" + getSueldo() + ", Bonificacion=" + getBono() +" ,Decuento="+getDescuento()+" PagoTotal="+getPagoTotal();
    }
}
