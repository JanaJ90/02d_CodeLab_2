public class App {
    public static void main(String[] args) {
        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Müller", "Hans", "Manager", 2015);
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Schmidt", "Anna", "Sekretärin", 2018);
        Mitarbeiter mitarbeiter3 = new Mitarbeiter("Martinelli", "Silvia", "CEO", 2020);

        mitarbeiter1.getInfo("alles");
        System.out.println();
        mitarbeiter2.getInfo("alles");
        System.out.println();
        mitarbeiter3.getInfo("alles");
    }
}