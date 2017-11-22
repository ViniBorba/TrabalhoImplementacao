package br.com.vini.tranalhoimplementacao.participantes;

import java.util.Scanner;

import br.com.vini.tranalhoimplementacao.arquivoscsv.LeitorDeArquivos;

public class Participantes {

	//dados vem do arquivo que vou ler
	private String nomeDoParticipante;
	private String emailDoParticipante;
	
	private int n = 30;
	Participantes participante[] = new Participantes[n];
	
	
	
	public Participantes(Scanner arquivoComDados){
	
		
		for (int i = 0;arquivoComDados.hasNext();i++ ){

			participante[i].nomeDoParticipante = arquivoComDados.next();
			participante[i].emailDoParticipante = arquivoComDados.next();
			
		}
	
	}
	
	
	@Override
	public String toString(){
		for (int i = 0;i < 30;i++ ){
			return participante[0].getNomeDoParticipante() + " " + participante[0].getEmailDoParticipante();
		}	
		return null;
	}
	
	
	public String getNomeDoParticipante() {
		return nomeDoParticipante;
	}

	public void setNomeDoParticipante(String nomeDoParticipante) {
		this.nomeDoParticipante = nomeDoParticipante;
	}

	public String getEmailDoParticipante() {
		return emailDoParticipante;
	}

	public void setEmailDoParticipante(String emailDoParticipante) {
		this.emailDoParticipante = emailDoParticipante;
	}
	
	
	
	public static void main(String[] args){
		
		LeitorDeArquivos participantesDaPalestra1 = new LeitorDeArquivos("/home/vini/Documentos/palestras.csv");
		
		Participantes participantesDaPalestra = new Participantes(participantesDaPalestra1.getArquivo());
		
		System.out.println(participantesDaPalestra);
	}
	
	
}
