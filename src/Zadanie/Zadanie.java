package Zadanie;

public class Zadanie {

private  Integer idZadania;
private String rodzajZadania;
private String dataNadania;
private String dataRozpoczecia;
private  String dataZakonczenia;

public Zadanie()
{

}

public Zadanie(int idZadania,String rodzajZadania,String dataNadania,String dataRozpoczecia, String dataZakonczenia)
{
    this.idZadania=idZadania;
    this.rodzajZadania=rodzajZadania;
    this.dataNadania=dataNadania;
    this.dataRozpoczecia=dataRozpoczecia;
    this.dataZakonczenia=dataZakonczenia;
}

    public Integer getIdZadania() {
        return idZadania;
    }

    public void setIdZadania(Integer idZadania) {
        this.idZadania = idZadania;
    }

    public String getRodzajZadania() {
        return rodzajZadania;
    }

    public void setRodzajZadania(String rodzajZadania) {
        this.rodzajZadania = rodzajZadania;
    }

    public String getDataNadania() {
        return dataNadania;
    }

    public void setDataNadania(String dataNadania) {
        this.dataNadania = dataNadania;
    }

    public String getDataRozpoczecia() {
        return dataRozpoczecia;
    }

    public void setDataRozpoczecia(String dataRozpoczecia) {
        this.dataRozpoczecia = dataRozpoczecia;
    }

    public String getDataZakonczenia() {
        return dataZakonczenia;
    }

    public void setDataZakonczenia(String dataZakonczenia) {
        this.dataZakonczenia = dataZakonczenia;
    }


}





    /*private int idZadania;
    private String imie;
    private String nazwisko;
    private int telefon;
    private String email;

    private int idAdresu;
    private boolean czyZarejestrowany;
    private String dataRejestracji;

    public  Zadanie(int idZadania,String imie,String nazwisko,int telefon,String email,
                    int idAdresu, boolean czyZarejestrowany,String dataRejestracji)
    {
        this.idAdresu=idAdresu;
        this.idZadania=idZadania;
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.telefon=telefon;
        this.email=email;
        this.czyZarejestrowany=czyZarejestrowany;
        this.dataRejestracji=dataRejestracji;
    }


    public int getIdZadania() {
        return idZadania;
    }

    public void setIdZadania(int idZadania) {
        this.idZadania = idZadania;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdAdresu() {
        return idAdresu;
    }

    public void setIdAdresu(int idAdresu) {
        this.idAdresu = idAdresu;
    }

    public boolean isCzyZarejestrowany() {
        return czyZarejestrowany;
    }

    public void setCzyZarejestrowany(boolean czyZarejestrowany) {
        this.czyZarejestrowany = czyZarejestrowany;
    }

    public String getDataRejestracji() {
        return dataRejestracji;
    }

    public void setDataRejestracji(String dataRejestracji) {
        this.dataRejestracji = dataRejestracji;
    }
}*/
