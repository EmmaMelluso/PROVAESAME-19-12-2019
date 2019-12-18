package Prova.it;
import Entità.it.*;

import java.time.LocalDate;
import java.time.Month;

import Control.it.*;

public class Main {

	public static void main(String[] args) {
		
		GestioneCorsi g1= new GestioneCorsi();
		GestioneAppelli a1= new GestioneAppelli();
		
		
		Data d1= new Data(LocalDate.of(2020, Month.FEBRUARY, 22), Tipo_Prova.CALCOLATORE,3);
		Data d2= new Data(LocalDate.of(2020, Month.FEBRUARY, 3), Tipo_Prova.ORALE,4);
		Data d3= new Data(LocalDate.of(2020, Month.MARCH, 28), Tipo_Prova.SCRITTA, 5);
		
		Studente s1= new Studente("EMMA","MELLUSO", "N46004673");
		Studente s2= new Studente("GENNARO", "MELLUSO", "N48008989");
		Studente s3= new Studente("MARIO", "ROSSI", "N30000899");
		
		
		Corso analisi1= g1.crea_corso("ANALISI1", "DE MAIO",9);
		Corso fisica1= g1.crea_corso("FISICA1", "ANDREONE", 9);
		Corso fondamenti_info= g1.crea_corso("FONDAMENTI DI INFORMATICA", "MARESCA", 9);
		
		
		
		
		
		//g1.visualizza_corsi();
		
		Appello uno=a1.crea_appello(fisica1);
		Appello due=a1.crea_appello(fisica1);
		Appello tre=a1.crea_appello(fondamenti_info);
		Appello quattro=a1.crea_appello(analisi1);
		
		
		a1.aggiungi_data(uno, d3);
		a1.aggiungi_data(due, d1);
		a1.aggiungi_data(uno, d1);
		a1.aggiungi_data(quattro, d2);
		a1.aggiungi_data(tre, d3);
		
		//a1.appelli_disponibili();
		
		a1.effettua_prenotazione(s1, quattro);
		a1.effettua_prenotazione(s2, quattro);
		a1.effettua_prenotazione(s3, due);
		a1.effettua_prenotazione(s2, tre);
		a1.effettua_prenotazione(s3, due);
		a1.effettua_prenotazione(s1, due);
		
		a1.visualizza_prenotati(due);
		a1.visualizza_prenotati(quattro);
		
		
		
	}

}
