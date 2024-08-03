public class Metodos {
    public static void main(String[] args) {
        int volume = 0;
        int canal = 1;
        boolean tvLigada = false;

        tvLigada = ligarDesligar(tvLigada);

        if (tvLigada == true) {
            System.out.println("TV LIGADA");

            for (int x = 1; x < 20; x++) {
                volume = aumentarVolume(volume);
                System.out.println("Volume " + volume);
            }

            for (int x = 1; x < 20; x++) {
                volume = diminuirVolume(volume);
                System.out.println("Volume " + volume);
            }

            for (int x = 1; x < 20; x++) {
                canal = mudarCima(canal);
                System.out.println("Canal " + canal);
            }

            for (int x = 1; x < 20; x++) {
                canal = mudarBaixo(canal);
                System.out.println("Canal " + canal);
            }
        } else {
            System.out.println("TV DESLIGADA");
        }

    }

    public static boolean ligarDesligar(boolean tvLigada) {
        tvLigada = !tvLigada;
        return tvLigada;
    }

    public static int mudarCima(int canal) {
        canal = (canal >= 10) ? 1 : canal + 1;
        return canal;
    }

    public static int mudarBaixo(int canal) {
        canal = (canal <= 1) ? 10 : canal - 1;
        return canal;
    }

    public static int aumentarVolume(int volume) {
        volume = (volume >= 10) ? 10 : volume + 1;
        return volume;
    }

    public static int diminuirVolume(int volume) {
        volume = (volume <= 0) ? 0 : volume - 1;
        return volume;
    }
}
