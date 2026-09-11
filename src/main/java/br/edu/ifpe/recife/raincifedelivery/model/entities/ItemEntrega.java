/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpe.recife.raincifedelivery.model.entities;

/**
 *
 * @author ALUNOS 2
 */
public class ItemEntrega {
    private int id;
    private int quantidade;
    private double preco;
    
    private MarcaAgua agua;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public MarcaAgua getAgua() {
        return agua;
    }

    public void setAgua(MarcaAgua agua) {
        this.agua = agua;
    }
    
}
