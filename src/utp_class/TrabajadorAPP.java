package utp_class;

/*Jorge Paz*/
public class TrabajadorAPP {
    
    public static void main(String[] args) {
        Trabajador_Indefinido indefinido= new Trabajador_Indefinido("indefinido","AFP",16,"A12300","Jorge Casma","Administrativo");
        Trabajador_TCompleto completo= new Trabajador_TCompleto("tiempo completo","SNP",5,"P12300","Jorge Paz","Operario");
        Trabajador_MedioTiempo medio= new Trabajador_MedioTiempo("medio tiempo","AFP",16,"S12300","David Lache","Supervisor");
        indefinido.bonificacion();
        indefinido.descuento();
        indefinido.PagoTotal();
        completo.bonificacion();
        completo.descuento();
        completo.PagoTotal();
        medio.bonificacion();
        medio.descuento();
        medio.PagoTotal();
        System.out.println(indefinido.toString());
        System.out.println(completo.toString());
        System.out.println(medio.toString());
    }
    
}
