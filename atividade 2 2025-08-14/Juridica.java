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

    public String getNome() {
        return nome;
    }
    public double getRenda() {
        return renda;
    }
    public int getFunc() {
        return func;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRenda(double renda) {
        this.renda = renda;
    }
    public void setFunc(int func) {
        this.func = func;
    }


}
