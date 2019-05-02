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
public class HumanoEscudo  implements Escudo{

    @Override
    public ImageIcon tipoEscudo() {
        ImageIcon humanoEscudo=new ImageIcon("src/imagenes/EscudoHumano.jpg");
        return humanoEscudo;
    }

    @Override
    public String descripcion() {
        return "La heráldica tal como se la entiende en la actualidad, fue desconocida en la Antigüedad."
                + " Sin embargo, desde la Edad del Bronce existieron emblemas que identificaban a dioses,"
                + " naciones e individuos.4​ Primitivamente, el escudo solía reproducir el cuerpo del guerrero"
                + " conteniendo la transcripción de los tatuajes que conmemoraban sus hazañas y éxitos,"
                + " o los colores, enseñas, signos o estandartes con que se pintaban,"
                + " vestían o presidían para distinguirse en la batalla del enemigo y no ser confundidos con él.";
    }
    
}
