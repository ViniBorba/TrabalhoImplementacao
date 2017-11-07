package br.com.vini.tranalhoimplementacao.arquivoscsv;

import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LeitorDeArquivos {
	
	private Scanner arquivo = null;
	
	
	/*
	LeitorDeArquivos(String endereco) throws FileNotFoundException{
		arquivo = new Scanner(new BufferedReader(new FileReader(endereco)));
	}
	*/
	
	public LeitorDeArquivos(String endereco){
		try {
			
				this.arquivo = new Scanner(new BufferedReader(new FileReader(endereco)));
				
				this.arquivo.useDelimiter("[,\n]");
			
			} catch (java.io.FileNotFoundException nada) {
			System.out.println("Falha: "+ nada);
			}
	}
	
	
	
	public boolean facaAte(){
		return this.arquivo.hasNext();//hasNext() boolean que verefica se existe próxima token
	}
	
	public String pulaUmaLinha(){
		return this.arquivo.nextLine();
	}
	
	/*
	public String leiaAteVirgula(){
		return arquivo.findInLine(",");
	}
	*/
	
	public Scanner leiaAteVirgula(){
		return this.arquivo.useDelimiter("[,\n]");
	}
	
	public Scanner getArquivo(){
		return this.arquivo;
	}
	
	//Vou subscrever o metodo toString, eu acredito que não seja a melhor maneira
	//de fazer o que quero, mas foi o que consegui pensar....
	@Override
	public String toString(){
		//o metodo next() faz voltar uma String
		return arquivo.next();
	}
	

}
