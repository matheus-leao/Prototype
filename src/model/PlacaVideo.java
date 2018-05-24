/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Math
 */
public class PlacaVideo extends PecasPrototype{

    public PlacaVideo(PlacaVideo novo) {
        this.nome = novo.getNome();
        this.descricao = novo.getDescricao();
        this.marca = novo.getMarca();
        this.modelo = novo.getModelo();
        this.peso = novo.getPeso();
        this.preco = novo.getPreco();
        this.numeroSerie = novo.getNumeroSerie();
        this.garantia = novo.getGarantia();
        this.recurso = novo.getRecurso();
    }
    
    @Override
    public PlacaVideo clone() {
        return new PlacaVideo(this);
    }
    
}
