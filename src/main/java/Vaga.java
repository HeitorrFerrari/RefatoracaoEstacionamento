import java.time.LocalDateTime;

public class Vaga {

    private String codigo;
    private String setor;
    private boolean coberta;
    private boolean ocupada;

    private String nomeClienteReserva;
    private LocalDateTime horarioReserva;

    public Vaga(String codigo, String setor, boolean coberta, boolean ocupada,
                String nomeClienteReserva, LocalDateTime horarioReserva) {
        this.codigo = codigo;
        this.setor = setor;
        this.coberta = coberta;
        this.ocupada = ocupada;
        this.nomeClienteReserva = nomeClienteReserva;
        this.horarioReserva = horarioReserva;
    }

    public String descreverStatus() {

        if (ocupada && coberta) {
            return "ocupada e coberta";
        }

        if (ocupada) {
            return "ocupada";
        }

        if (coberta) {
            return "livre e coberta";
        }

        return "livre";
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isCoberta() {
        return coberta;
    }

    public void setCoberta(boolean coberta) {
        this.coberta = coberta;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public String getNomeClienteReserva() {
        return nomeClienteReserva;
    }

    public void setNomeClienteReserva(String nomeClienteReserva) {
        this.nomeClienteReserva = nomeClienteReserva;
    }

    public LocalDateTime getHorarioReserva() {
        return horarioReserva;
    }

    public void setHorarioReserva(LocalDateTime horarioReserva) {
        this.horarioReserva = horarioReserva;
    }
}