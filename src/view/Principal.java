/*
 RESUMO		 : Menu principal da minha playlist
 PROGRAMADORA: Luiza Felix
 DATA		 : 20/05/2023
 */

package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.listas.Lista;
import controller.Controller;

public class Principal {

	public static void main(String[] args) throws Exception {
		Lista playlist = new Lista();
		int opcao = 0;
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("1.Carregar a playlist\n\tEsse módulo já possui faixas pré-determinadas em um arquivo.csv que está commitado na pasta 'biblioteca' deste projeto\n2. Remover Faixa\n3. Executar playlist\nPara SAIR digite 0;"));
			
			switch(opcao) {
			case 1:
				playlist = Controller.addtoplaylist();
				break;
			case 2:
				int track = Integer.parseInt(JOptionPane.showInputDialog("Digite uma faixa para ser removida:"));
				Controller.removefromplaylist(playlist, track);
				break;
			case 3:
				Controller.playplaylist(playlist);
				break;
			case 0:
				System.out.println("Programa finalizado com sucesso!");
			}
		}	while(opcao!=0);

	}
}
