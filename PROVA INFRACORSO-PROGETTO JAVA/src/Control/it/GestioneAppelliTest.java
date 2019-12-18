package Control.it;



import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;

import org.junit.Before;

import org.junit.Test;

import Entità.it.*;

public class GestioneAppelliTest {
	
	GestioneCorsi c;

	GestioneAppelli prenotati;
	
	
	@Before
	public void setUp() throws Exception {
		prenotati= new GestioneAppelli();	//INIZIALIZZO L'OGGETTO GESTIONE APPELLI NEL SETUP
		c=new GestioneCorsi();
	}

	@After
	public void tearDown() throws Exception {
		prenotati=null;
		c=null;
	}

	@Test
	public void test01() {
		
		//ZERO STUDENTI, ZERO PRENOTAZIONI, UN CORSO, UN APPELLO, NESSUN RISULTATO
		
		Corso c1=c.crea_corso("ANALISI", "A", 9);
		
		Appello a1=prenotati.crea_appello(c1);
		
		
		ArrayList<Prenotazione> p;
		p=prenotati.visualizza_prenotati(a1);
		
		
		assertEquals(0,p.size());
	}
	
	@Test
	public void test02() {
		
		//UNO STUDENTE UN CORSO UN APPELLO PER QUEL CORSO UNA PRENOTAZIONE UN RISULTATO
		Studente s1=new Studente();
		Corso c1=c.crea_corso("ANALISI", "A", 9);
		Appello a1=prenotati.crea_appello(c1);
		
		
		ArrayList<Prenotazione> p;
		
		prenotati.effettua_prenotazione(s1, a1);
		p=prenotati.visualizza_prenotati(a1);
		
		assertEquals(1,p.size());
	}

	
	@Test
	public void test03() {
		
		//DUE STUDENTI UN CORSO UN APPELLO PER QUEL CORSO UNA PRENOTAZIONE PER OGNI STUDENTE DUE RISULTATI
		Studente s1=new Studente("EMMA", "MELLUSO","N46004673");
		Studente s2=new Studente("LUCA", "ROSSI", "N46006589");
		Corso c1=c.crea_corso("ANALISI", "A", 9);
		Appello a1=prenotati.crea_appello(c1);
		
		
		ArrayList<Prenotazione> p;
		
		prenotati.effettua_prenotazione(s1, a1);
		prenotati.effettua_prenotazione(s2, a1);
		p=prenotati.visualizza_prenotati(a1);
		
		assertEquals(2,p.size());
	}
	
	
	
	@Test
	public void test04() {
		
		//UN CORSO ZERO APPELLI UNA PRENOTAZIONE (APPELLO SBAGLIATO) ZERO RISULTATI
		
		//Corso c1=c.crea_corso("ANALISI", "A", 9);
		
		
		
		Appello a2=new Appello(); //ALLOCO SEMPLICEMENTE UN OGGETTO APPELLO SENZA INCLUDERLO NELL'ELENCO
		
		ArrayList<Prenotazione> p;
		
		p=prenotati.visualizza_prenotati(a2);
		
		assertEquals(0,p.size());
	}
	@Test
	public void test05() {
		
		//UNO STUDENTE UN CORSO UN APPELLO PER QUEL CORSO LO STUDENTE SI PRENOTA DUE VOLTE UN RISULTATO
		Studente s1=new Studente("EMMA", "MELLUSO","N46004673");

		Corso c1=c.crea_corso("ANALISI", "A", 9);
		
		Appello a1=prenotati.crea_appello(c1);
		
		
		
		ArrayList<Prenotazione> p;
		
		prenotati.effettua_prenotazione(s1, a1);
		prenotati.effettua_prenotazione(s1, a1);
		
		p=prenotati.visualizza_prenotati(a1);
		
		assertEquals(1,p.size());
	}
	
	@Test
	public void test06() {
		
		//UNO STUDENTE UN CORSO CON PIU' APPELLI, LO STUDENTE SI PRENOTA SOLO AD UNO DEI DUE
		//VEDERE SE HA SENSO
		Studente s1=new Studente("EMMA", "MELLUSO","N46004673");
		

		Corso c1=c.crea_corso("ANALISI", "A", 9);
		
		
		Appello a1=prenotati.crea_appello(c1);
		//Appello a2=prenotati.crea_appello(c1);
		
		
		ArrayList<Prenotazione> p;
		//ArrayList<Prenotazione> p1;
		
		prenotati.effettua_prenotazione(s1, a1);
		
		
		p=prenotati.visualizza_prenotati(a1);
		
				
		
		assertEquals(1,p.size());
		
	}
	
	@Test
	public void test07() {
		
		//UNO STUDENTE UN CORSO CON PIU' APPELLI, UNA PRENOTAZIONE PER APPELLO(STESSO STUDENTE), PIU RISULTATI
		Studente s1=new Studente("EMMA", "MELLUSO","N46004673");
		

		Corso c1=c.crea_corso("ANALISI", "A", 9);
		
		
		Appello a1=prenotati.crea_appello(c1);
		Appello a2=prenotati.crea_appello(c1);
		
		
		ArrayList<Prenotazione> p;
		ArrayList<Prenotazione> p1;
		
		prenotati.effettua_prenotazione(s1, a1);
		prenotati.effettua_prenotazione(s1, a2);
		
		p=prenotati.visualizza_prenotati(a1);
		p1=prenotati.visualizza_prenotati(a2);
				
		
		assertEquals(1,p.size());
		assertEquals(1,p1.size());
	}
	
	
	
	@Test
	public void test08() {
		
		//UN CORSO CON PIU APPELLI, UNA PRENOTAZIONE PER APPELLO (DUE STUDENTI DIVERSI) DUE RISULTATI
		Studente s1=new Studente("EMMA", "MELLUSO","N46004673");
		Studente s2=new Studente("GENNARO","MELLUSO","9");
		
		
		Corso c1=c.crea_corso("ANALISI", "A", 9);
		
		
		Appello a1=prenotati.crea_appello(c1);
		Appello a2=prenotati.crea_appello(c1);
		
		
		ArrayList<Prenotazione> p;
		ArrayList<Prenotazione> p1;
		
		prenotati.effettua_prenotazione(s1, a1);
		prenotati.effettua_prenotazione(s2, a2);
		
		p=prenotati.visualizza_prenotati(a1);
		p1=prenotati.visualizza_prenotati(a2);
				
		
		assertEquals(2,p.size()+p1.size());
		
	}
	
	@Test
	public void test09() {
		
		//PIU CORSI UN APPELLO PER CORSO, UNA PRENOTAZIONE PER APPELLO 
		Studente s1=new Studente("EMMA", "MELLUSO","N46004673");
		

		Corso c1= c.crea_corso("ANALISI", "DE MAIO", 9);
		
		Corso c2=c.crea_corso("FISICA", "ANDREONE", 9);
		
		Appello a1 = prenotati.crea_appello(c1);
		Appello a2= prenotati.crea_appello(c2);
		
		
		
		ArrayList<Prenotazione> p;
		ArrayList<Prenotazione> p1;
		
		
		prenotati.effettua_prenotazione(s1, a1);
		prenotati.effettua_prenotazione(s1, a2);
		p=prenotati.visualizza_prenotati(a1);
		p1=prenotati.visualizza_prenotati(a2);
		
		
	
				
		
		assertEquals(2,p.size()+p1.size());
		
	}
	
	
	
	
	
	
}
