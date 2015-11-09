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
import java.sql.*;

public class Conexaobd {
	
	//Método para Conectar ao Banco de Dados Local chamado 'cadastro', usuário 'root' e senha em branco!
	public static Connection conectar() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/bibliotecamusical", "root", "");
			return(c);
		} catch (ClassNotFoundException e) {
			System.out.println("Problema na configuração do Driver do MySQL!");
		} catch (SQLException e) {
			System.out.println("Problema na conexão com o banco de dados!");
		}
		return(null);
	}
	
	//Retorna o relatório contendo todas as Pessoa do Banco
	public static ResultSet relatorio() {
		Connection con = conectar();
		Statement st;
		try {
			st = con.createStatement();
			return(st.executeQuery("Select * from `album`, `artista`,`genero`,`musica` where(artista.id=album.artista_id) and (album.id=musica.album_id)and (musica.id=genero.id);"));
		} catch (SQLException e) {
			System.out.println("Problema na consulta à tabela genero!");
		}
		return(null);
	}
	
	//Método para inserir no banco uma Pessoa passada como parâmetro
	public static int inserirGenero(Genero g) {
		String insercao = "INSERT INTO genero (nomeGe) VALUES ('"+g.getNome()+"');";
		Connection con = conectar();
		Statement st;
		try {
			st = con.createStatement();
			return(st.executeUpdate(insercao));
		} catch (SQLException e) {
			System.out.println("Problema na inserção da genero!, ou ja existe");
		}
		return(0);
	}
	public static int inserirArtista(Artista a) {
		String insercao = "INSERT INTO artista(nomeAr,genero_id ) VALUES ('"+a.getNome()+"','"+a.getId()+"');";
		Connection con = conectar();
		Statement st;
		try {
			st = con.createStatement();
			return(st.executeUpdate(insercao));
		} catch (SQLException e) {
			System.out.println("Problema na inserção da artista!, ou ja existe");
		}
		return(0);
	}
        
         public static int inserirAlbum(Album l) {
		String insercao = "INSERT INTO album (nomeAl, ano, artista_id ) VALUES ('"+l.getNome()+"','"+l.getAno()+"','"+l.getId()+"');";
		Connection con = conectar();
		Statement st;
		try {
			st = con.createStatement();
			return(st.executeUpdate(insercao));
		} catch (SQLException e) {
			System.out.println("Problema na inserção da artista!");
		}
		return(0);
	}
        public static int inserirMusica(Musica m) {
		String insercao = "INSERT INTO musica (nome, nota, duracao, album_id ) VALUES ('"+m.getNome()+"','"+m.getNota()+"','"+m.getDuracao()+"','"+m.getId()+"');";
		Connection con = conectar();
		Statement st;
		try {
			st = con.createStatement();
			return(st.executeUpdate(insercao));
		} catch (SQLException e) {
			System.out.println("Problema na inserção da Musica!, ou ja existe");
		}
		return(0);
	}

	//Método para Atualizar os campos no banco uma Pessoa passada como parâmetro, buscando-a pelo nome atual!!!
	public static int atualizar(Genero g, String n) {
		String atualizacao = "UPDATE `genero` SET `nome` = '"+g.getNome()+"' WHERE `nome` = '"+n+"';";
		Connection con = conectar();
		Statement st;
		try {
			st = con.createStatement();
			return(st.executeUpdate(atualizacao));
		} catch (SQLException e) {
			System.out.println("Problema na atualização da genero!");
		}
		return(0);
	}

   /* public static ResultSet relatorio(Genero g) {
		Connection con = conectar();
		Statement st;
		try {
			st = con.createStatement();
			return(st.executeQuery("SELECT * FROM genero;"));
		} catch (SQLException e) {
			System.out.println("Problema na consulta à tabela genero!.");
		}
		return(null);
	}
  */	
}

