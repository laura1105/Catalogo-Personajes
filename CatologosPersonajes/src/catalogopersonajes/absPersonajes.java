/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogopersonajes;

import GUI.MainPanelDetalles;
import Model.Elfo;
import Model.Enano;
import Model.Humano;
import Model.Orco;
import Model.PersonajeFactory;

/**
 *
 * @author estudiantes
 */
public abstract class absPersonajes {
    PersonajeFactory personaje;

    public abstract void consultaJugador(String pj);

    public abstract PersonajeFactory getPj();

    public abstract void dibuja(String nombre,String tipo);

}
