/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

/**
 *
 * @author usuario
 */
public class MainPanelDetalles extends JPanel {

    private static JLabel lArmaImg = new JLabel();
    private static JTextArea tArmaDesc = new JTextArea();
    private static JLabel lEscudoImg = new JLabel();
    private static JTextArea tEscudoDesc = new JTextArea();
    private static JLabel lCaballeriaImg = new JLabel();
    private static JTextArea tCaballeriaDesc = new JTextArea();
    private static JLabel lNombre = new JLabel();
    private static JLabel lClase = new JLabel();
    private static MainPanelDetalles me;

    private MainPanelDetalles() {

    }

    public static MainPanelDetalles singleton() {
        if (me == null) {
            me = new MainPanelDetalles();
            initComponents();
        }
        return me;
    }

    public static void initComponents() {
        me.setLayout(null);
        me.setLocation(300, 0);
        me.setSize(1000, 830);
        me.setBackground(Color.WHITE);
        Border lineBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
        me.setBorder(lineBorder);

//        JLabel lNombre = new JLabel("aqui va el nombre");
        lNombre.setLocation(30, 60);
        lNombre.setSize(300, 30);

//        JLabel lClase = new JLabel("clase del personaje");
        lClase.setLocation(30, 90);
        lClase.setSize(300, 30);

        JLabel lArma = new JLabel("Arma:");
        lArma.setLocation(30, 120);
        lArma.setSize(300, 30);

//        JLabel lArmaImg =  new JLabel();
        lArmaImg.setLocation(80, 150);
        lArmaImg.setSize(150, 150);

        tArmaDesc.setLocation(240, 150);
        tArmaDesc.setSize(500, 150);
        tArmaDesc.setEnabled(false);
        tArmaDesc.setDisabledTextColor(Color.black);
        tArmaDesc.setLineWrap(true);

        JLabel lEscudo = new JLabel("Escudo:");
        lEscudo.setLocation(30, 310);
        lEscudo.setSize(300, 30);

//        JLabel lEscudoImg =  new JLabel();
        lEscudoImg.setLocation(80, 340);
        lEscudoImg.setSize(150, 150);

        tEscudoDesc.setLocation(240, 340);
        tEscudoDesc.setSize(500, 150);
        tEscudoDesc.setEnabled(false);
        tEscudoDesc.setDisabledTextColor(Color.black);
        tEscudoDesc.setLineWrap(true);

        JLabel lCaballeria = new JLabel("Caballeria:");
        lCaballeria.setLocation(30, 500);
        lCaballeria.setSize(300, 30);

//        JLabel lCaballeriaImg =  new JLabel();
        lCaballeriaImg.setLocation(80, 530);
        lCaballeriaImg.setSize(150, 150);

        tCaballeriaDesc.setLocation(240, 530);
        tCaballeriaDesc.setSize(500, 150);
        tCaballeriaDesc.setEnabled(false);
        tCaballeriaDesc.setDisabledTextColor(Color.black);
        tCaballeriaDesc.setLineWrap(true);

        me.add(lNombre);
        me.add(lClase);
        me.add(lArma);
        me.add(lArmaImg);
        me.add(tArmaDesc);
        me.add(lEscudo);
        me.add(lEscudoImg);
        me.add(tEscudoDesc);
        me.add(lCaballeria);
        me.add(lCaballeriaImg);
        me.add(tCaballeriaDesc);

        me.repaint();
    }

    public void actualizaImagenes(ImageIcon arma, ImageIcon escudo, ImageIcon caballeria, String nombre, String tipo) {
        arma = new ImageIcon(arma.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
        escudo = new ImageIcon(escudo.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
        caballeria = new ImageIcon(caballeria.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));

        lArmaImg.setIcon(arma);
        lEscudoImg.setIcon(escudo);
        lCaballeriaImg.setIcon(caballeria);
        lNombre.setText(nombre);
        lClase.setText(tipo);

        this.repaint();
    }

    public void actualizaDescripcion(String arma, String escudo, String caballeria) {
        tArmaDesc.setText(arma);
        tEscudoDesc.setText(escudo);
        tCaballeriaDesc.setText(caballeria);
    }

}
