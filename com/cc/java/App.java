public class App {
    public static void main(String[] args) {
        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Müller", "Hans", "Entwickler", 2015);
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Schmidt", "Maria", "Designer", 2018);
        Mitarbeiter mitarbeiter3 = new Mitarbeiter("Martinelli", "Silvia", "CEO", 2020);

        System.out.println(mitarbeiter1.getInfo("Name"+ "Vorname" + "Funktion" + "Eintrittsjahr" )); // Ausgabe: Müller
        System.out.println(mitarbeiter2.getInfo("Name"+ "Vorname" + "Funktion" + "Eintrittsjahr")); // Ausgabe: Maria
        System.out.println(mitarbeiter3.getInfo("Name"+ "Vorname" + "Funktion" + "Eintrittsjahr")); // Ausgabe: CEO
    }
}