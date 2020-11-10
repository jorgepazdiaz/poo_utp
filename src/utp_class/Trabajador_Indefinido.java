package utp_class;

public class Trabajador_Indefinido extends Trabajador {

//atributo
    private String TipoContrato;
    private String seguro;
    private int tiempodeservicio;
    private double bono;
    private double descuento;
    private double pagoTotal;

    public Trabajador_Indefinido(String TipoContrato, String seguro, int tiempodeservicio, String codigo, String nombre, String ocupacion) {
        super(codigo, nombre, ocupacion);
        this.TipoContrato = TipoContrato;
        this.seguro = seguro;
        this.tiempodeservicio = tiempodeservicio;
    }
//Get and Set

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

    public double getBono() {
        return bono;
    }
    public void setBono(double bono) {
        this.bono = bono;
    }
    public double getDescuento() {
        return descuento;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    public double getPagoTotal() {
        return pagoTotal;
    }
    public void setPagoTotal(double pagoTotal) {
        this.pagoTotal = pagoTotal;
    }
    


//metodo
    //como administrativo 4500, operario 4000,  supervisor 6000 y ayudante 2000. 
    

    public double bonificacion() {
        //los que tienen contrato indefinido
        if (getTiempodeservicio()>= 5 && getTiempodeservicio() <= 15) {
                setBono(super.getSueldo()* 0.15);
            }
            if (getTiempodeservicio()> 15) {
                setBono(super.getSueldo() * 0.20);
            }
        return getBono();
    }

    public double descuento() {
        //los que tienen contrato indefinido
        if (getSeguro()== "AFP") {
                setDescuento(getSueldo() * 0.11);
            } else if (getSeguro() == "SNP") {
                setDescuento(getSueldo()* 0.13);
            }

        else {
            setDescuento(getSueldo() * 0);
        }
        return getDescuento();
    }
    
    public double PagoTotal() {
        //los que tienen contrato indefinido
        setPagoTotal((getSueldo()+getBono())-getDescuento());
        return getPagoTotal();
    }
    
    @Override
    public String toString() {
        return super.toString()+"Sueldo=" + getSueldo() + ", Bonificacion=" + getBono() +" ,Decuento="+getDescuento()+" PagoTotal="+getPagoTotal();
    }
}
