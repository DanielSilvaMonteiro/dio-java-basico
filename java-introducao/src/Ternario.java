public class Ternario {
    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 6;

        /*
         * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
         * if(a==b)
         * resultado = "verdadeiro";
         * else
         * resultado = "falso";
         */

        // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a == b) ? "verdadeiro" : "false";

        System.out.println(resultado);

        int numeroDias = 15;// valor entre 1 e 30
        System.out.println((numeroDias <= 15) ? "Primeira quinzena" : "Segunda quinzena");
    }
}
