import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro hash ou endereço bitcoin:");
        String hash1 = leitor.next();

        System.out.println("Agora confirme hash ou endereço:");

        String hash2 = leitor.next();

        if (hash1.equals(hash2)) {
            System.out.println("O hash ou endereço é igual");
        } else {
            System.out.println("O hash ou endereço não confere");
        }

        leitor.close();
    }
}
