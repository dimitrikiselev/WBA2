package aufgabe4b;

import aufgabe4.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import java.util.List;
import java.util.Scanner;




public class Aufgabe_4b {


public static int index = 1;
	
	public static void main(String[] args) throws Exception {
		

		Scanner in = new Scanner(System.in);


		System.out.println("Wählen Sie die Nummer Ihres gewünschten Rezeptes.");
		auflistung();

		int a = in.nextInt();
		switch(a){

		case 0:
		infos(a); break;

		}
		}




		private static void auflistung() throws JAXBException{

		for(int i = 0; i <= index; i++){
		System.out.println(getRezepte().getRezept().get(i).getTitle() + "........." + i);
		}	
		}

		private static void infos(int i) throws JAXBException{
		Rezept r = getRezepte().getRezept().get(i);

		System.out.println(getRezepte().getRezept().get(i).getTitle() + "\n");

		System.out.println(r.getFotos().getFoto().getSrc());
		System.out.println("Gepostet von:" + r.getFotos().getFoto().getUser() + "\n");

		int b = 1;
		for(int a = 0; a < r.getZutaten().getZutat().size(); a++, b++)
		System.out.println("Zutat " + b + " ist: " + r.getZutaten().getZutat().get(a).getMenge() + r.getZutaten().getZutat().get(a).getEinheit() + r.getZutaten().getZutat().get(a).getZutatenName());

		}




private static Rezepte getRezepte() throws JAXBException {
JAXBContext ctx = JAXBContext.newInstance("aufgabe4");
Unmarshaller unmarshaller = ctx.createUnmarshaller();
Rezepte list = (Rezepte) unmarshaller.unmarshal(new File("src/Aufgabe3/Aufgabe3d.xml"));
return list;
}
}