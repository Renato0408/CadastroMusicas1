package Cadastrar_Musicas_Discoteca;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Principal {

	public static void main(String[] args) {
            String nome;
            int nota,duracao,ano;
            Genero g;
            Artista a;
            Album l;
            Musica m;
		//==============================
		//Exemplo de inserção de 1 Genero SGBD
		//==============================
		Genero r = new Genero ("Rock");
		if(Conexaobd.inserirGenero(r)!=0) {
			System.out.println("Genero inserido sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
                
                Genero s = new Genero ("Sertanejo");
		if(Conexaobd.inserirGenero(s)!=0) {
			System.out.println("Genero inserido sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
		
                Genero re = new Genero ("Funk");
		if(Conexaobd.inserirGenero(re)!=0) {
			System.out.println("Genero inserido sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
                
		//==============================
		//Exemplo de inserção de outro Genero no SGBD
		//==============================
                 
                nome = ("Bon jove");
		Artista m1 = new Artista(nome,1);
		if(Conexaobd.inserirArtista(m1)!=0) {
			System.out.println("Artista  inserida com sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
                
                nome =("Henrique e Diego");
                Artista m2 = new Artista(nome,2);
		if(Conexaobd.inserirArtista(m2)!=0) {
			System.out.println("Artista  inserida com sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
                nome =("Mc´Phelipinho");
                Artista m4 = new Artista(nome,3);
		if(Conexaobd.inserirArtista(m4)!=0) {
			System.out.println("Artista  inserida com sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
                
                
                nome = ("Closse");
                Album j3 = new Album(nome,2006,1);
		if(Conexaobd.inserirAlbum(j3)!=0) {
			System.out.println("Album  inserida com sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
                
                 nome = ("estrelas");
                Album j1 = new Album(nome,2001,2);
		if(Conexaobd.inserirAlbum(j1)!=0) {
			System.out.println("Album  inserida com sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
                
                 nome = ("para sempre");
                Album j2 = new Album(nome,2005,3);
		if(Conexaobd.inserirAlbum(j2)!=0) {
			System.out.println("Album  inserida com sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
                nome=("Numb");
                Musica c1 = new Musica (nome,8,10,1);
		if(Conexaobd.inserirMusica(c1)!=0) {
			System.out.println("Musica inserida com sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
                nome=("Hoje eu sou seu bem");
                Musica c2 = new Musica (nome,10,12,2);
		if(Conexaobd.inserirMusica(c2)!=0) {
			System.out.println("Musica  inserida com sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
                nome=("o muleque é liso");
                Musica c3 = new Musica (nome,9,11,3);
		if(Conexaobd.inserirMusica(c3)!=0) {
			System.out.println("Musica  inserida com sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
		
		ResultSet res = Conexaobd.relatorio();
		if(res!=null) {
			try {
				while(res.next()) {
					System.out.println("genero: "+res.getString("nome"));
//                                       System.out.println("artista: "+res.getString("nome"));
//                                        System.out.println("album: "+res.getString("nome"));
//                                        System.out.println("musica: "+res.getString("nome"));
					System.out.println("==========");
				}
			} catch (SQLException e) {
				System.out.println("Problema para exibir registros!");
			}
		} else {
			System.out.println("A pesquisa não retornou nenhum registro!");
		}

 }
}
