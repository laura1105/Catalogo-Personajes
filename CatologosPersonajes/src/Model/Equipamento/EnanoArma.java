/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Equipamento;

import javax.swing.ImageIcon;

/**
 *
 * @author estudiantes
 */
public class EnanoArma implements Arma{
    @Override
    public ImageIcon tipoArma() {
        ImageIcon enanoArma = new ImageIcon("src/imagenes/ArmaEnano.jpg");
        return enanoArma;
    }

    @Override
    public String descripcion() {
        return "De todas las razas del Viejo Mundo, los mejores fabricando hachas son los Enanos."
                + " Sus hachas son valiosísimas para cualquier guerrero del Viejo Mundo,"
                + " y son algunas de las armas más buscadas.\n"
                + "\n"
                + "Aunque su diseño varía dependiendo de si van a ser manejadas con una mano o ambas,"
                + " la forma de la cabeza, etc, las Hachas Enanas se caracterizan por tener"
                + " un mango más corto hecho de un material más ligero (pero más resistente)"
                + " que el de las hachas normales y poseen un excelente equilibrio entre la defensa y el ataque,"
                + " pudiendo bloquear fácilmente los golpes del enemigo, "
                + "para después contraatacar y partirlo por la mitad."
                + " Los Guerreros Enanos están entrenados en su manejo,"
                + " por lo que pueden utilizarlas con la misma soltura que un Humano empuña una espada.";
    }
}
