public class Conta {
    private int numero;
    private String dono;
    private double saldo;
    private double saqueLimite;

    public Conta(int numero, String dono, double saldo, double saqueLimite){
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
        this.saqueLimite = saqueLimite;
    }

    public void deposito(double quantia){
        saldo += quantia;
    }

    public void saque(double quantia){
        if(quantia > saqueLimite){
            throw new RuntimeException("Erro de saque: A quantia excedeu o limite de saque");
        }

        if(quantia > saldo){
            throw new RuntimeException("Erro de saque: Saldo insuficiente");
        }

        saldo -= quantia;
    }

    public double getSaldo() {
        return saldo;
    }
}
