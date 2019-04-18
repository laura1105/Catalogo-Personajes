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
public class EnanoCaballeria implements Caballeria{

    @Override
    public ImageIcon tipoCaballeria() {
        ImageIcon enanoCaballeria=new ImageIcon("src/imagenes/CaballeriaEnano.jpg");
        return enanoCaballeria;
    }
    
}
