public class excedeLimite extends Exception {

    public excedeLimite(String string) {
        // TODO Auto-generated constructor stub

    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        // return super.getMessage();
        return "Numero maximo de candidatos selecionados";
    }

}
