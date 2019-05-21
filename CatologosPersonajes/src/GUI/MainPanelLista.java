/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author usuario
 */
public class MainPanelLista extends JPanel {

    public MainPanelLista() {
        this.setLayout(null);
        this.setLocation(0, 0);
        this.setSize(300, 800);
        this.setBackground(Color.WHITE);

        JLabel nombre = new JLabel("Nombre del personaje:");
        JTextField TxtNombre = new JTextField();

        nombre.setLocation(10, 10);
        nombre.setSize(130, 30);
        TxtNombre.setLocation(30, 40);
        TxtNombre.setSize(200, 30);

        
        ButtonGroup pj = new ButtonGroup();
        JRadioButton jRBOrco = new JRadioButton("Orco");
        JRadioButton jRBElfo = new JRadioButton("Elfo");
        JRadioButton jRBHumano = new JRadioButton("Humano");
        JRadioButton jRBEnano = new JRadioButton("Enano");
        JRadioButton jRBIngElectrico = new JRadioButton("Ing. electrico");
        pj.add(jRBOrco);
        pj.add(jRBElfo);
        pj.add(jRBHumano);
        pj.add(jRBEnano);
        pj.add(jRBIngElectrico);
        jRBOrco.setBackground(Color.WHITE);
        jRBElfo.setBackground(Color.WHITE);
        jRBHumano.setBackground(Color.WHITE);
        jRBEnano.setBackground(Color.WHITE);
        jRBIngElectrico.setBackground(Color.WHITE);
        jRBOrco.setSize(150, 30);
        jRBElfo.setSize(150, 30);
        jRBHumano.setSize(150, 30);
        jRBEnano.setSize(150, 30);
        jRBIngElectrico.setSize(150, 30);
        jRBOrco.setLocation(30, 80);
        jRBElfo.setLocation(30, 110);
        jRBHumano.setLocation(30, 140);
        jRBEnano.setLocation(30, 170);
        jRBIngElectrico.setLocation(30, 200);

        JButton nuevoPj = new JButton("Agregar Personaje");
        nuevoPj.setSize(200, 30);
        nuevoPj.setLocation(30, 230);

        DefaultListModel listModel = new DefaultListModel();
        JScrollPane scrollPane = new JScrollPane();
        JList lista = new JList(listModel);
        Border lineBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
        lista.setBorder(lineBorder);
        lista.setFixedCellHeight(30);
        scrollPane.setSize(290, 450);
        scrollPane.setLocation(5, 300);
        scrollPane.setViewportView(lista);
        
        
        mainPanelListaEvents.registraBotonMetodoCrear(nuevoPj, listModel, TxtNombre, pj);
        mainPanelListaEvents.registraListaMetodoSelecciona(lista);

        this.add(nuevoPj);
        this.add(nombre);
        this.add(TxtNombre);
        this.add(jRBOrco);
        this.add(jRBElfo);
        this.add(jRBHumano);
        this.add(jRBEnano);
        this.add(jRBIngElectrico);
        this.add(scrollPane);

    }
}
