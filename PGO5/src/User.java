public class User {
    private String imie;
    private String nazwisko;
    private String email;
    private String haslo;
    private boolean czyGosc;


    public User(String imie, String nazwisko, String email, String haslo) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.haslo = haslo;
        this.czyGosc = false;
    }

    public User(String email) {
        this.email = email;
        this.czyGosc = true;
    }

    public void aktualizujDoZarejestrowanegoUzytkownika(String imie, String nazwisko, String haslo){
        if(this.czyGosc){
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.haslo = haslo;
            this.czyGosc = false;
        }
    }

}
