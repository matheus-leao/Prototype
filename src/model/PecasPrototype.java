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
    String descricao;
    String marca;
    String modelo;

    public PecasPrototype() {
    }

    public PecasPrototype(String tipoPeca, String descricao, String marca, String modelo) {
        this.tipoPeca = tipoPeca;
        this.descricao = descricao;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getTipoPeca() {
        return tipoPeca;
    }

    public void setTipoPeca(String tipoPeca) {
        this.tipoPeca = tipoPeca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
