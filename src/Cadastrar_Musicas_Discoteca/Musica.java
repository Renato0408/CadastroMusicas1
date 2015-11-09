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

public class Musica {
    private String nome;
    private int nota;
    private int duracao;
    private int id;

    public Musica(String nome, int nota, int duracao, int id) {
        this.nome = nome;
        this.nota = nota;
        this.duracao = duracao;
        this.id = id;
         
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

       
    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getNota(){
        return nota;
    }
     public void setNota(int nota) {
        this.nota = nota;
    }
    public int getDuracao(){
        return duracao;
    }
     public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

     
   
    public void imprimir(){
        System.out.println("nome ==> "+this.nome);
        
    }
    
	  
  }
                  



