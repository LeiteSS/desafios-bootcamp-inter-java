import java.io.*;
import java.util.*;

public class Main {

    public static void solucao(String entrada, String saida) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(entrada));
        PrintStream write = new PrintStream(new FileOutputStream(saida));
        Map<Integer, Integer> numeros = new HashMap<>();
        int valores = Integer.parseInt(buffRead.readLine());

        for (int i = 0; i < valores; i++) {
            var numero = Integer.parseInt(buffRead.readLine());

            if(numeros.containsKey(numero)) {
                var qtde = numeros.get(numero);
                numeros.put(numero, ++qtde);
            } else {
                numeros.put(numero, 1);
            }
        }
        // console
        numeros.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " aparece " + e.getValue() + " vez(es)"));
        // output.txt
        numeros.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> write.println(e.getKey() + " aparece " + e.getValue() + " vez(es)"));
        buffRead.close();

    }


    public static void main(String[] args) throws IOException {
        String entrada = "./src/input/input.txt";
        String saida = "./src/output/output.txt";

        solucao(entrada, saida);
    }
}