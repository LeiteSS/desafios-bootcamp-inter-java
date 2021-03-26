import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int A, B, C, D;

    public static void solucao(String entrada, String saida) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(entrada));
        PrintStream write = new PrintStream(new FileOutputStream(saida));
        
        String linha = buffRead.readLine();
        StringTokenizer st = new StringTokenizer(linha, " ");
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());

        int n = -1;
        int sqrtC = (int) Math.sqrt(C);

        for (int i = 1; i <= sqrtC; ++i) {
            if (C % i == 0) {
                if (conferirCondicaoABC(i)) {
                    n = i;
                    break;
                } else if (conferirCondicaoABC(C / i)) {
                    n = C / i;
                }
            }
        }
        System.out.println(n);
        write.println(n);
        buffRead.close();
    }

    static boolean conferirCondicaoABC(int i) {
        if ((i % A == 0) && (i % B != 0) && (D % i != 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        String entrada = "./src/input/input2.txt";
        String saida = "./src/output/output2.txt";

        solucao(entrada, saida);
    }
}
