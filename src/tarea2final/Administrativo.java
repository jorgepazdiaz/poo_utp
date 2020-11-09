package tarea2final;

public class Administrativo extends Trabajador {

//atributo
    public final double sueldo = 4500;

    public Administrativo(String codigo, String nombre, String tipodecontrato, String seguro, int tiempodeservicio, double bono, double descuento) {
        super(codigo, nombre, tipodecontrato, seguro, tiempodeservicio, bono, descuento);
    }

   

    

//metodo
    public double getSueldo() {
        return sueldo;
    }
    
    

    public double bonificacion() {
        //los que tienen contrato indefinido

        if (super.getTipodecontrato().equalsIgnoreCase("indefinido")) {
            //si tiempo de servicio es mayor o igual que 5 años y menor que 15 años, 
            //recibirá una bonificación  igual al 15% del sueldo
            if (super.getTiempodeservicio() >= 5 && super.getTiempodeservicio() < 15) {
                super.setBono(this.sueldo * 0.15);
            }
            if (super.getTiempodeservicio() > 15) {
                super.setBono(this.sueldo * 0.20);
            }

        } //los que tienen contrato tiempocompleto
        else if (super.getTipodecontrato().equalsIgnoreCase("tiempo completo")) {
            //si tiempo de servicio es mayor A 1 año 
            //recibirá una bonificación  igual al 20% del sueldo
            if (super.getTiempodeservicio() > 1) {
                super.setBono(this.sueldo * 0.10);
            } //los que tienen contrato tiempocompleto
        } 
        
        else {
             super.setBono(this.sueldo * 0);
        }
        
        return super.getBono();
    }
    
    public double descuento() {
        //los que tienen contrato indefinido

        if (super.getTipodecontrato().equalsIgnoreCase("indefinido")||super.getTipodecontrato().equalsIgnoreCase("tiempo completo")) {
            //si tiempo de servicio es mayor o igual que 5 años y menor que 15 años, 
            //recibirá una bonificación  igual al 15% del sueldo
            if (super.getSeguro()=="AFP") {
                super.setDescuento(this.sueldo * 0.11);
            }
            else if (super.getSeguro()=="SNP") {
                super.setDescuento(this.sueldo * 0.13);
            }

        } //los que tienen contrato tiempocompleto
        else {
            super.setDescuento(this.sueldo * 0);
        }
        
        
        return super.getBono();
    }
}