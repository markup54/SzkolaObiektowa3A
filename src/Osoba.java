public abstract class Osoba {
    //klasa abstrakcyjna nie można utworzyć obiektu tej klasy
    //klasa jest wykorzystywana jako klasa bazowa
    private String imie;
    private String nazwisko;
    private int wiek;

    public Osoba() {
        this.imie = "Edward";
        this.nazwisko = "Nowak";
        this.wiek = 30;
        //konstruktor z wartościami domyślnymi
    }

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek =7;
    }

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if(imie.length()<3)
            System.out.println("Imie musi mieć co najmniej 3 znaki");
        else {
            //TODO: sprawdzić czy tylko litery
            //TODO: pierwsza litera duża pozostałe małe
            this.imie = imie;
        }
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        if(wiek<0){
            this.wiek =0;
        }
        else{
            this.wiek = wiek;
        }

    }

    @Override
    public String toString() {
        return "Osoba {" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
