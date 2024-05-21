/**
 *Speichert die Daten eines Benutzers.
 */
public class User {

    String username;
    String email;
    String password;
    int alter; //freiwillige Angabe

    //Konstruktor mit freiwilliger Altersangabe
    public User(String username, String email, String password, int alter) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.alter = alter;
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;


    }
}
