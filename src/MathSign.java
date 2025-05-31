import java.util.Random;

public class MathSign {
    
    //generare un operatore casuale
    Random r = new Random();

    String getMathSign (String[] arr){
        int rdm = r.nextInt(arr.length);
        return arr[rdm];
    }

    String pickRandom(){
        String[] operator = {"+", "-", "*", "/"};
        String picked = getMathSign(operator);
        return picked;
    }
}
