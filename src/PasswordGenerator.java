import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        //Apertura scanner
        Scanner input = new Scanner(System.in);

        //Definizione variabili
        System.out.println("Inserisci il tuo nome e premi invio...");
        String nome = input.nextLine();
       
        System.out.println("Inserisci il tuo cognome e premi invio...");
        String cognome = input.nextLine();
        
        System.out.println("Inserisci il tuo colore preferito e premi invio...");
        String colore = input.nextLine();
        
        System.out.println("Inserisci il tuo giorno di nascita e premi invio...");
        int giorno = Integer.parseInt(input.nextLine());

        System.out.println("Inserisci il tuo mese di nascita e premi invio...");
        int mese = Integer.parseInt(input.nextLine());
        
        System.out.println("Inserisci il tuo anno di nascita e premi invio...");
        int anno = Integer.parseInt(input.nextLine());

        //Chiusura scanner
        input.close();

        //Generazione della password
        String password = nome+"-"+cognome+"-"+colore+giorno+mese+anno;

        System.out.println("La password generata è:" + password);

    }
}
