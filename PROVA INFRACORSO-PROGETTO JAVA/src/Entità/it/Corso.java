package Entità.it;

public class Corso {

	
	private String nome_corso;
	private String nome_docente;
	private int CFU;
	
	//COSTRUTTORE DI DEFAULT
	public Corso() {
		nome_corso="";
		nome_docente="";
		CFU=0;
	}
	
	//COSTRUTTORE CON PARAMETRI
	public Corso(String nome_c, String nome_d, int cfu) {
		this.nome_corso=nome_c;
		this.nome_docente=nome_d;
		this.CFU=cfu;
	}
	
	//METODI GET
	public String get_nomecorso() {
		return nome_corso;
	}
	
	public String get_nomedocente() {
		return nome_docente;
	}
	
	public int get_CFU() {
		return CFU;
	}

	
	//METODI SET
	
	public void set_nomecorso(String c) {
		nome_corso=c;
		
	}
	
	public void set_nomedocente(String d) {
		nome_docente=d;
	}
	
	public void set_CFU(int f) {
		CFU=f;
	}
	
	//METODO TOSTRING PER CONVERTIRE L'OGGETTO CORSO IN UNA STRINGA
	
	public String toString() {
		return ("NOME_CORSO: " +nome_corso + " NOME_DOCENTE: " + nome_docente + " CFU: " + CFU);
	}
}
