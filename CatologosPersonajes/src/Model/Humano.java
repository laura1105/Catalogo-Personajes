/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Equipamento.Arma;
import Model.Equipamento.Caballeria;
import Model.Equipamento.Escudo;
import Model.Equipamento.HumanoArma;
import Model.Equipamento.HumanoCaballeria;
import Model.Equipamento.HumanoEscudo;

/**
 *
 * @author estudiantes
 */
public class Humano implements PersonajeFactory{

    @Override
    public Arma getArma() {
        return new HumanoArma();
    }

    @Override
    public Caballeria getCaballeria() {
        return new HumanoCaballeria();
    }

    @Override
    public Escudo getEscudo() {
        return new HumanoEscudo();
    }

    
    
}
