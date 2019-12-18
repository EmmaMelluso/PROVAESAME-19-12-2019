package Control.it;

import java.util.*;

import Entità.it.*;

public class GestioneAppelli {
	Integer id;
	
	ArrayList<Appello> elenco_appelli= new ArrayList<Appello>();
	ArrayList<Prenotazione> prenotazioni= new ArrayList<Prenotazione> ();
	GestioneCorsi c1=new GestioneCorsi();
	ArrayList<Corso> elenco_corsi=c1.corsi;
	
	public GestioneAppelli() {
		
	}
	
	public Appello crea_appello(Corso c) {
		
		
		Appello x= new Appello(c);
		elenco_appelli.add(x);
		
		
		return x;
	}
	
	public void aggiungi_data(Appello a, Data d) {
		a.add_data(d);
	}
	
	public void appelli_disponibili() {
		if(elenco_appelli.size()>0) {
			for(Iterator<Appello> i = elenco_appelli.iterator(); i.hasNext();) {
				Appello x= i.next();
				System.out.println(x.toString());
			} 
				
			
		} else {
			System.out.println("---NESSUN APPELLO DISPONIBILE---");
		}
	}
	
	
	//FARE CONTROLLO SE UNA PERSONA SI PRENOTA PIU VOLTE AD UNO STESSO APPELLO
	public ArrayList<Prenotazione> effettua_prenotazione(Studente s, Appello a) {
		Prenotazione p = new Prenotazione(s,a);
		for(Iterator<Appello> i=elenco_appelli.iterator(); i.hasNext();) {
			Appello x=i.next();
			if(x==a) {
				prenotazioni.add(p);
				controllo_prenotati(prenotazioni);
				System.out.println("---PRENOTAZIONE AVVENUTA CON SUCCESSO---");
			}
		} return prenotazioni;
	}
	
	private void controllo_prenotati(ArrayList<Prenotazione> p) {
		
		
		for(int i=0; i<prenotazioni.size(); i++) {
			for(int x=(i+1); x<prenotazioni.size(); x++){
				if(p.get(i).get_studenteprenotato()==p.get(x).get_studenteprenotato() && p.get(i).get_appelloprenot()==p.get(x).get_appelloprenot()) {
					p.remove(p.get(i));
				}
				}
			}
	}
	public ArrayList<Prenotazione> visualizza_prenotati(Appello a) {
		
		System.out.println("ALL' APPELLO "+ a.get_id()+" SI SONO PRENOTATI I SEGUENTI STUDENTI: ");
		ArrayList<Prenotazione> prenotati_app= new ArrayList<Prenotazione>();
		for(Iterator<Prenotazione> i = prenotazioni.iterator(); i.hasNext();) {
			Prenotazione p= i.next();
			if(p.get_appelloprenot()==a) {
				prenotati_app.add(p);
				System.out.println(p.get_studenteprenotato().toString());
			} 
		}return prenotati_app;
	} 
}
