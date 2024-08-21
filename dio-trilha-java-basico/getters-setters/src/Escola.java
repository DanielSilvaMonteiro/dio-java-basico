public class Escola {
    public static void main(String[] args) throws Exception {
        Aluno daniel = new Aluno();

        /*
         * daniel.nome = "Daniel";
         * daniel.idade = 32;
         * 
         * System.out.println("O Aluno " + daniel.nome + " tem " + daniel.idade +
         * " anos");
         */

        daniel.setNome("Daniel");
        daniel.setIdade(32);

        System.out.println("O Aluno " + daniel.getNome() + " tem " + daniel.getIdade() + " anos");
    }
}
