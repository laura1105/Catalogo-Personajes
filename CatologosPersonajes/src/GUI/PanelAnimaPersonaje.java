/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Model.PersonajeFactory;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author estudiantes
 */
public class PanelAnimaPersonaje extends JPanel {
    
    ImageIcon ic = new ImageIcon();
    JLabel l = new JLabel();
    PersonajeFactory p;
    public PanelAnimaPersonaje(PersonajeFactory p) {
        this.p=p;
        this.setBackground(Color.white);
        l.setSize(300,300);
        l.setLocation(0, 0);
        this.add(l);
        dibuja();
        
    }

    public void dibuja() {
        Timer t = new Timer(200, new ActionListener() {
            int c =0;
            public void actionPerformed(ActionEvent e) {
                switch(c){
                    case 0:
                        ic = p.imagen(c);
                        ic = new ImageIcon(ic.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
                        l.setIcon(ic);
                        c++;
                        break;
                    case 1:
                        ic = p.imagen(c);
                        ic = new ImageIcon(ic.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
                        l.setIcon(ic);
                        c++;
                        break;
                    case 2:
                        ic = p.imagen(c);
                        ic = new ImageIcon(ic.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
                        l.setIcon(ic);
                        c++;
                        break;
                    case 3:
                        ic = p.imagen(c);
                        ic = new ImageIcon(ic.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
                        l.setIcon(ic);
                        c=0;
                        break;
                    default:
                        c=0;
                }
                d();
            }
        });
        t.start();

    }
    
    public void d(){
        this.repaint();
    }

}
