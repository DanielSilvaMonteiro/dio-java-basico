import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String candidatos[] = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};

        for (String candidato:candidatos) {
            tentarContato(candidato);
        }
    }

    public static void tentarContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativasRealizadas++;
            }else {
                System.out.println("Conseguimos contato com o Candidato " + candidato);
            }
        }while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu){
            System.out.println("Conseguimos contato com o Candidato " + candidato + " Na " + tentativasRealizadas + " tentativa");
        }else{
            System.out.println("Nao Conseguimos contato com o Candidato " + candidato + " Maximo de tentativas " + tentativasRealizadas);
        }
    }

    //metodo auxiliar
    public static  boolean atender(){
       return new Random().nextInt(3) == 1;
    }
    public static void imprimirSelecionados(){
        String candidatos[] = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};

        System.out.println("imprimindo com for o indice e o candidato");

        for (int indice = 0 ; indice < candidatos.length; indice++){
            System.out.println("Indice "+ (indice+1) + " Candidato " + candidatos[indice]);
        }

        System.out.println("imprimindo com for each");

        for (String candidato:candidatos) {
            System.out.println("Candidato selecionado " + candidato);
        }
    }

    public static void selecaoCandidatos(){
        String candidatos[] = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica","Fabricio", "Mirela", "Daniela", "Jorge"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O Cndidato " + candidato + " ,solicitou " + salarioPretendido + " de salario");
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " Foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    public static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    public static void analisarCandidato(double valorPretendido){
        double salarioBase = 2000.0;

        if(salarioBase > valorPretendido){
            System.out.println("Ligar para o Candidato");
        } else if (salarioBase == valorPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}