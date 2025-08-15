public class Juridica {
    private String nome;
    private double renda;
    private int func;

    public Juridica(String nome, double renda, int func) {
        this.nome = nome;
        this.renda = renda;
        this.func = func;
    }

    public double calcularImposto() {
        if(func > 10) {
            return renda * 0.14;
        }
        return renda * 0.16;
    }
}

