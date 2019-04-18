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
public class EnanoArma implements Arma{
    @Override
    public ImageIcon tipoArma() {
        ImageIcon enanoArma = new ImageIcon("src/imagenes/ArmaEnano.jpg");
        return enanoArma;
    }
}
