/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import sun.applet.Main;

/**
 *
 * @author usuario
 */
public class MainFrame extends JFrame{
    
    MainPanelLista panelCrea;
    MainPanelDetalles panelDetalles;
    
    public MainFrame(){
        this.setLayout(null);
        this.setSize(807, 830);
        this.setLocation(200, 50);
        
        panelCrea = new MainPanelLista();
        panelDetalles = MainPanelDetalles.singleton();
        
        this.setResizable(false);
        this.add(panelCrea);
        this.add(panelDetalles);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
}
