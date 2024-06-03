import java.util.ArrayList;

public class Uebungsblatt {
    private int anzahlAufgaben;
    private String thema;
    public ArrayList<Abgabe> abgaben = new ArrayList<>();

    public Uebungsblatt(int anzahlAufgaben, String thema){
        this.anzahlAufgaben = anzahlAufgaben;
        this.thema = thema;
    }

    public void abgabeEinreichen(){
       // abgaben.add();
        System.out.println("Abgabe eingereicht");
    }

    @Override
    public String toString() {
        return "Anzahl Aufgabe: " + anzahlAufgaben + ", Thema: " + thema;
    }
}
