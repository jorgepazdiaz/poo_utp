/* Considerando que en una fábrica textil  requiere calcular el monto a pagar de sus trabajadores en donde se tienen las
siguientes consideraciones:
Se toma en cuenta los datos del Trabajador:  código de Trabajador, nombre de Trabajador, ocupación. 
Con respecto a la ocupación del Trabajador, se considera rangos salariales diferentes, como administrativo 4500,
operario 4000,  supervisor 6000 y ayudante 2000. 
Se emplean tres modalidades de contrato para los trabajadores: indefinido, contrato tiempo completo y contratado medio tiempo.
Según el tipo de contrato y el tiempo de servicio el Trabajador puede recibir bonificación:
•Para los que tienen contrato indefinido: si tiempo de servicio es mayor o igual que 5 años y menor que 15 años, 
recibirá una bonificación  igual al 15% del sueldo. Si tiempo de servicio es mayor que 15 años,
recibirá una bonificación igual al 20% del sueldo.
•Para los que tiene contrato a tiempo completo: si tiempo de servicio es mayor que 1 año 
La bonificación es igual al 10% del sueldo.
Solo para los que tienen contrato indefinido o contrato tiempo completo, 
pueden recibir un descuento del 11% del sueldo si el tipo de pensión es por AFP, 
13% del sueldo si el tipo de Pensión es SNP.
•La aplicación debe mostrar los siguiente datos:
•Código de Trabajador
•Nombre de Trabajador,
•Ocupación.
•El sueldo que se le paga al Trabajador
•La bonificación correspondiente
•El monto del descuento
•Pago Final */
package tarea2final;

public abstract class Trabajador {
     //atributos  
    private String codigo;
    private String nombre;
    private String tipodecontrato;
    private String seguro;
    private int tiempodeservicio;
    private double bono;
    private double descuento;
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipodecontrato() {
        return tipodecontrato;
    }

    public void setTipodecontrato(String tipodecontrato) {
        this.tipodecontrato = tipodecontrato;
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

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    
//metodo constructor

    public Trabajador(String codigo, String nombre, String tipodecontrato,String seguro, int tiempodeservicio, double bono, double descuento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipodecontrato = tipodecontrato;
        this.seguro=seguro;
        this.tiempodeservicio = tiempodeservicio;
        this.bono = bono;
        this.descuento=descuento;
    }
    
    

    @Override
    public String toString() {
        return "codigo=" + codigo + ", nombre=" + nombre + ", tipodecontrato=" + tipodecontrato +", seguro=" + seguro + ", tiempodeservicio=" + tiempodeservicio + ", bono=" + bono + ", descuento "+descuento+" ,";
    }

 
    //prueba3
}
