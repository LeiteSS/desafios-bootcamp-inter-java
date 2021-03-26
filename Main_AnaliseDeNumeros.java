import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int A, B, C, D;

    public static void solucao(String entrada, String saida) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(entrada));
        PrintStream write = new PrintStream(new FileOutputStream(saida));

        String linha;
        int Pos, Neg, Par, Impar, num;
        Pos = Neg = Par = Impar = 0;

        for (int i = 0; i < 5; i++) {
            linha = buffRead.readLine();
            num = Integer.parseInt(linha);

            if (num % 2 == 0) {
                Par++;
            } else {
                Impar++;
            }

            if (num > 0) Pos++;
            if (num < 0) Neg++;
        }

        System.out.println( Par + " valor(es) par(es)");
        write.println(Par + " valor(es) par(es)");
        System.out.println( Impar + " valor(es) impar(es)");
        write.println(Impar + " valor(es) impar(es)");
        System.out.println( Pos + " valor(es) positivo(s)");
        write.println(Pos + " valor(es) positivo(s)");
        System.out.println( Neg + " valor(es) negativo(s)");
        write.println(Neg + " valor(es) negativo(s)");
        buffRead.close();
    }

    static boolean conferirCondicaoABC(int i) {
        if ((i % A == 0) && (i % B != 0) && (D % i != 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        String entrada = "./src/input/input.txt";
        String saida = "./src/output/output.txt";

        solucao(entrada, saida);
    }
}