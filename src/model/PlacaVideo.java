/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Luiz myguel
 */
public class PlacaVideo extends PecasPrototype{

    public PlacaVideo() {
        this.tipoPeca = "placa de video";
    }
    
    public PlacaVideo(PlacaVideo novo){
        super(novo);
    }
    
    @Override
    public PlacaVideo clone() {
        return new PlacaVideo(this);
    }
}
