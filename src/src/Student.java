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
    }

    public void abgabenKorrigieren(Uebungsblatt u){

    }

    @Override
    public String toString(){
        return name;
    }

}
