/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastrar_Musicas_Discoteca;

/**
 *
 * @author Renato
 */

public class Genero {
    private String nome;
    
    public Genero( String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void imprimir(){
        System.out.println("nome ==> "+this.nome);
    }
}

