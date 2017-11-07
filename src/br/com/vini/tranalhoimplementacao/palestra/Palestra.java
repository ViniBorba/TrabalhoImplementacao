package br.com.vini.tranalhoimplementacao.palestra;

import java.util.Scanner;

import br.com.vini.tranalhoimplementacao.arquivoscsv.LeitorDeArquivos;


public class Palestra {
	
	//dados tem que vir do arquivo lido
	public String sala = null;
	private String hora;
	private String titulo;
	String resumoDaPalestra;
	
	private Palestrante palestra;
	
	//COnstrutor de Palestra
	public Palestra(Scanner arquivoComDados){
		
		//arquivoComDados.useDelimiter("[,\n]");
		
		//this.sala = arquivoComDados.next();
		
		while(arquivoComDados.hasNext()){
			arquivoComDados.useDelimiter("[,\n]");
			
			if(this.sala == null)
			
			this.sala = arquivoComDados.next();
		}
		
		sala = this.sala;
		hora = this.hora;
		titulo = this.titulo;
		resumoDaPalestra = this.resumoDaPalestra;
		
		
	}
	
	public String toString(){
		return sala;
	}
	
	
	public String getSala() {
		return sala;
	}
	
	
	
	
	
	public static void main(String[] args){
		
		LeitorDeArquivos carregaPalestra = new LeitorDeArquivos("/home/vini/Imagens/palestras.csv");
		
		Palestra palestra1 = new Palestra(carregaPalestra.getArquivo());
		
		System.out.println(palestra1.getSala());
		
		/*
		while(carregaPalestra.facaAte()){
		System.out.println(carregaPalestra.toString());
		}
		*/
		
	}
	
	
}
