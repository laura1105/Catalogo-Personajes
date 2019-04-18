/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Equipamento;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author estudiantes
 */
public class ElfoArma implements Arma{
    @Override
    public ImageIcon tipoArma() {
        ImageIcon elfoArma = new ImageIcon("src/imagenes/ArmaElfo.jpg");
        return elfoArma;
    }
}
