/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Equipamento.Arma;
import Model.Equipamento.Caballeria;
import Model.Equipamento.ElfoArma;
import Model.Equipamento.ElfoCaballeria;
import Model.Equipamento.ElfoEscudo;
import Model.Equipamento.Escudo;

/**
 *
 * @author estudiantes
 */
public class Elfo implements PersonajeFactory{

    public Arma getArma() {
        return new ElfoArma();
    }

    @Override
    public Caballeria getCaballeria() {
        return new ElfoCaballeria();
    }

    @Override
    public Escudo getEscudo() {
        return new ElfoEscudo();
    }
    
}