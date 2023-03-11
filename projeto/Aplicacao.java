package projeto;

import projeto.modelo.Tabuleiro;
import projeto.visao.TabuleiroConsole;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro (9,9,10);
		new TabuleiroConsole(tabuleiro);
		
	}
}