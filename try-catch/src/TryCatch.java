import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try {
            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            // imprimindo os dados obtidos pelo usuario
            System.out.println("Ola, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();

        } catch (java.util.InputMismatchException e) {
            System.out.println("O campo idade e altura devem ser numericos");
            // System.err.println("O campo idade e altura devem ser numericos"); //Nao tao
            // comum mas da certo
        }

    }
}
