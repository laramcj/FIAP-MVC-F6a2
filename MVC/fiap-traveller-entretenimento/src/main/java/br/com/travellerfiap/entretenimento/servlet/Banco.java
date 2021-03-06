package br.com.travellerfiap.entretenimento.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
   private static List<Entretenimento> listaEntretenimento = new ArrayList<Entretenimento>();
   private static Integer chaveSequencial = 1;
	
	static {
		Entretenimento entretenimento1 = new Entretenimento();
		entretenimento1.setNome("Teatro Municipal");
		entretenimento1.setId(chaveSequencial++);
		entretenimento1.setDescricao("Theatro Municipal, 110 anos de hist?ria s? fazem sentido com voc? na plateia.");
		entretenimento1.setLocalizacao("Pra?a Ramos de Azevedo, s/n - Rep?blica, S?o Paulo - SP");
		entretenimento1.setHorarioFuncionamento("Das 10h ?s 19h");
		entretenimento1.setUrlSiteOficial("https://theatromunicipal.org.br/pt-br/");
		entretenimento1.setAvaliacao(5);
		
		Entretenimento entretenimento2 = new Entretenimento();
		entretenimento2.setNome("Bixiga");
		entretenimento2.setId(chaveSequencial++);
		entretenimento2.setDescricao("O Bixiga ? entendido como um dos mais tradicionais bairros da cidade de S?o Paulo, embora na divis?o administrativa da cidade ele n?o exista oficialmente como tal.");
		entretenimento2.setLocalizacao("Bairro Bixiga, S?o Paulo - SP");
		entretenimento2.setHorarioFuncionamento("todos os dias");
		entretenimento2.setUrlSiteOficial("http://www.portaldobixiga.com.br/historia/");
		entretenimento2.setAvaliacao(3);
		
		Entretenimento entretenimento3 = new Entretenimento();
		entretenimento3.setNome("Pra?a Benedito Calixto");
		entretenimento3.setId(chaveSequencial++);
		entretenimento3.setDescricao("A Pra?a Benedito Calixto em Pinheiros ? um importante polo cultural da cidade.");
		entretenimento3.setLocalizacao("Pra?a Benedito Calixto - Pinheiros, S?o Paulo - SP");
		entretenimento3.setHorarioFuncionamento("aos finais de semana");
		entretenimento3.setUrlSiteOficial("https://www.instagram.com/feirabeneditocalixto.oficial/");
		entretenimento3.setAvaliacao(5);
		
		Entretenimento entretenimento4 = new Entretenimento();
		entretenimento4.setNome("Aut?dromo de Interlagos");
		entretenimento4.setId(chaveSequencial++);
		entretenimento4.setDescricao("Aut?dromo Jos? Carlos Pace ? um aut?dromo municipal localizado no distrito de Cidade Dutra, na cidade de S?o Paulo, Brasil. Pela proximidade com o bairro de Interlagos ? popularmente chamado de Aut?dromo de Interlagos.");
		entretenimento4.setLocalizacao("Av. Sen. Teot?nio Vilela, 261 - Interlagos, S?o Paulo - SP,");
		entretenimento4.setHorarioFuncionamento("todos os dias");
		entretenimento4.setUrlSiteOficial("https://autodromodeinterlagos.com.br/");
		entretenimento4.setAvaliacao(2);
		
		Entretenimento entretenimento5 = new Entretenimento();
		entretenimento5.setNome("Escape 60");
		entretenimento5.setId(chaveSequencial++);
		entretenimento5.setDescricao("O Escape 60 ? uma nova forma de entretenimento inteligente, agrad?vel e diferente, voltada para fam?lias, amigos e equipes de trabalho.");
		entretenimento5.setLocalizacao("Rua Henrique Schaumann, 717 - Pinheiros, S?o Paulo - SP");
		entretenimento5.setHorarioFuncionamento("Das 10h ?s 22h");
		entretenimento5.setUrlSiteOficial("https://escape60.com.br/unidades-escape60/sao-paulo-henrique-schaumann/");
		entretenimento5.setAvaliacao(2);
		
		listaEntretenimento.add(entretenimento1);
		listaEntretenimento.add(entretenimento2);
		listaEntretenimento.add(entretenimento3);
		listaEntretenimento.add(entretenimento4);
		listaEntretenimento.add(entretenimento5);
		
	}

	public List<Entretenimento> getEntretenimento() {
		
		return listaEntretenimento;
	}

	public void adiciona(Entretenimento entretenimento) {
		
		listaEntretenimento.add(entretenimento);
		
	}

	public void removeEntretenimento(Integer id) {
		
		Iterator<Entretenimento> it = listaEntretenimento.iterator();
		
		while (it.hasNext()) {
			Entretenimento entretenimento = (Entretenimento) it.next();
			if(entretenimento.getId()==id) {
				it.remove();
			}
			
			
		}
		
	}

	public Entretenimento buscaPorId(Integer id) {
		
		for (Entretenimento entretenimento : listaEntretenimento) {
			if(entretenimento.getId()==id) {
				return entretenimento;
			}
		}
		return null;
		
	}
}
   
