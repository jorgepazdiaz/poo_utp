package tarea2final;

public class Ocupacion extends Trabajador {

//atributo
    private String TipoContrato;
    private String seguro;
    private int tiempodeservicio;
    private double bono=0;
    private double descuento=0;
    private double pagoTotal=0;

    public Ocupacion(String TipoContrato, String seguro, int tiempodeservicio, String codigo, String nombre, String ocupacion) {
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
    public double getSueldo() {
        double sueldo = 0;
        if (super.getOcupacion() == "Administrativo") {

            sueldo = 4500;
        } else if (super.getOcupacion() == "Operario") {
            sueldo = 4000;
        }else if (super.getOcupacion()=="Supervisor"){
            sueldo=6000;
        }
        else if (super.getOcupacion()=="Ayudante"){
            sueldo=2000;
        }
        else {sueldo=0;}
        return sueldo;
    }

    public double bonificacion() {
        //los que tienen contrato indefinido

        if (getTipoContrato().equalsIgnoreCase("indefinido")) {
            //si tiempo de servicio es mayor o igual que 5 años y menor que 15 años, 
            //recibirá una bonificación  igual al 15% del sueldo
            if (getTiempodeservicio()>= 5 && getTiempodeservicio() < 15) {
                setBono(this.getSueldo()* 0.15);
            }
            if (getTiempodeservicio()> 15) {
                setBono(this.getSueldo() * 0.20);
            }

        } //los que tienen contrato tiempocompleto
        else if (getTipoContrato().equalsIgnoreCase("tiempo completo")) {
            //si tiempo de servicio es mayor A 1 año 
            //recibirá una bonificación  igual al 20% del sueldo
            if (getTiempodeservicio()> 1) {
                setBono(getSueldo()* 0.10);
            } //los que tienen contrato tiempocompleto
        } else {
            setBono(getSueldo()* 0);
        }

        return getBono();
    }

    public double descuento() {
        //los que tienen contrato indefinido

        if (getTipoContrato().equalsIgnoreCase("indefinido") || getTipoContrato().equalsIgnoreCase("tiempo completo")) {
            //si tiempo de servicio es mayor o igual que 5 años y menor que 15 años, 
            //recibirá una bonificación  igual al 15% del sueldo
            if (getSeguro()== "AFP") {
                setDescuento(getSueldo() * 0.11);
            } else if (getSeguro() == "SNP") {
                setDescuento(getSueldo()* 0.13);
            }

        } //los que tienen contrato tiempocompleto
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
