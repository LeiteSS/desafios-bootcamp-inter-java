import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void solucao(String entrada, String saida) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(entrada));
        PrintStream write = new PrintStream(new FileOutputStream(saida));
        int N = Integer.parseInt(buffRead.readLine());

        while (N != 0) {
            List<String> conjunto = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                conjunto.add(buffRead.readLine());
            }

            conjunto = conjunto.stream().sorted().collect(Collectors.toList());
            String resultado = "Conjunto Bom";

            for (int i = 0; i < N - 1; i++) {
                if (conjunto.get(i + 1).startsWith(conjunto.get(i))) {
                    resultado = "Conjunto Ruim";
                }
            }

            System.out.println(resultado);
            write.println(resultado);
            N = Integer.valueOf(buffRead.readLine());
        }
    }

    public static void main(String[] args) throws IOException {
        String entrada = "./src/input/input.txt";
        String saida = "./src/output/output.txt";

        solucao(entrada, saida);
    }
}