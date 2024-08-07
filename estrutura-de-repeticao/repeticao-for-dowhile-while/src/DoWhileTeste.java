import java.util.Random;

public class DoWhileTeste {
    public static void main(String[] args) {
        System.out.println("Estudando programacao ..");

        do {
            System.out.println("Fazendo Entrevista");
        } while (conquistar());

        System.out.println("Seja Bem-Vindo programador!");
    }

    public static boolean conquistar() {
        boolean contratado = new Random().nextInt(6) == 1;
        System.out.println("Contratado? " + contratado);

        return !contratado;
    }
}
