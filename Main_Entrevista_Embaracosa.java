import java.io.*;
import java.util.Scanner;

public class Main {
    public static void solucao(String entrada, String saida) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(entrada));
        PrintStream write = new PrintStream(new FileOutputStream(saida));
        String input;

        while((input = buffRead.readLine()) != null) {
            Integer limit = (int) Math.floor(input.length() / 2);
            Integer end = input.length();
            Integer aux = 0;

            if(input.length() == 1) {
                System.out.println(input);
                write.println(input);
            } else if (limit >= 1) {
                for (int i = limit; i >= 1; i--) {
                    if(input.substring(end-i, end).equals(input.substring(end-(2*i),end-i))) {
                        aux = i;
                        System.out.println(input.substring(0, (end - aux)));
                        write.println(input.substring(0, (end - aux)));
                    } else if (limit == 1) {
                        System.out.println(input);
                        write.println(input);
                    }
                }

                if(limit>1 && aux == 0) {
                    System.out.println(input);
                    write.println(input);
                }
            }
        }
        buffRead.close();
        write.close();
    }

    public static void main(String[] args) throws IOException{
        String entrada = "./src/input/input.txt";
        String saida = "./src/output/output.txt";

        solucao(entrada, saida);
    }
}