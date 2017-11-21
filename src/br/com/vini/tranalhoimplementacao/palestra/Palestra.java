package br.com.vini.tranalhoimplementacao.palestra;

import java.util.Scanner;

import br.com.vini.tranalhoimplementacao.arquivoscsv.LeitorDeArquivos;


public class Palestra {
	
	//dados tem que vir do arquivo lido
	public String sala;
	private String hora;
	private String titulo;
	String resumoDaPalestra;
	
	private Palestrante palestra;
	
	//Construtor de Palestra
	public Palestra(Scanner arquivoComDados){
		
		arquivoComDados.useDelimiter("[,\n]");
			
			this.sala = arquivoComDados.next();
			this.hora = arquivoComDados.next();
			this.titulo = arquivoComDados.next();
			this.resumoDaPalestra = arquivoComDados.next();

	}
	
	//Subscrever o método toString()
	@Override
	public String toString(){
		return "Sala: "+sala + "\nhora: " + hora + "\ntitulo: " + titulo + "\nResumo Da Palestra: " + resumoDaPalestra;
	}
	
	
	public String getSala() {
		return sala;
	}
	
	
	
	
	
	public static void main(String[] args){
		
		LeitorDeArquivos carregaPalestra = new LeitorDeArquivos("/home/vini/Documentos/palestras.csv");
		
		Palestra palestra1 = new Palestra(carregaPalestra.getArquivo());
				
		System.out.println(palestra1.toString());
		
		/*
		while(carregaPalestra.facaAte()){
		System.out.println(carregaPalestra.toString());
		}
		*/
		
	}
	
	
}
