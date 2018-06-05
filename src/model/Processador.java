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
public class Processador extends PecasPrototype{

    public Processador(Processador novo) {
         this.tipoPeca = "processador";
        this.descricao = this.getDescricao();
        this.marca = this.getMarca();
        this.modelo = this.getModelo();
    }

    public Processador() {
    }
    
    @Override
    public Processador clone() {
        return new Processador(this);
    }

    

    
}
