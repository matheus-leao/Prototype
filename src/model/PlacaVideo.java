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
    public PlacaVideo(PlacaVideo novo) {
        this.tipoPeca = "placa de video";
        this.descricao = this.getDescricao();
        this.marca = this.getMarca();
        this.modelo = this.getModelo();
    }

    public PlacaVideo() {
    }
    
    @Override
    public PlacaVideo clone() {
        return new PlacaVideo(this);
    }
}
