package Entità.it;

public class Studente {
	
	private String nome_studente;
	private String cognome_studente;
	private String MATRICOLA;

	
	public Studente() {
		
	}

	public Studente(String nome, String cognome, String matricola) {
		this.nome_studente=nome;
		this.cognome_studente=cognome;
		this.MATRICOLA=matricola;
		
		
	}
	
	//METODI GET
	
	public String get_nomestudente() {
		return nome_studente;
	}
	
	public String get_cognstudente() {
		return cognome_studente;
	}
	
	public String get_matricola() {
		return MATRICOLA;
	}
	
	
	
	//METODI SET
	
	public void set_nomestudente(String nome) {
		this.nome_studente=nome;
	}
	
	public void set_cognomestud(String cognome) {
		this.cognome_studente=cognome;
	}
	
	public void set_matricola(String matricola) {
		this.MATRICOLA= matricola;

	}
	
	
	//METODO TOSTRING
	
	public String toString() {
		return ("NOME_STUDENTE: "+ nome_studente + " , COGNOME_STUDENTE: "+cognome_studente+" , MATRICOLA: "+MATRICOLA );
	}
}
