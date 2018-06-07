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
public abstract class PecasPrototype implements Prototype{
    
    String tipoPeca;
    String marca;
    String modelo;
    
    public PecasPrototype(){}

    public PecasPrototype(String tipoPeca, String marca, String modelo) {
        this.tipoPeca = tipoPeca;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    
    PecasPrototype(PecasPrototype novo){
        this.tipoPeca = novo.getTipoPeca();
        this.marca = novo.getMarca();
        this.modelo = novo.getModelo();
    }

    public String getTipoPeca() {
        return tipoPeca;
    }

    public void setTipoPeca(String tipoPeca) {
        this.tipoPeca = tipoPeca;
    }

    public String getDescricao() {
        return this.tipoPeca + " " + this.marca + " " + this.modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
  
    
    public abstract PecasPrototype clone();
    
    
}
