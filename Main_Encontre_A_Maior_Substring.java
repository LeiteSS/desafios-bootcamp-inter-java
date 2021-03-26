import java.io.*;

public class Main {

    public static void solucao(String entrada, String saida) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(entrada));
        PrintStream write = new PrintStream(new FileOutputStream(saida));
        String str1, str2, max, min;

        while ((str1 = buffRead.readLine()) != null) {
            str2  = buffRead.readLine();
            if (str1.length() >= str2.length()) {
                max = str1;
                min = str2;
            } else {
                max = str2;
                min = str1;
            }
            int minLength = min.length();
            int maxS = minLength;
            boolean f = true;
            while (maxS > 0 && f) {
                int diff = minLength - maxS;
                for (int i = 0; i <= diff; i++) {
                    if (max.contains(min.substring(i, i + maxS))) {
                        f = false;
                        maxS++;
                        break;
                    }
                }
                maxS--;
            }
            System.out.println(maxS);
            write.println(maxS);
        }
        write.close();
    }

    public static void main(String[] args) throws IOException {
        String entrada = "./src/input/input.txt";
        String saida = "./src/output/output.txt";

        solucao(entrada, saida);
    }

}
