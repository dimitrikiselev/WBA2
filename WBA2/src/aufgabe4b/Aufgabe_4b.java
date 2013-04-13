package aufgabe4b;

import generated.*;
import generated.Rezepte.Rezept;
import generated.Rezepte.Rezept.Kommentare.Kommentar;


import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.util.Date;

import java.util.GregorianCalendar;
import java.util.Scanner;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;



public class Aufgabe_4b {

	public static int index = 0;
	private Unmarshaller unmarshaller;
	private Marshaller marshaller;
	private final String XMLFILE = "src/Aufgabe3/Aufgabe3d.xml";
	private Rezepte rezepte;
	
	
	public Aufgabe_4b(Marshaller marshaller, Unmarshaller unmarshaller) throws JAXBException {
	this.unmarshaller = unmarshaller;
	this.marshaller = marshaller;
	this.rezepte = (Rezepte) unmarshaller.unmarshal(new File(XMLFILE));
	}
	
	
	public static void main(String[] args) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance("generated");
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		Aufgabe_4b aufgabe = new Aufgabe_4b(marshaller, unmarshaller);	
		
		Scanner in = new Scanner(System.in);
		
		do {
			for(int i=0; i<1; i++){
				System.out.println("Geben sie die Nummer ihres . \n\n");
					aufgabe.auflistung();
					int a = in.nextInt();
					aufgabe.infos(a);
					aufgabe.kommentare(a);
			System.out.println("\n\n");
			System.out.println("Wenn sie Kommetare hinzufügen wollen, wählen sie: \t 1");
			System.out.println("Wenn Sie ein anderes Rezept wählen wollen wählen sie: \t 2");
			System.out.println("Wenn Sie das Programm beenden wollen wählen sie: \t 3");
			
			int tmp = in.nextInt();
			if(tmp == 1) aufgabe.kommentieren(a);
			if(tmp == 3) System.exit(-1);
			in.close();
			}
		 
		}
		while(index != 1);	
	}
	
	
	
	public void kommentieren(int i) throws JAXBException{
		Scanner in = new Scanner(System.in);
		System.out.println("Geben Sie jetzt Ihren Usernamen ein.");
		String user = in.nextLine();
		System.out.println("Geben Sie jetzt Ihren Kommentar ein.");
		String text = in.nextLine();
		
		in.close();
		
		Kommentar neuescomment = new Kommentar();
		neuescomment.setUsername(user);
		neuescomment.setText(text);
		
		try{	
			GregorianCalendar cal = new GregorianCalendar();
			cal.setTime(new Date());
			XMLGregorianCalendar newCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
			neuescomment.setCommentdate(newCal);
		} catch(DatatypeConfigurationException e) {
			e.printStackTrace();
		
		}
		
		
		this.rezepte.getRezept().get(i).getKommentare().getKommentar().add(neuescomment);
		this.marshaller.marshal(this.rezepte, new File(XMLFILE));
		
		this.infos(i);
		this.kommentare(i);
		}
		
	
	public void auflistung() throws JAXBException {
		for(int i = 0; i < this.rezepte.getRezept().size(); i++){
				System.out.println(i + "..............." + this.rezepte.getRezept().get(i).getTitle());
		}	
	}
	
	public void infos(int index) throws JAXBException{
	
		Rezept rezept = this.rezepte.getRezept().get(index);	
		System.out.println("\n\n" + rezept.getTitle() + "\n");		
		System.out.println(rezept.getFotos().getFoto().get(0).getSrc());
		System.out.println("Gepostet von:" + rezept.getFotos().getFoto().get(0).getUser() + "\n");
		
		int b = 1;
		for(int a = 0; a < rezept.getZutaten().getZutat().size(); a++, b++){
			System.out.println("Zutat " + b + " ist: " + rezept.getZutaten().getZutat().get(a).getMenge() + " " + rezept.getZutaten().getZutat().get(a).getEinheit() + " " + rezept.getZutaten().getZutat().get(a).getZutatenName());
		}
		
		System.out.println("\n" + "Arbeitszeit: " + rezept.getZubereitung().getArbeitszeit());
		System.out.println("Schwierigkeitsgrad: " + rezept.getZubereitung().getSchwierigkeit());
		System.out.println("Brennwert: " + rezept.getZubereitung().getBrennwert() + "kcal");
		System.out.println("Zubereitung: " + rezept.getZubereitung().getBeschreibung() + "\n\n");
	}
		
	public void kommentare(int i) throws JAXBException{
		
			Rezept rezept = this.rezepte.getRezept().get(i);
			
			System.out.println("Kommentare: \n");
			int index = 1;
			for(int a = 0; a < rezept.getKommentare().getKommentar().size(); a++, index++){
				System.out.println("Kommentar " + index + ", von " + rezept.getKommentare().getKommentar().get(a).getUsername() + " am " + rezept.getKommentare().getKommentar().get(a).getCommentdate());
				System.out.println(rezept.getKommentare().getKommentar().get(a).getUserpic());
				System.out.println(rezept.getKommentare().getKommentar().get(a).getText() + "\n");
			}
	}
}


