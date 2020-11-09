/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2final;

/**
 *
 * @author Jorge
 */
public class TrabajadorAPP {
    
    public static void main(String[] args) {
        Ocupacion admi= new Ocupacion("indefinido","AFP",16,"A12300","Jorge Casma","Administrativo");
        Ocupacion ope= new Ocupacion("tiempo completo","SNP",5,"P12300","Jorge Paz","Operario");
        Ocupacion supe= new Ocupacion("medio tiempo","AFP",16,"S12300","David Lache","Supervisor");
        Ocupacion ayu= new Ocupacion("tiempo completo","AFP",5,"AY12300","Luis Robles","Ayudante");
        admi.bonificacion();
        admi.descuento();
        admi.PagoTotal();
        ope.bonificacion();
        ope.descuento();
        ope.PagoTotal();
        supe.bonificacion();
        supe.descuento();
        supe.PagoTotal();
        ayu.bonificacion();
        ayu.descuento();
        ayu.PagoTotal();
        System.out.println(admi.toString());
        System.out.println(ope.toString());
        System.out.println(supe.toString());
        System.out.println(ayu.toString());
    }
    
}
