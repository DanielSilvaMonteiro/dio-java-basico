public class Operadores {
    public static void main(String[] args) {

        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);// 31
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);// 1111
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);// 1111
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);// 1111
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);// 13

        /************************************************************* */
        int numero = 5;

        // Imprimindo o numero negativo
        System.out.println(-numero);

        // incrementando numero em mais 1 numero, imprime 6
        numero++;
        System.out.println(numero);

        // incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        // ordem de precedencia conta aqui
        System.out.println(++numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);
    }

}
