import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite os dados da conta\nNúmero: ");
        int numero = sc.nextInt();

        System.out.print("Dono: ");
        sc.nextLine();
        String dono = sc.nextLine();

        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble();

        System.out.print("Limite de saque: ");
        double saqueLimite = sc.nextDouble();
        System.out.println();

        Conta conta = new Conta(numero, dono, saldo, saqueLimite);

        System.out.print("Digite uma quantia para sacar: ");
        double saque = sc.nextDouble();

        try{
            conta.saque(saque);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }

        System.out.println("Novo saldo: " + conta.getSaldo());

        sc.close();
    }
}