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
public class ElfoCaballeria implements Caballeria{

    @Override
    public ImageIcon tipoCaballeria() {
        ImageIcon elfoCaballeria=new ImageIcon("src/imagenes/CaballeriaElfo.jpg");
        return elfoCaballeria;
    }

    @Override
    public String descripcion() {
        return "Los Caballos Élficos (o Corceles Quel'dorei) son una raza de caballos utilizados por los Altos Elfos que"
                + ", tras varias generaciones de crianza, consiguieron un tipo de corcel de unas características "
                + "bastante superiores " + "a las de sus semejantes mundanos. Se dice que cada jinete congenia con su caballo "
                + "hasta tal punto que un leve gruñido del animal puede servir para alertar a su dueño de peligro inminente.";
    }

}
