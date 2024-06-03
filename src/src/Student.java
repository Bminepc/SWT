import java.util.Iterator;
import java.util.Random;

public class Student {
    private int matrikelnummer;
    private String name;
    private static int maxMatrikelnummer = 9999999;

    public Student(String name){
        this.name = name;
        matrikelnummer = new Random().nextInt(maxMatrikelnummer+1);
    }

    public void abgabeErstellen(Uebungsblatt u, Student s){
        System.out.println("Abgabe erstellt");
        // TODO Diese Zeile könnte durchaus im Methodenaufruf der eigentlichen Übung gemacht werden. Nur lässt das UML es nicht zu.
        u.abgaben.add(s != null ? new Abgabe(u,s,this) : new Abgabe(u,this));
        u.abgabeEinreichen();
    }

    public void abgabenKorrigieren(Uebungsblatt u){
        Iterator e = u.abgaben.iterator();
        while (e.hasNext()){
            ((Abgabe) e.next()).korrigieren();
        }
    }

    @Override
    public String toString(){
        return name;
    }

}
