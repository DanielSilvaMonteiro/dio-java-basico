public class Carro extends Veiculo {

    public void ligar() {
        verificarCambio();
        verificarCombustivel();
        System.out.println("Carro Ligado");
    }

    private void verificarCambio() {
        System.out.println("Cambio Verificado");
    }

    private void verificarCombustivel() {
        System.out.println("verificando Combustivel");
    }

}
