public class DadosCobranca {

    private String banco;
    private String agencia;
    private String conta;
    private String metodoPagamentoPreferencial;

    public DadosCobranca(String banco, String agencia, String conta, String metodoPagamentoPreferencial) {
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.metodoPagamentoPreferencial = metodoPagamentoPreferencial;
    }
}
