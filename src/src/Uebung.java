import java.util.ArrayList;

public class Uebung {
    private String lehrveranstaltung;
    private Student leiter;
    private ArrayList<Student> studenten = new ArrayList<>();

    public Uebung(String lehrveranstaltung, Student leiter){
        this.lehrveranstaltung = lehrveranstaltung;
        this.leiter = leiter;
    }

    public void einschreiben(Student student){
        studenten.add(student);
        System.out.println("Teilnehmer eingeschrieben: " + student);
    }

    @Override
    public String toString(){
        return "Lehrveranstaltung: " + lehrveranstaltung + ", Leiter: " + leiter;
    }

}
