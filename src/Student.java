public class Student extends Osoba {
    private int rok;
    private int numerGrupy;
    private int numerAlbumu;

    public Student()
    {

    }

    public Student(String imie, String nazwisko, int rok, int numerGrupy, int numerAlbumu)
    {
        super(imie,nazwisko);
        this.rok=rok;
        this.numerGrupy=numerGrupy;
        this.numerAlbumu=numerAlbumu;
    }

    @Override
    public String toString()
    {
        return super.toString()+ System.lineSeparator()+"rok: "+rok+System.lineSeparator()+
                "numer grupy: "+numerGrupy+System.lineSeparator()+
                "numer albumu: "+numerAlbumu;
    }
}