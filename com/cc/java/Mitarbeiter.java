


public class Mitarbeiter {
    private String name;
    private String vorname;
    private String funktion;
    private int eintrittsjahr;

    public Mitarbeiter(String name, String vorname, String funktion, int eintrittsjahr) {
        this.name = name;
        this.vorname = vorname;
        this.funktion = funktion;
        this.eintrittsjahr = eintrittsjahr;
    }

    public String getInfo(String property) {
        switch (property) {
            case "Name":
                return this.name;
            case "Vorname":
                return this.vorname;
            case "Funktion":
                return this.funktion;
            case "Eintrittsjahr":
                return String.valueOf(this.eintrittsjahr);
            default:
                return "Unbekannte Eigenschaft";
        }
    }
}