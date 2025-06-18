import java.util.Random;

public class Methods {
    
    //generare un operatore casuale
    Random r = new Random();

    String getMathSign (String[] arr){
        int rdm = r.nextInt(arr.length);
        return arr[rdm];
    }

    String pickRandom(int l){
        String[] operator = {"+", "-", "*", "/"};
        String picked = getMathSign(operator);
        return picked;
    }
}
