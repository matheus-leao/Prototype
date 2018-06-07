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
         super(novo);
    }

    public Processador() {
        this.tipoPeca = "processador";
    }
    
    @Override
    public Processador clone() {
        return new Processador(this);
    }

    

    
}
