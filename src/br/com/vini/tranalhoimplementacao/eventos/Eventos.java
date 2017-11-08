package br.com.vini.tranalhoimplementacao.eventos;

import br.com.vini.tranalhoimplementacao.certificado.Certificado;
import br.com.vini.tranalhoimplementacao.palestra.Palestra;
import br.com.vini.tranalhoimplementacao.participantes.Participantes;

public class Eventos {
	
	private int data;//Tem que vim do arquivo csv
	
	Palestra palestra;//talvez um arrayList, ou , pq cada palestra vai ser uma lista, um arquivo csv
	
	Participantes participantes;//Participantes por palestra? Ou do evento todo? Se for do evento vai ter que ter um arrayList Tambem
	
	Certificado certificado;//Certificado vai ser uma classe asbtrata

	//Um evento tem palestras, tem participantes, palestrantes

}
