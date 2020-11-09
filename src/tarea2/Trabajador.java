/* Considerando que en una fábrica textil  requiere calcular el monto a pagar de sus trabajadores en donde se tienen las
siguientes consideraciones:
Se toma en cuenta los datos del trabajador:  código de trabajador, nombre de trabajador, ocupación. 
Con respecto a la ocupación del trabajador, se considera rangos salariales diferentes, como administrativo 4500,
operario 4000,  supervisor 6000 y ayudante 2000. 
Se emplean tres modalidades de contrato para los trabajadores: indefinido, contrato tiempo completo y contratado medio tiempo.
Según el tipo de contrato y el tiempo de servicio el trabajador puede recibir bonificación:
•Para los que tienen contrato indefinido: si tiempo de servicio es mayor o igual que 5 años y menor que 15 años, 
recibirá una bonificación  igual al 15% del sueldo. Si tiempo de servicio es mayor que 15 años,
recibirá una bonificación igual al 20% del sueldo.
•Para los que tiene contrato a tiempo completo: si tiempo de servicio es mayor que 1 año 
La bonificación es igual al 10% del sueldo.
Solo para los que tienen contrato indefinido o contrato tiempo completo, 
pueden recibir un descuento del 11% del sueldo si el tipo de pensión es por AFP, 
13% del sueldo si el tipo de Pensión es SNP.
•La aplicación debe mostrar los siguiente datos:
•Código de trabajador
•Nombre de trabajador,
•Ocupación.
•El sueldo que se le paga al trabajador
•La bonificación correspondiente
•El monto del descuento
•Pago Final */


package tarea2;
//clase padre
public class Trabajador {

    //atributos  
    private String codigo;
    private String nombre;
    private String ocupacion;
    private String tipodecontrato;
    private int tiempodeservicio;
    
//metodo constructor

    public Trabajador(String codigo, String nombre, String ocupacion, String tipodecontrato, int tiempodeservicio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ocupacion = ocupacion;
        this.tipodecontrato = tipodecontrato;
        this.tiempodeservicio = tiempodeservicio;
    }

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

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
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

    

}