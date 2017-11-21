package br.com.vini.tranalhoimplementacao.palestra;

import java.util.Scanner;

public class Palestrante {
	
	//devem vir de arquivo lido
	private String dadosDaPalestra;
	private String curriculoDoPalestrante;
	private String emailDoPalestrante;
	private String telefoneDoPalestrante;
	private String nomeDoPalestrante;

	
	public Palestrante(Scanner arquivoComDados){
		//vai o construtor igual o da Palestra que recebe arquivo lido e quebra em todas as virgulas gurdado
		arquivoComDados.useDelimiter("[,\n]");
		
		this.dadosDaPalestra = arquivoComDados.next();
		this.curriculoDoPalestrante = arquivoComDados.next();
		this.emailDoPalestrante = arquivoComDados.next();
		this.telefoneDoPalestrante = arquivoComDados.next();
		this.nomeDoPalestrante = arquivoComDados.next();
		
	}
	@Override
	public String toString(){
		return "Dados da Palestra: "+dadosDaPalestra+"\nCurriculo do Palestrante: "+curriculoDoPalestrante+"\nEmail do Palestrante: "+emailDoPalestrante+"\nTelefone do Palestrante: "+telefoneDoPalestrante+"\nNome do Palestrante: "+nomeDoPalestrante;
	}
}
