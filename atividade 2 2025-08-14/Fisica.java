public class Fisica {
    private String nome;
    private double renda;
    private double saude;

    public Fisica(String nome, double renda, double saude) {
        this.nome = nome;
        this.renda = renda;
        this.saude = saude;
    }

    public double calcularImposto() {
        double imposto = renda;

        if(renda < 20000) {
            imposto *= 0.15;
        }
        else {
            imposto *= 0.25;
        }

        if(saude > 0) {
            if (saude * 0.5 > imposto) {
                return 0;
            }
            return imposto - (saude * 0.5);
        }
        return imposto;
    }
}
