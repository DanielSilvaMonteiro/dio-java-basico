public class caixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        saldo = sacar(valorSolicitado, saldo);
        System.out.println("Saldo atual: " + saldo);

        // Solicitando um valor maior = 9
        valorSolicitado = 9.0;
        saldo = sacar(valorSolicitado, saldo);
        System.out.println("Saldo atual: " + saldo);

    }

    public static double sacar(double valorSolicitado, double saldo) {
        if (valorSolicitado <= saldo) {
            saldo = saldo - valorSolicitado;
        }
        return saldo;
    }
}
