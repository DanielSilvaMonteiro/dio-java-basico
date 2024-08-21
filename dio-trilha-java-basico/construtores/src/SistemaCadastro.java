public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos", "123456789"); // atributos relevantes pra criacao de um atributo

        // definindo endereco do Marcos
        marcos.setEndereco("RUA DA MARIA");

        // como definir cpf Marcos?

        // como definir nome do Marcos?

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    }
}
