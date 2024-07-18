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

    public void getInfo(String parameter) {
        if (parameter.equals("alles")) {
            System.out.println(vorname + " " + name);
            System.out.println("Funktion: " + funktion);
            System.out.println("Eintrittsjahr: " + eintrittsjahr);
        } else if (parameter.equals("name")) {
            System.out.println(vorname + " " + name);
        } else if (parameter.equals("funktion")) {
            System.out.println("Funktion: " + funktion);
        } else if (parameter.equals("eintrittsjahr")) {
            System.out.println("Eintrittsjahr: " + eintrittsjahr);
        } else {
            System.out.println("Invalid parameter");
        }
    }
}

