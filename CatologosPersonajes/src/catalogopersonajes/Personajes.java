/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogopersonajes;

import Adapters.AdapterIngElectrical;
import GUI.MainPanelDetalles;
import Model.Decoradores.decoradorOrco;
import Model.Elfo;
import Model.Enano;
import Model.Humano;
import Model.Orco;
import Model.PersonajeFactory;

/**
 *
 * @author usuario
 */
public class Personajes extends absPersonajes{

    //PersonajeFactory personaje;

    public Personajes(String pj) {
        consultaJugador(pj);
    }

    public void consultaJugador(String pj) {
        switch (pj) {
            case "Orco":
                personaje = new Orco();
                personaje= new decoradorOrco();
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
            case "Ing. electrico":
                personaje = new AdapterIngElectrical();
                break;
        }
    }

    public PersonajeFactory getPj() {
        return personaje;
    }

    public void dibuja(String nombre,String tipo) {
        MainPanelDetalles detalles = MainPanelDetalles.singleton();

        detalles.actualizaImagenes(personaje.getArma().tipoArma(),
                personaje.getEscudo().tipoEscudo(),
                personaje.getCaballeria().tipoCaballeria(),
                nombre,
                tipo);
        detalles.actualizaDescripcion(personaje.getArma().descripcion(), 
                personaje.getEscudo().descripcion(), 
                personaje.getCaballeria().descripcion());
    }
    
    public void Atacar(){
        personaje.atacar(personaje);
    }

    
}
