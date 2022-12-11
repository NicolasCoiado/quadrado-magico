import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GeradorQuadrado {
    private static final Random gerador = new Random();
    public static ArrayList<Integer> gerar() {
        return new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8));
    }
    public static int num(ArrayList<Integer> quadrado) {
        return quadrado.remove(gerador.nextInt(quadrado.size())) + 1;
    }
}