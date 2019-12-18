package Control.it;
import java.util.ArrayList;
import java.util.Iterator;

import Entità.it.*;

public class GestioneCorsi {
	
	public ArrayList<Corso> corsi;

	public GestioneCorsi() {
		corsi= new ArrayList<Corso>();
	}

	
	public Corso crea_corso(String nome_c, String nome_d, int cfu) {
		Corso c= new Corso(nome_c, nome_d, cfu);
		corsi.add(c);
		return c;
	}
	
	public ArrayList<Corso> visualizza_corsi() {
		ArrayList<Corso> co= new ArrayList<Corso>();
		if(corsi.size()>0) {
			for(Iterator<Corso> i = corsi.iterator(); i.hasNext();) {
				Corso x= i.next();
				co.add(x);
				System.out.println(x.toString());
			}
		} else {
			System.out.println("NESSUN CORSO DISPONIBILE");
		}
		return co;
	}
	
	
	
}
