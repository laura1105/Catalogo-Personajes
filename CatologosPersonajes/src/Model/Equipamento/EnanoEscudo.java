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
public class EnanoEscudo implements Escudo{

    @Override
    public ImageIcon tipoEscudo() {
        ImageIcon enanoEscudo=new ImageIcon("src/imagenes/EscudoEnano.png");
        return enanoEscudo;
    }

    @Override
    public String descripcion() {
        return "El Anulador de hechizos es el único escudo conocido pensado para proteger "
                + " de los hechizos de sus agresores. Cuando se bloquea con este escudo, "
                + "se genera una custodia .\n"
                + "\n" 
                + "Para cargar la custodia se necesita al menos un segundo y, como todas las custodias, "
                + "si se superan los 50 puntos de daño mágico, la defensa se quiebra y debe volver a ser invocada."
                + "\n" 
                + "El escudo parece estar forjado con metal enano y cristal. "
                + "Tiene forma cóncava y un gran orbe blanco en el centro. "
                + "Parece estar diseñado para hacer rebotar los hechizos, pese a que los absorbe.";
    }
}
