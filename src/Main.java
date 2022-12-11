import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> quadrado = GeradorQuadrado.gerar();

        int x1 = GeradorQuadrado.num(quadrado),
                x2 = GeradorQuadrado.num(quadrado),
                x3 = GeradorQuadrado.num(quadrado),
                x4 = GeradorQuadrado.num(quadrado),
                x5 = GeradorQuadrado.num(quadrado),
                x6 = GeradorQuadrado.num(quadrado),
                x7 = GeradorQuadrado.num(quadrado),
                x8 = GeradorQuadrado.num(quadrado),
                x9 = GeradorQuadrado.num(quadrado);

        int contador = 1;

        while(
                ((x1 + x2 + x3) != 15) || ((x4 + x5 + x6) != 15) || ((x7 + x8 + x9) != 15) ||
                        ((x1 + x4 + x7) != 15) || ((x2 + x5 + x8) != 15) || ((x3 + x6 + x9) != 15) ||
                        ((x1 + x5 + x9) != 15) || ((x3 + x5 + x7) != 15)
        ) {
            quadrado = GeradorQuadrado.gerar();
            contador++;
            x1 = GeradorQuadrado.num(quadrado);
            x2 = GeradorQuadrado.num(quadrado);
            x3 = GeradorQuadrado.num(quadrado);
            x4 = GeradorQuadrado.num(quadrado);
            x5 = GeradorQuadrado.num(quadrado);
            x6 = GeradorQuadrado.num(quadrado);
            x7 = GeradorQuadrado.num(quadrado);
            x8 = GeradorQuadrado.num(quadrado);
            x9 = GeradorQuadrado.num(quadrado);
        }



        System.out.println(x1 + " " + x2 + " " + x3);
        System.out.println(x4 + " " + x5 + " " + x6);
        System.out.println(x7 + " " + x8 + " " + x9);

        System.out.print("Quantidade de tentativas: " + contador);

    }

}
