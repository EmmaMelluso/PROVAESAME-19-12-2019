package Entità.it;


import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Appello {

	
	private static final AtomicInteger contatore= new AtomicInteger(0); //VEDERE QUESTO NUOVO TIPO
	private Integer ID_appello;
	private Corso var;		//OGNI APPELLO E' RELATIVO AD UN CORSO
	
	
	
	private ArrayList<Data> data= new ArrayList<Data>();	//ASSOCIO AD UN APPELLO UNA O PIU DATE
															//TRAMITE UN'ARRAY LIST
	
	
	
	
	//COSTRUTTORE DI DEFAULT
	public Appello() {
		
	}
	
	//COSTRUTTORE CON PARAMETRI
	public Appello(Corso c) {		//VEDERE AUTOINCREMENTO ID
		
		this.var=c;
		ID_appello=contatore.getAndIncrement();
	}
	
	//METODI GET
	public Integer get_id() {
		return ID_appello;
	}
	
	public Corso get_Corso() {
		return var;
	}
	
	
	//METODI SET
	public void set_id(Integer id) {
		ID_appello=id;
	}
	
	public void set_corso(Corso c) {
		this.var=c;
	}
	
	//FUNZIONE CHE MI PERMETTE DI ASSEGNARE AD UN APPELLO UNA O PIU DATE
	public void add_data(Data d) {
		data.add(d);
	}
	
	//FUNZIONE CHE MI RESTITUISCE LE DATE ASSOCIATE AD UN DETERMINATO APPELLO
	public ArrayList<Data> get_date(){
		return data;
	}
	
	//METODO TO STRING
	public String toString() {
		return ("ID APPELLO: " + ID_appello + " CORSO: " + var + " DATE: " + data);
	}
	
}
