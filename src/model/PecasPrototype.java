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
public abstract class PecasPrototype {
    
    String nome;
    String descricao;
    String marca;
    String modelo;
    double peso;
    double preco;
    int numeroSerie;
    String garantia;
    String recurso;

    public PecasPrototype() {
    }

    public PecasPrototype(String nome, String descricao, String marca, String modelo, double peso, double preco, int numeroSerie, String garantia, String recurso) {
        this.nome = nome;
        this.descricao = descricao;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.preco = preco;
        this.numeroSerie = numeroSerie;
        this.garantia = garantia;
        this.recurso = recurso;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getRecurso() {
        return recurso;
    }

    public void setRecurso(String recurso) {
        this.recurso = recurso;
    }
    
    public abstract PecasPrototype clone();
    
    
}
