public class BreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero++) {

            if (numero == 3) {
                break;
            }
            System.out.println("Qual numero imprimiu? " + numero);
        }

        for (int numero = 1; numero <= 5; numero++) {

            if (numero == 3) {
                continue; // muda o fluxo mas nao sai do fluxo, porem nao imprimiu o 3 (usar este exemplo
                          // no par e impar)
            }
            System.out.println("O 3 aparece? " + numero);
        }

        // par ou impar
        for (int numero = 1; numero <= 20; numero++) {
            if (numero % 2 != 0) {
                continue; // muda o fluxo mas nao sai do fluxo, porem nao imprimiu o 3 (usar este exemplo
                          // no par e impar)
            }
            System.out.println("Par ou impar? " + numero);
        }

    }
}
