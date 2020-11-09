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
        Administrativo admi= new Administrativo("A123","Jorge C.","indefinido","SNP",10,0,0);
        Administrativo ope= new Administrativo("O123","Luis R.","tiempo completo","AFP",20,0,0);
        admi.bonificacion();
        admi.descuento();
        ope.bonificacion();
        ope.descuento();
        System.out.println("Administravo "+admi.toString());
        System.out.println("Operario "+ope.toString());
    }
    
}
