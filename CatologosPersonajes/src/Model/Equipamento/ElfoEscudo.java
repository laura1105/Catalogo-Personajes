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
    
}
