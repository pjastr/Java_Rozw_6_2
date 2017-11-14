public class Osoba {

    private String imie;
    private String nazwisko;

    public Osoba()
    {

    }

    public Osoba(String imie, String nazwisko)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
    }

    @Override
    public String toString()
    {
        return "imię i nazwisko: "+imie+" "+nazwisko;
    }


}