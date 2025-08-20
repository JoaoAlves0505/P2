import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class Reserva {
    private int quarto;
    private LocalDate checkin;
    private LocalDate checkout;

    public Reserva(int quarto, LocalDate checkin, LocalDate checkout){
        verifDatas(checkin, checkout);

        this.quarto = quarto;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public void verifDatas(LocalDate checkin, LocalDate checkout){
        if(ChronoUnit.DAYS.between(checkin, checkout) <= 0){
            throw new RuntimeException("Erro na reserva: A data do check-out deve ser posterior a data do check-in");
        }

        if(checkin.isBefore(LocalDate.now()) || checkout.isBefore(LocalDate.now())){
            throw new RuntimeException("Erro na reserva: As datas de reservar têm que ser datas futuras");
        }
    }

    public long duracao(){
        long noites = ChronoUnit.DAYS.between(checkin, checkout);
        return noites;
    }

    public void atualizarDatas(LocalDate checkin, LocalDate checkout){
        verifDatas(checkin, checkout);

        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return "Reserva: Quarto " + quarto + ", check-in: " + checkin.format(formato) + ", check-out: " +
                checkout.format(formato) + ", " + duracao() + " noites";
    }
}
