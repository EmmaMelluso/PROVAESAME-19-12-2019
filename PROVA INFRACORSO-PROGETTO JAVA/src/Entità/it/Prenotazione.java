package Entità.it;

public class Prenotazione {

	
	private Studente s;
	private Appello a;
	
	
	public Prenotazione() {
		
	}
	
	public Prenotazione(Studente s1, Appello a1) {
		this.s=s1;
		this.a=a1;
	}
	
	public Studente get_studenteprenotato() {
		return s;
	}
	
	public Appello get_appelloprenot() {
		return a;
	}
	
	public void set_studentep(Studente s) {
		this.s=s;
	}
	
	public void set_appellop(Appello a) {
		this.a=a;
	}

}
