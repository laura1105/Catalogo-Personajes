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
}