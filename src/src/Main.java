public class Main {
    public static void main(String[] args) {
        Student fritz = new Student(" Fritz Mueller ");
        Student anna = new Student(" Anna Meier ");
        Student peter = new Student(" Peter Becker ");
        Uebung swtUebung = new Uebung(" SWT ", fritz);
        swtUebung.einschreiben(anna);
        swtUebung.einschreiben(peter);
        Uebungsblatt uebungsblatt = new Uebungsblatt(3, " Klassendiagramme ");
        anna.abgabeErstellen(uebungsblatt, peter);
        fritz.abgabenKorrigieren(uebungsblatt);
    }
}