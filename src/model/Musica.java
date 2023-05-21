/*
RESUMO      : Classe do Objeto Música, com os métodos meio protegidos
PROGRAMADORA: Luiza Felix
DATA        : 20/05/2023
 */

package model;

public class Musica {
	
	private String musica, artista;
	private int duracao;
	
	public Musica(String musica, String artista, int duracao) {
		this.musica = musica;
		this.artista = artista;
		this.duracao = duracao;
	}
	
	public String nome() {
//		get de musica
		return musica;
	}
	
	public String artista() {
//		get de artista
		return artista;
	}
	
	public int duracao() {
//		get de duração
		return duracao;
	}
	

}
