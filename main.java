// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho da senha desejada: ");
        int tamanhoSenha = scanner.nextInt();
        scanner.close();

        String senha = gerarSenha(tamanhoSenha);
        System.out.println("Senha gerada: " + senha);
    }

    public static String gerarSenha(int tamanho) {
        StringBuilder senha = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            senha.append(random.nextInt(10));
        return senha.toString();
    }
}
