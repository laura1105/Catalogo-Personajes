/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Equipamento.*;
import javax.swing.ImageIcon;

/**
 *
 * @author estudiantes
 */
public interface PersonajeFactory {

    public Arma getArma();

    public Caballeria getCaballeria();

    public Escudo getEscudo();
    
    public ImageIcon imagen(int id);
    
    public void atacar(PersonajeFactory p);
    
}
