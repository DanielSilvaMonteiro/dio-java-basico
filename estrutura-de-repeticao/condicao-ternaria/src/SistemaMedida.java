public class SistemaMedida {
    public static void main(String[] args) {
        String medida = "G";

        switch (medida) {
            case "P":
                System.out.println("Pequena");
                break;
            case "M":
                System.out.println("Média");
                break;
            case "G":
                System.out.println("Grande");
                break;
            default:
                System.out.println("Indefinido");
        }

    }
}
