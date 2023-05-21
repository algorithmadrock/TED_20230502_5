/*
RESUMO      : Classe de controle da Playlist
PROGRAMADORA: Luiza Felix
DATA        : 20/05/2023
 */

package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import br.edu.fateczl.listas.Lista;
import model.Musica;

public class Controller {
	
	public static Lista addtoplaylist() throws Exception {
		
//		leitura do arquivo 
		File setlist = new File("C:\\sistemas operacionais i\\setlist.csv");
		FileInputStream fluxo = new FileInputStream(setlist);
		InputStreamReader leitor = new InputStreamReader(fluxo);
		BufferedReader buffer = new BufferedReader(leitor);
		String linha = buffer.readLine(); //pular o cabeçalho
		
		
		Lista playlist = new Lista();
		
		while(linha!=null) {
			String[] dados = linha.split(";");
			Musica musica = new Musica(dados[0], dados[1],Integer.parseInt(dados[2]));
			
			if(playlist.vazia()) {
				playlist.addfirst(musica);
			} else {
				playlist.addlast(musica);
			}
			System.out.println("#" + playlist.size() + "\t" + musica.nome() + "\t" + musica.artista() + "\t" + musica.duracao() + "s.");
			linha = buffer.readLine();
		}
		return playlist;
	}
	
	public static void removefromplaylist(Lista playlist, int track) throws Exception{
		Musica musica = (Musica) playlist.get(track-1);
		playlist.remove(track-1);
		System.err.println("#" + track + "\t" + musica.nome() + "\t" + musica.artista() + "\t Foi removida");
	}
	
	
	public static void playplaylist(Lista playlist) throws Exception {
		while(!playlist.vazia()) {
			Musica musica = (Musica) playlist.get(0);
			System.out.println("TOCANDO" + "\t" + musica.nome() + "\t" + musica.artista() + "\t" + musica.duracao() + "s.");
			Thread.sleep(musica.duracao()*1000);
			playlist.removefirst();
		}
		
		
		
		
	}
	
	
	
	
	
	

}
