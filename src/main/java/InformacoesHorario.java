import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class InformacoesHorario {

    private final LocalDateTime horas;

    public InformacoesHorario(LocalDateTime horas) {
        this.horas = horas;
    }

    public boolean isEspecial () {

        return (horas.getDayOfWeek() == DayOfWeek.SATURDAY
                || horas.getDayOfWeek() == DayOfWeek.SUNDAY
                || horas.getHour() < 7
                || horas.getHour() >= 22);
    }

    public LocalDateTime horaOriginal () {
        return horas;
    }

    public String formatarDataHora() {
        return horas.getDayOfMonth() + "/"
                + horas.getMonthValue() + "/"
                + horas.getYear() + " "
                + horas.getHour() + ":"
                + String.format("%02d", horas.getMinute());
    }

}
