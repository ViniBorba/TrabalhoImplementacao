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
			arquivo = new Scanner(new BufferedReader(new FileReader(endereco)));
		} catch (java.io.FileNotFoundException nada) {
			System.out.println("Falha: "+ nada);
		}
	}
	
	
	
	public boolean facaAte(){
		return arquivo.hasNext();//hasNext() boolean que verefica se existe próxima token
	}
	
	public String pulaUmaLinha(){
		return arquivo.nextLine();
	}
	
	public String leiaAteVirgula(){
		return arquivo.findInLine(",");
	}

}
