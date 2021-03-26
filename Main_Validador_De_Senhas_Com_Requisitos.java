import java.io.*;
import java.util.Scanner;

public class Main {
    public static void solucao(String entrada, String saida) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(entrada));
        PrintStream write = new PrintStream(new FileOutputStream(saida));

        String senha;
        final String requeridos = "^(?:(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).*)$";
        final String permitidos = "[a-zA-Z0-9]+";

        while((senha = buffRead.readLine()) != null){
            if(senha.length() >=6 && senha.length() <= 32 && senha.matches(permitidos) && senha.matches(requeridos)){
                System.out.println("Senha valida.");
                write.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");
                write.println("Senha invalida.");
            }
        }

    }
    public static void main(String[] args) throws IOException{
        String entrada = "./src/input/input.txt";
        String saida = "./src/output/output.txt";

        solucao(entrada, saida);
    }
}
