package br.com.vini.tranalhoimplementacao.palestra;

import br.com.vini.tranalhoimplementacao.arquivoscsv.LeitorDeArquivos;


public class Palestra {
	
	//dados tem que vir do arquivo lido
	//private String sala;
	private int hora;
	private String titulo;
	private String resumoDaPalestra;
	
	private Palestrante palestra;
	
	//LeitorDeArquivos carregaPalestra = new LeitorDeArquivos("endereco");
	
	
	public static void main(String[] args){
		String sala;
		LeitorDeArquivos carregaPalestra = new LeitorDeArquivos("/home/vini/Imagens/palestras.csv");

		//carregaPalestra.facaAte();
		sala = carregaPalestra.leiaAteVirgula();
		//System.out.println(carregaPalestra.leiaAteVirgula());
		System.out.println(sala);
		
		
	}
	
	
}
