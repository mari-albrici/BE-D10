package catalogoBibliografico;

public class Rivista extends PubblicazioniCartacee{
	
	private String periodicità;
	
	public Rivista(long ISBN, String titolo, int annoPubblicazione, int pagine, String periodicità) {
		this.ISBN = ISBN;
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.pagine = pagine;
		this.periodicità = periodicità;
	}

	public void getInfoRivista() {
		System.out.println(titolo + ", pubblicato nel " + annoPubblicazione + " " + periodicità + ", ha un totale di" + pagine + " pagine (il suo codice ISBN è: " + ISBN + ").");
	}
	
	public String getPeriodicità() {
		return periodicità;
	}
	
	@Override
    public String toString() {
        return super.toString() + ", Periodicità " + periodicità ;
    }
}
