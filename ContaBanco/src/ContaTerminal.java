import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner visor = new Scanner(System.in).useLocale(Locale.US);

        saudarCliente();
        criarConta(visor);

    }

    // saudacao criacao de conta
    public static void saudarCliente() {
        System.out.println("Seja bem vindo ao Banco Dio!");
        System.out.println("Vamos iniciar o processo de criação de contas");

    }

    // metodo de criacao de conta
    public static void criarConta(Scanner visor) {
        String nomeCompleto;

        System.out.println("Digite o numero da Agencia :");
        int numeroConta = visor.nextInt();

        System.out.println("Digite a Agencia: ");
        String agencia = visor.next();

        System.out.println("Digite seu nome: ");
        String nomeCliente = visor.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenomeCliente = visor.next();

        System.out.println("Valor inicial a ser depositado: ");
        double saldo = visor.nextDouble();

        visor.close();
        nomeCompleto = nomeCliente + " " + sobrenomeCliente;

        imprimir(numeroConta, agencia, nomeCompleto, saldo);

    }

    // mensagem final apos criacao de conta
    public static void imprimir(int numeroConta, String agencia, String nomeCompleto, double saldo) {
        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
