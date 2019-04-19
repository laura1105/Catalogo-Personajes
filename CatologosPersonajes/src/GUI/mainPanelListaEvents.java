/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import catalogopersonajes.Personajes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author usuario
 */
public class mainPanelListaEvents{
    
    public static void registraBotonMetodoCrear(JButton boton,DefaultListModel model,JTextField nombre,ButtonGroup tipo){
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Enumeration<AbstractButton> a=  tipo.getElements();
                boolean aux = false;
                JRadioButton b=null;
                while(a.hasMoreElements()){
                    b =(JRadioButton)a.nextElement();
                    if(b.isSelected()){
                        aux=true;
                        break;
                    }
                }
                if(b.isSelected() && !nombre.getText().equals("")){
                        model.addElement(b.getText()+" - "+nombre.getText());
                    }else{
                        JOptionPane.showMessageDialog(null, "Ingrese un nombre y seleccione una clase");
                    }
            }
        });
    }
    
    public static void registraListaMetodoSelecciona(JList lista){
        lista.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
                
                Personajes p = new Personajes(lista.getSelectedValue().toString().split("-")[0].trim());
                p.dibuja(lista.getSelectedValue().toString().split("-")[1].trim(),
                        lista.getSelectedValue().toString().split("-")[0].trim());
            }
        
        });
    }
    
    
    
}
