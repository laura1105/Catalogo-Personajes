/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapters;

import GUI.FrameAnimaPersonaje;
import Model.Equipamento.Arma;
import Model.Equipamento.Caballeria;
import Model.Equipamento.Escudo;
import Model.PersonajeFactory;
import javax.swing.ImageIcon;
import logica.abstractfactory.factories.ElectricalEngineerFactory; 

/**
 *
 * @author Carlos Lopez
 */
public class AdapterIngElectrical extends ElectricalEngineerFactory implements PersonajeFactory{

    @Override
    public Arma getArma() {
        ImageIcon im = super.createAccessory().operation();
        Arma a = new Arma() {
            @Override
            public ImageIcon tipoArma() {
                return im;
            }

            @Override
            public String descripcion() {
                return "Accesorio de ingeniero electrico";
            }
        };
        return a;
        
    }

    @Override
    public Caballeria getCaballeria() {
        ImageIcon im = super.createVehicle().operation();
        Caballeria c= new Caballeria() {
            @Override
            public ImageIcon tipoCaballeria() {
                return im;
            }

            @Override
            public String descripcion() {
                return "Vehiculo del ingeniero electrico";
            }
        };
      return c;  
    }

    @Override
    public Escudo getEscudo() {
        ImageIcon im=super.createTool().operation();
        Escudo e= new Escudo() {
            @Override
            public ImageIcon tipoEscudo() {
                return im;
            }

            @Override
            public String descripcion() {
                return "Herramienta del ingeniero electrico";
            }
        };
       return e; 
    }

    @Override
    public ImageIcon imagen(int id) {
        return super.getImages()[id];
        //return getClass().getResource("ElectEngr1.jpg").getPath();
        
    }

    @Override
    public void atacar(PersonajeFactory p) {
        FrameAnimaPersonaje pf = new FrameAnimaPersonaje(p);
    }
    
}
