import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in); 
        System.out.println("O que você quer adicionar ao texto? ");
        String texto = scanner.nextLine();

        FileWriter writer = new FileWriter("output.txt", true);

        writer.write(texto + "\n");

        System.out.println("Teste máximo aqui " + 10);

        writer.close();
        scanner.close();
    }
}
