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
public class ElfoArma implements Arma {

    @Override
    public ImageIcon tipoArma() {
        ImageIcon elfoArma = new ImageIcon("src/imagenes/ArmaElfo.jpg");
        return elfoArma;
    }

    @Override
    public String descripcion() {
        return "Esta es la espada de Arwen, llamada Hadhafang que significa Hoja de Multitudes."
                + " Años atrás perteneció a la princesa élfica Idril, esposa de Tuor,"
                + " cuyo hijo era Eärendil, padre de Elrond que a su vez era padre de Arwen."
                + "  Elrond empuñó Hadhafang al final de la Segunda Edad de la \"Tierra Media,\""
                + " durante la última Alianza de elfos y hombres en la gran batalla contra Sauron. "
                + "Más tarde pasó a su hija, Arwen, que usó Hadhafang contra los sirvientes de la sombra."
                + "\n" + "\n" + "Inscritas en la superficie de la hoja hay runas "
                + "Sindar que dicen \"aen estar Hadhafang i chathol hen, thand arod dan i thang an i arwen."
                + "\", que traducido significa \"Es llamada Hadhafang esta espada, "
                + "una noble defensa contra multitudes enemigas para una noble dama.\"";
    }

}
