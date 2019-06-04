/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Decoradores;

import Model.Orco;
import Model.PersonajeFactory;
import javax.swing.ImageIcon;

/**
 *
 * @author estudiantes
 */
public class decoradorOrco extends Orco{
    public decoradorOrco(){
    }

    @Override
    public void atacar(PersonajeFactory p) {
        super.atacar(p); //To change body of generated methods, choose Tools | Templates.
    }
        public ImageIcon imagen(int id) {
        return new ImageIcon("src/Sprites/orcoSalto"+(id+1)+".PNG");
    }
    
}
