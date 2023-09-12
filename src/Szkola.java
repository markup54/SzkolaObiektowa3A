public class Szkola {
    private String nazwa;
    private static Szkola szkola =new Szkola();

    private Szkola(){
        //prywatny konstruktor
        //nie można wywołac go poza klasą
    }

    public static Szkola getSzkola() {
        return szkola;
    }
}
