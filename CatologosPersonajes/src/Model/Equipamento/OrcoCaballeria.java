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
public class OrcoCaballeria implements Caballeria{

    @Override
    public ImageIcon tipoCaballeria() {
        ImageIcon orcoCaballeria=new ImageIcon("src/imagenes/CaballeriaOrco.jpg");
        return orcoCaballeria;
    }

    @Override
    public String descripcion() {
        return "En lo más alto de las laderas de las Montañas de los Lamentos viven los Dientes Martirio,"
                + " unas bestias cavernarias que siempre han atraído la atención de los Ogros."
                + " Las manadas de estos agresivos depredadores están lideradas por el ejemplar más grande del grupo,"
                + " y gracias a su compenetración en la caza pueden aniquilar a cualquier otra bestia "
                + "que viva en esas crueles latitudes. Los Dientes Martirio son conocidos por su tenacidad,"
                + " que hace que hasta las criaturas más poderosas se lo piensen dos veces antes de enfrentarse a ellos."
                + " Los Ogros hablan de desafiantes Dientes Martirio que bloquean las entradas a las cavernas"
                + " o que se niegan a dar su brazo a torcer en un combate; y todas las tribus tienen una historia"
                + " sobre un Dientes Martirio que siguió luchando después de haber recibido un golpe que debería haberlo matado.";
    }
    
}
