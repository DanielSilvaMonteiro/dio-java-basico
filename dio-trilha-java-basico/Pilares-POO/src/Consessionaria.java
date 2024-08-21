public class Consessionaria {
    public static void main(String[] args) {
        Carro jeep = new Carro();

        jeep.setChassi("897584");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("653289");
        z400.ligar();
    }
}
