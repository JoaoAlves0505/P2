import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número do quarto: ");
        int quarto = sc.nextInt();

        System.out.print("Data do check-in (dd/mm/aaaa): ");
        sc.nextLine();
        String[] dataIn = sc.nextLine().split("/", 3);

        System.out.print("Data do check-out (dd/mm/aaaa): ");
        String[] dataOut = sc.nextLine().split("/", 3);

        LocalDate checkin = LocalDate.of(Integer.parseInt(dataIn[2]), Integer.parseInt(dataIn[1]),
                Integer.parseInt(dataIn[0]));
        LocalDate checkout = LocalDate.of(Integer.parseInt(dataOut[2]), Integer.parseInt(dataOut[1]),
                Integer.parseInt(dataOut[0]));

        Reserva reserva = null;

        try{
            reserva = new Reserva(quarto, checkin, checkout);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }

        System.out.println(reserva);

        System.out.println();

        System.out.println("Digite a data para atualizar a reserva:");
        System.out.print("Data do check-in (dd/mm/aaaa): ");
        dataIn = sc.nextLine().split("/", 3);

        System.out.print("Data do check-out (dd/mm/aaaa): ");
        dataOut = sc.nextLine().split("/", 3);

        checkin = LocalDate.of(Integer.parseInt(dataIn[2]), Integer.parseInt(dataIn[1]),
                Integer.parseInt(dataIn[0]));
        checkout = LocalDate.of(Integer.parseInt(dataOut[2]), Integer.parseInt(dataOut[1]),
                Integer.parseInt(dataOut[0]));

        reserva.atualizarDatas(checkin, checkout);

        System.out.println(reserva);

        sc.close();
    }
}