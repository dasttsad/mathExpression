import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * obiettivo:
         * generare un'espressione casuale e far sì che l'app controlli che il risultato
         * fornito dall'utente sia corretto
         */

        Random random = new Random();
        Methods methods = new Methods();

        // generare quanti numeri avrà l'espressione, nel mio caso sarà da 2 a 4
        int length = random.nextInt(3) + 2;

        // controllo per capire se la lenght viene generata randomicamente ogni volta
        System.out.println(length);

        // generare i numeri in base alla lenght
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            numbers[i] = random.nextInt(98) + 1;
        }

        // controllo per capire se i numeri vengono generati in base alla lenght
        for (int numero : numbers) {
            System.out.println(numero);
        }

        // generare gli operatori giusti per la lenght
        String[] op = new String[length - 1];

        for (int index = 0; index < length - 1; index++) {
            op[index] = methods.pickRandom(length - 1);
        }

        // controllo
        for (String operatore : op) {
            System.out.println(operatore);
        }

        // unire tutto ciò che ho generato
        String[] expression = new String[op.length + numbers.length];

        for (int i = 0; i < expression.length; i++) {
            
        }


    }
}
