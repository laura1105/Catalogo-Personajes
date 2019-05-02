/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Equipamento;

import javax.swing.ImageIcon;

/**
 *
 * @author estudiantes
 */
public class HumanoArma  implements Arma{
    @Override
    public ImageIcon tipoArma() {
        ImageIcon humanoArma = new ImageIcon("src/imagenes/ArmaHumano.gif");
        return humanoArma;
    }

    @Override
    public String descripcion() {
        return "Los humanos han fabricado y usado armas con filo desde la Edad del Bronce."
                + " La espada se desarrolla a partir de la daga cuando la confección de hojas"
                + " largas se hace posible a principios del II milenio a. C."
                + " Las espadas más largas de 90 cm son raras durante la Edad del Bronce,"
                + " pues su longitud excede la capacidad extensible del bronce (aleación de cobre y estaño)."
                + " No fue hasta el desarrollo de aleaciones más fuertes, como el acero, que la espada larga "
                + "fue práctica para el combate.";
    }
}
