import static javax.swing.JOptionPane.showInputDialog;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(showInputDialog("Bitte geben Sie Ihren Username ein: "),
                showInputDialog("Bitte geben Sie Ihre Email ein: "),
                showInputDialog("Bitte geben Sie Ihr Passwort ein: "));

        System.out.println("Benutzername: " + user1.username
                            + "\nE-Mail: " + user1.email + "\nPasswort: "
                            + user1.password + "\nAlter: " +user1.alter);

       // User a = new User("a", "email", "b");


    }
}
