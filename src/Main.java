

public class Main {
    public static void main(String[] args) {
        String[] s;
        s = new String[1];
        s[0] = "personne.json";
        GenerateurJSON.main(s);

        LecteurJSON.main(s);
    }
}
