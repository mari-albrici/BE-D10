package catalogoBibliografico;

public abstract class PubblicazioniCartacee {

	protected long ISBN;
	protected String titolo;
	protected int annoPubblicazione;
	protected int pagine;
	
	
	protected String getTitolo() {
		return titolo;
	}
	
	protected int getAnnoPubblicazione() {
		return annoPubblicazione;
	}
	
	protected int getPagine() {
		return pagine;
	}
	
	protected long getISBN() {
		return ISBN;
	}
	
	public void addLibro(Libro nomePubblicazione) {
	}
	
	public void addRivista(Rivista nomePubblicazione) {	
	}
	
	
}
