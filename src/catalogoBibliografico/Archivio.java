package catalogoBibliografico;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import catalogoBibliografico.PubblicazioniCartacee;

public class Archivio {
	
	public static Logger logger = (Logger) LoggerFactory.getLogger(Archivio.class);
	

	//save on file
	//read from file
	
	
	public static List<PubblicazioniCartacee> archivio = new ArrayList<PubblicazioniCartacee>();

	
	public static void addPubblicazione(PubblicazioniCartacee nomePubblicazione) {
		archivio.add(nomePubblicazione);
	}

	public static void deleteDaISBN(long ISBNPubblicazione) {
		archivio.removeIf(pubblicazione -> pubblicazione.getISBN() == ISBNPubblicazione);
	}
	
	public static void searchDaISBN(long ISBNPubblicazione) {
		archivio.stream().filter(pubblicazione -> pubblicazione.getISBN() == ISBNPubblicazione);
	}
	
	
	public static List<PubblicazioniCartacee> searchDaAutore(String autore) {
		for(PubblicazioniCartacee pubblicazione : archivio) {
			if(((Libro) pubblicazione).getAutore() == autore) {
				logger.info("RICERCA PER " + autore + ": {}", pubblicazione.toString());
			}
		}
		return null;
	}
	

	public static List<PubblicazioniCartacee> searchDaAnno(int annoPubblicazione) {
		for(PubblicazioniCartacee pubblicazione : archivio) {
			if(pubblicazione.getAnnoPubblicazione() == annoPubblicazione) {
				logger.info("RICERCA PER " + annoPubblicazione + ": {}", pubblicazione.toString());
			} else {
				logger.info("Nessuna pubblicazione trovata per l'anno " + annoPubblicazione);
			}
		}
		return null;
	}

	public static void main(String[] args) {
		
		//********** CREAZIONE LIBRI **********
		
		Libro libro1 = new Libro(9788806242626l, "Il Vangelo secondo la Scienza", 2019, 248, "Piergiorgio Odifreddi", "Scienza");
		Libro libro2 = new Libro(9788899684693l, "Il genio non esiste (e a volte è un idiota)", 2020, 300, "Barbascura X", "Scienza");
		Libro libro3 = new Libro(9788806239831l, "Le otto montagne", 2018, 200, "Paolo Cognetti", "Fiction");
		Libro libro4 = new Libro(9788804764878l, "Fa bene o fa male? Manuale di autodifesa alimentare", 2023, 328, "Dario Bressanini", "Scienza");
		Libro libro5 = new Libro(9791280229670l, "Donne che pensano troppo", 2023, 318, "Susan Nolen-Hoeksema", "Psicologia");
		
		//********** CREAZIONE RIVISTE **********
		
		Rivista rivista1 = new Rivista(9781292110073l, "Focus", 1992, 150, "MENSILE");
		Rivista rivista2 = new Rivista(9781292110080l, "Vogue", 1892, 250, "MENSILE");
		Rivista rivista3 = new Rivista(9781447998396l, "TIME", 1923, 100, "SETTIMANALE");
		Rivista rivista4 = new Rivista(9781292110110l, "Journal of Molecular Biology", 1959, 250, "SEMESTRALE");
		Rivista rivista5 = new Rivista(9781447998617l, "Journal of Applied Physics ", 1931, 900, "SEMESTRALE");
		
		
		//********** AGGIUNTA ELEMENTO A ARCHIVIO **********
		
		addPubblicazione(libro1);
		addPubblicazione(libro2);
		addPubblicazione(libro3);
		addPubblicazione(libro4);
		addPubblicazione(libro5);
		
		addPubblicazione(rivista1);
		addPubblicazione(rivista2);
		addPubblicazione(rivista3);
		addPubblicazione(rivista4);
		addPubblicazione(rivista5);
		
		
		//********* ELIMINAZIONE ELEMENTO DA ARCHIVIO TRAMITE ISBN **********
		
//		deleteDaISBN(9788806242626l);
		
		//********** RICERCA PER AUTORE *********
		
		searchDaAutore("Barbascura X");
		
		//********** RICERCA PER ANNO *********
		
		searchDaAnno(2023);
		
	}
	
	

}
