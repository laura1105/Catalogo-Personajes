/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Equipamento.Arma;
import Model.Equipamento.Caballeria;
import Model.Equipamento.EnanoArma;
import Model.Equipamento.EnanoCaballeria;
import Model.Equipamento.EnanoEscudo;
import Model.Equipamento.Escudo;

/**
 *
 * @author estudiantes
 */
public class Enano implements PersonajeFactory{

    public Arma getArma() {
        return new EnanoArma();
    }

    @Override
    public Caballeria getCaballeria() {
        return new EnanoCaballeria();
    }

    @Override
    public Escudo getEscudo() {
        return new EnanoEscudo();
    }

    @Override
    public String imagen(int id) {
        return "src/Sprites/EnanoAtaque"+(id+1)+".png";
    }
    
}
