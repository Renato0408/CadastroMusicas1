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
public class Album {
    private String nome;
    private int ano;
    private int id;

    public Album(String nome, int ano, int id) {
        this.nome = nome;
        this.ano = ano;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

     public void setNome(String nome) {
        this.nome = nome;
    }
     
    public int getAno() {
        return ano;
    }
 
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void imprimir(){
        System.out.println("nome ==> "+this.nome);
    } 
}