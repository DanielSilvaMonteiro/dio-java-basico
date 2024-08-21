public enum EstadosBrasileiros {
    SAO_PAULO("SP", "SÃO PAULO", 01),
    RIO_DE_JANEIRO("RJ", "RIO DE JANEIRO", 02),
    PIAUI("PI", "PIAUI", 03),
    PARANA("PR", "PARANÁ", 04),
    MARANHAO("MA", "MARANHÃO", 05);

    private String nome;
    private String sigla;
    private int ibge;

    private EstadosBrasileiros(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public int getIbge() {
        return ibge;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

}
