public class Abgabe {

    private Student student1, student2;
    private Uebungsblatt uebungsblatt;
    private Boolean istKorrigiert;

    public Abgabe(Uebungsblatt uebungsblatt, Student student){
        this.student1 = student;
        this.student2 = null;
        this.uebungsblatt = uebungsblatt;
        this.istKorrigiert = false;
    }
    public Abgabe(Uebungsblatt uebungsblatt, Student student1, Student student2){
        this.student1 = student1;
        this.student2 = student2;
        this.uebungsblatt = uebungsblatt;
        this.istKorrigiert = false;
    }

    public void korrigieren(){
        System.out.println("Abgabe korrigiert");
        istKorrigiert = true;
    }
}
