//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.13 um 01:25:16 AM CEST 
//


package aufgabe4;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Rezepte }
     * 
     */
    public Rezepte createRezepte() {
        return new Rezepte();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept }
     * 
     */
    public Rezepte.Rezept createRezepteRezept() {
        return new Rezepte.Rezept();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept.Kommentare }
     * 
     */
    public Rezepte.Rezept.Kommentare createRezepteRezeptKommentare() {
        return new Rezepte.Rezept.Kommentare();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept.Zubereitung }
     * 
     */
    public Rezepte.Rezept.Zubereitung createRezepteRezeptZubereitung() {
        return new Rezepte.Rezept.Zubereitung();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept.Zutaten }
     * 
     */
    public Rezepte.Rezept.Zutaten createRezepteRezeptZutaten() {
        return new Rezepte.Rezept.Zutaten();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept.Fotos }
     * 
     */
    public Rezepte.Rezept.Fotos createRezepteRezeptFotos() {
        return new Rezepte.Rezept.Fotos();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept.Kommentare.Kommentar }
     * 
     */
    public Rezepte.Rezept.Kommentare.Kommentar createRezepteRezeptKommentareKommentar() {
        return new Rezepte.Rezept.Kommentare.Kommentar();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept.Zubereitung.Arbeitszeit_0020 }
     * 
     */
    public Rezepte.Rezept.Zubereitung.Arbeitszeit_0020 createRezepteRezeptZubereitungArbeitszeit_0020() {
        return new Rezepte.Rezept.Zubereitung.Arbeitszeit_0020();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept.Zubereitung.Brennwert }
     * 
     */
    public Rezepte.Rezept.Zubereitung.Brennwert createRezepteRezeptZubereitungBrennwert() {
        return new Rezepte.Rezept.Zubereitung.Brennwert();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept.Zutaten.Zutat }
     * 
     */
    public Rezepte.Rezept.Zutaten.Zutat createRezepteRezeptZutatenZutat() {
        return new Rezepte.Rezept.Zutaten.Zutat();
    }

    /**
     * Create an instance of {@link Rezepte.Rezept.Fotos.Foto }
     * 
     */
    public Rezepte.Rezept.Fotos.Foto createRezepteRezeptFotosFoto() {
        return new Rezepte.Rezept.Fotos.Foto();
    }

}
