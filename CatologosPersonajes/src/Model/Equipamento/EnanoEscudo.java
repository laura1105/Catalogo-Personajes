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
}
