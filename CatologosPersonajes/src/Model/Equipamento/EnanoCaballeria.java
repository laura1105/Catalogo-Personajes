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

    @Override
    public String descripcion() {
        return "Los tejones topo son mamíferos enormes que habitan en el Reino Tierra. "
                + "Viven principalmente bajo tierra, fueron los primeros Maestros Tierra, "
                + "más tarde les enseñaron el mismo arte a los humanos. \n"
                + "\n"
                + " Ellos tienen un pelaje marrón con una raya blanca y dos rayas negras corriendo por la espalda "
                + "y tienen como parches de máscara blancos en el rostro."
                + " Ellos tienen colas largas y cinco garras en cada pata. "
                + "Los tejones topo utilizan sus narices para inspeccionar objetos en frente de ellos";
    }
    
}
