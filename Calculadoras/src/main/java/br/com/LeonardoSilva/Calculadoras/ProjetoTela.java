package br.com.LeonardoSilva.Calculadoras;

import javax.swing.JOptionPane;

public class ProjetoTela {
	
	static String nomePessoa;

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		nomePessoa = digiteSeuNome();
		mostraAvisoNaTela();
	}

	public static void mostraAvisoNaTela() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Ola Mundo - " + nomePessoa);
	}
	
	public static String digiteSeuNome() {
		return JOptionPane.showInputDialog("Digite seu nome"); 
	}
}
