/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpe.recife.raincifedelivery.model.entities;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;

/**
 *
 * @author ALUNOS 2
 */
public class Entrega {
    private int id;
    private long datahora;
    private String observacao;
    private String status;
    
    private Loja loja;
    private Cliente cliente;
    private Entregador entregador;
    private List<ItemEntrega> aguas;
    
    public Entrega(){
        this.datahora = System.currentTimeMillis();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDatahora(long datahora) {
        this.datahora = datahora;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Entregador getEntregador() {
        return entregador;
    }

    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }

    public List getAguas() {
        return aguas;
    }

    public void setAguas(List aguas) {
        this.aguas = aguas;
    }
    
    public String getData(){
        return new SimpleDateFormat("dd/MM/yyyy").format(new Date(this.datahora));
    }
    
    public String getHora(){
        return new SimpleDateFormat("hh:mm").format(new Date(this.datahora));
    }
    
    public double getValor(){
        double valor = 0;
        
        for(ItemEntrega item: this.aguas){
            valor += item.getId()*item.getQuantidade();
        }
        return valor;
    }
}
