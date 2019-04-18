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
public class OrcoEscudo  implements Escudo{

    @Override
    public ImageIcon tipoEscudo() {
        ImageIcon orcoEscudo=new ImageIcon("src/imagenes/EscudoOrco.jpg");
        return orcoEscudo;
    }
    
}
