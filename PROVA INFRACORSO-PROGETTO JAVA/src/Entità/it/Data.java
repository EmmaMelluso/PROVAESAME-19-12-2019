package Entità.it;

import java.time.LocalDate;


public class Data {
	
	private LocalDate data;
	private Tipo_Prova tipo; //ENUM -- AD UNA DATA ASSOCIO IL TIPO DI PROVA
	private int codice_aula;
	
	public Data() {
	
	}
	
	public Data(LocalDate d, Tipo_Prova t, int codice) {
		this.data=d;
		this.tipo=t;
		this.codice_aula=codice;
		
	}

	public LocalDate get_data() {
		return data;
	}
	
	public Tipo_Prova get_tipo() {
		return tipo;
	}
	
	public int get_codiceaula() {
		return codice_aula;
	}
	public void set_data(LocalDate d) {
		data=d;
	}
	
	public void set_tipo(Tipo_Prova t) {
		this.tipo=t;
	}
	
	public void set_codiceaula(int c) {
		this.codice_aula=c;
	}
	
	//METODO TO STRING PER LA DATA
	public String toString() {
		return ("DATA: "+ data + " TIPO PROVA: "+ tipo); 
	}
	
	
}
