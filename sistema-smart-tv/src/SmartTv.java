public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void Desligar() {
        ligada = false;
    }

    public void mudarCima() {
        if (ligada == true)
            canal--;
        System.out.println("Diminuindo Canal : " + canal);
    }

    public void mudarBaixo() {
        if (ligada == true)
            canal++;
        System.out.println("Diminuindo Canal : " + canal);
    }

    public void aumentarVolume() {
        if (ligada == true)
            volume++;
        System.out.println("Aumentando Volume : " + volume);
    }

    public void diminuirVolume() {
        if (ligada == true)
            volume--;
        System.out.println("Diminuindo Volume : " + volume);
    }
}
