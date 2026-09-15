/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpe.recife.raincifedelivery.model.repositories;

import br.edu.ifpe.recife.raincifedelivery.model.entities.Entregador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alisson
 */
public class EntregadorRepository {
    private static List<Entregador> entregadores;
    
    static{
        entregadores = new ArrayList<>();
    }
    
    public static void create(Entregador entregadorNovo){
        entregadores.add(entregadorNovo);
    }
    
    public static void update(Entregador entregadorNovo){
        for(Entregador e: entregadores){
            if(e.getNome().equals(entregadorNovo.getNome())){
                e.setEmail(entregadorNovo.getEmail());
                e.setTelefone(entregadorNovo.getTelefone());
                e.setSenha(entregadorNovo.getSenha());
            }
        }
    }
    
    public static Entregador read(String nome){
        for(Entregador e: entregadores){
            if(e.getNome().equals(nome)){
                return e;
            }
        }
        return null;
    }
    
    public static void delete(Entregador entregadorNovo){
        entregadores.remove(entregadorNovo);
    }
    
    public static List<Entregador> readAll(){
        return entregadores;
    }
}
