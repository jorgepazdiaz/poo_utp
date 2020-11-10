package utp_class;

/**
 *
 * @author jpaz
 */
public abstract class Trabajador {
     //atributos  
    private String codigo;
    private String nombre;
    private String Ocupacion;
    
    

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
        return Ocupacion;
    }

    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }
    
    
//metodo constructor

    public Trabajador(String codigo, String nombre, String ocupacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.Ocupacion= ocupacion;
    }
    
    public double getSueldo() {
        double sueldo = 0;
        if (getOcupacion() == "Administrativo") {

            sueldo = 4500;
        } else if (getOcupacion() == "Operario") {
            sueldo = 4000;
        }else if (getOcupacion()=="Supervisor"){
            sueldo=6000;
        }
        else if (getOcupacion()=="Ayudante"){
            sueldo=2000;
        }
        else {sueldo=0;}
        return sueldo;
    }
    

    @Override
    public String toString() {
        return "codigo=" + codigo + ", nombre=" + nombre +" ,Ocupacion "+Ocupacion+" , Sueldo= "+getSueldo()+" ,";
    }

}
