import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        /*
         * obiettivo: 
         * generare un'espressione casuale e far sì che l'app controlli che il risultato fornito dall'utente sia corretto
         */

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // generare quanti numeri avrà l'espressione, nel mio caso sarà da 2 a 4
        int length = random.nextInt(3)+2;

        // generare i numeri dell'espressione (a prescindere dalla length, ne faccio generare 4)
        int first = random.nextInt(99)+1;
        int second = random.nextInt(99)+1;
        int third = random.nextInt(99)+1;
        int fourth = random.nextInt(99)+1;

        // controllo per capire se funziona
        if (length == 2) {
            System.out.println(first + "," + second);
        } else if (length == 3) {
            System.out.println(first + "," + second + "," + third);
        } else {
            System.out.println(first + "," + second + "," + third + "," + fourth);
        }
    }
}
