public class Relacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;
        String nome_um = "Daniel";
        String nome_dois = "Daniel";
        String nome_tres = new String("Daniel");

        System.out.println(numero1 == numero2); // compara numeros
        System.out.println(nome_um == nome_dois); // compara tipos iguais
        System.out.println(nome_tres == nome_dois); // compara tipo com objeto
        System.out.println(nome_tres.equals(nome_dois)); // maneira certa de comparar objetos

        if (numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");

        if (numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");

        if (numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");

        if (numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");

        if (numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");
    }
}
