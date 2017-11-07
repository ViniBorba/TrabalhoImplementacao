package br.com.vini.tranalhoimplementacao.palestra;

import br.com.vini.tranalhoimplementacao.arquivoscsv.LeitorDeArquivos;


public class Palestra {
	
	//dados tem que vir do arquivo lido
	String sala;
	private String hora;
	private String titulo;
	String resumoDaPalestra;
	
	private Palestrante palestra;
	
	public Palestra(String sala, String hora, String titulo, String resumoDaPalestra ){
		sala = this.sala;
		hora = this.hora;
		titulo = this.titulo;
		resumoDaPalestra = this.resumoDaPalestra;
		
		
	}
	
	public String toString(){
		return sala;
	}
	
	public static void main(String[] args){
		
		LeitorDeArquivos carregaPalestra = new LeitorDeArquivos("/home/vini/Imagens/palestras.csv");
		
		Palestra palestra1 = new Palestra(carregaPalestra.getArquivo().next(), carregaPalestra.getArquivo().next(), carregaPalestra.getArquivo().next(), carregaPalestra.getArquivo().next());
		
		System.out.println(palestra1);
		
		/*
		while(carregaPalestra.facaAte()){
		System.out.println(carregaPalestra.toString());
		}
		*/
		
	}
	
	
}
