import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro hash:");
        String hash1 = leitor.next();

        System.out.println("Agora confirme hash:");

        String hash2 = leitor.next();

        if (hash1.equals(hash2) && hash2.equals(hash1)) {
            System.out.println("O hash é igual");
        } else {
            System.out.println("O hash não confere");
        }

        leitor.close();
    }
}
