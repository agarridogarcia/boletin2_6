
package boletin2_6;

import javax.swing.JOptionPane;


public class Boletin2_6 {

 
    public static void main(String[] args) {
        //queremos hayar el porcentaje de descuento
        float precio_pagado, precio_tarifa, descuento;
        precio_pagado=Float.parseFloat(JOptionPane.showInputDialog("Precio pagado"));
        precio_tarifa=Float.parseFloat(JOptionPane.showInputDialog("Precio tarifa"));
        descuento= 100* (precio_tarifa - precio_pagado) / precio_tarifa;
        
        JOptionPane.showInputDialog("descuento="+descuento);  
        

    }
    
}
