public class Array {
    public static void main(String[] args) {
        String[] pessoas = { "Jesus", "Daniel", "Vic", "Dale", "Lucas", "Gaby" };
        int contador = 0;

        System.out.println("Quantidade total de pessoas: " + pessoas.length);

        try {
            for (String pessoa : pessoas) {
                adicionarPessoa(pessoa, contador);
                contador++;
            }

        } catch (excedeLimite e) {
            // TODO: handle exception
            System.out.println("Aviso: " + e.getMessage());
        }

    }

    static void adicionarPessoa(String pessoas, int contador) throws excedeLimite {
        String arrayPessoa[] = new String[5];

        if (contador < arrayPessoa.length) {
            arrayPessoa[contador] = pessoas;
            System.out.println(arrayPessoa[contador] + " Foi Selecionado(a)!");
        } else {
            throw new excedeLimite("Numero maximo de candidatos selecionados");
        }
    }
}
