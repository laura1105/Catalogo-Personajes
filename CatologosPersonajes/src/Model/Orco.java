/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Equipamento.Arma;
import Model.Equipamento.Caballeria;
import Model.Equipamento.Escudo;
import Model.Equipamento.OrcoArma;
import Model.Equipamento.OrcoCaballeria;
import Model.Equipamento.OrcoEscudo;

/**
 *
 * @author estudiantes
 */
public class Orco implements PersonajeFactory{

    @Override
    public Arma getArma() {
        return new OrcoArma();
    }

    @Override
    public Caballeria getCaballeria() {
        return new OrcoCaballeria();
    }

    @Override
    public Escudo getEscudo() {
        return new OrcoEscudo();
    }
    
}