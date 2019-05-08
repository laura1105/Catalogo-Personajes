/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFrame;

/**
 *
 * @author estudiantes
 */
public class FrameAnimaPersonaje extends JFrame{
    PanelAnimaPersonaje p;
    
    public FrameAnimaPersonaje(){
        p = new PanelAnimaPersonaje(null);
        p.setSize(300, 300);
        this.setSize(300, 300);
        this.setVisible(true);
        
    }
}
