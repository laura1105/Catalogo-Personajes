/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catologospersonajes;


import Model.Elfo;
import Model.Enano;
import Model.Humano;
import Model.Orco;
import Model.PersonajeFactory;

/**
 *
 * @author usuario
 */
public class Personajes {

    PersonajeFactory personaje;

    public Personajes(String pj) {
        consultaJugador(pj);
    }

    public void consultaJugador(String pj) {
        switch (pj) {
            case "Orco":
                personaje = new Orco();
                break;
            case "Elfo":
                personaje = new Elfo();
                break;
            case "Humano":
                personaje = new Humano();
                break;
            case "Enano":
                personaje = new Enano();
                break;
        }
    }

    public PersonajeFactory getPj() {
        return personaje;
    }

    public void dibuja(String nombre,String tipo) {

        
    }

}
