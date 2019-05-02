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
public class HumanoCaballeria implements Caballeria {

    @Override
    public ImageIcon tipoCaballeria() {
        ImageIcon humanoCaballeria = new ImageIcon("src/imagenes/CaballeriaHumano.jpg");
        return humanoCaballeria;
    }

    @Override
    public String descripcion() {
        return "En la batalla se utilizaron piezas de armadura similares a las de los torneos y justas,"
                + " aunque más ligeras para facilitar la carga y el combate."
                + " Según registros se sabe que bizantinos, turcos y mongoles fueron conocidos"
                + " por cubrir a sus animales con gualdrapas hechas con cota de malla a mediados del Siglo XII.\n"
                + "\n"
                + "La carga a caballo fue una de las innovaciones más significativas en la Edad Media,"
                + " pues durante la época del Imperio Romano y de los primeros reinos godos medievales no se utilizaba."
                + " Los guerreros viajaban hasta el campo de batalla sobre sus corceles y desmontaban para luchar."
                + " Fueron los ingleses los que probablemente iniciaron con estas estrategias,"
                + " más específicamente en la batalla de Hastings en 1066. Muchas gentes habitantes de las praderas asiáticas como los hunos,"
                + " ávaros, mongoles, cumanos, pechenegos, húngaros entre otros llevaban un estilo de vida estrechamente ligado al caballo.";
    }

}
