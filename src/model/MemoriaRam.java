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
public class MemoriaRam extends PecasPrototype{
    
    
    public MemoriaRam(MemoriaRam novo) {
         this.tipoPeca = "memoria ram";
        this.descricao = this.getDescricao();
        this.marca = this.getMarca();
        this.modelo = this.getModelo();
    }

    public MemoriaRam() {
    }
    
    @Override
    public MemoriaRam clone() {
        return new MemoriaRam(this);
    }
    
}
