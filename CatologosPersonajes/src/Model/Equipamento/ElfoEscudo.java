/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Equipamento;

import javax.swing.ImageIcon;

/**
 *
 * @author usuario
 */
public class ElfoEscudo implements Escudo{

    @Override
    public ImageIcon tipoEscudo() {
        ImageIcon elfoEscudo=new ImageIcon("src/imagenes/EscudoElfo.jpg");
        return elfoEscudo;
    }

    @Override
    public String descripcion() {
        return "El Templado o Temple del Acero, es un tratamiento térmico al que se somete al acero,"
                + " para aumentar su dureza, Flexivilidad, Elasticidad y resistencia a esfuerzos. "
                + "El proceso se lleva a cabo calentando el acero a una temperatura aproximada de 915°C "
                + "en el cual la ferrita se convierte en austenita, después la Hoja de Acero es enfriada rápidamente,"
                + " sumergiéndola o rociándola en agua, en aceite o en otros fluidos o sales que actuan de Refrigerante.";
    }
    
}
